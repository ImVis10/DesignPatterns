package com.vendingmachine.state;

import com.vendingmachine.core.VendingMachine;
import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;

public class HasMoneyState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Inserted: " + coin + " (" + coin.getValue() + " cents)");
        machine.addBalance(coin.getValue());
    }

    @Override
    public void selectItem(VendingMachine machine, Item item) {
        System.out.println("Selecting item: " + item);
        if (!machine.getItemInventory().hasItem(item)) {
            System.out.println("Selected item is out of stock. Please select another item.");
            return;
        }
        if (machine.getCurrentBalance() < item.getPrice()) {
            System.out.println("Insufficient balance. Please insert more coins.");
            return;
        }

        machine.setSelectedItem(item);
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        // Cannot dispense item until it's selected
        System.out.println("Please select an item before dispensing.");
    }

    @Override
    public void cancelAndRefund(VendingMachine machine) {
        int refundAmount = machine.getCurrentBalance();
        if (refundAmount > 0) {
            System.out.println("Transaction cancelled. Refunding: " + refundAmount + " cents");
            machine.resetBalance();
        } else {
            System.out.println("No coins to refund.");
        }
        machine.setState(machine.getNoCoinState());
    }    
}
