package com.vendingmachine.state;

import com.vendingmachine.core.VendingMachine;
import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;

public class DispensingState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        // Cannot insert coin while dispensing
        System.out.println("Currently dispensing an item. Please wait.");
    }

    @Override
    public void selectItem(VendingMachine machine, Item item) {
        // Cannot select item while dispensing
        System.out.println("Currently dispensing an item. Please wait.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        Item item = machine.getSelectedItem();
        machine.getItemInventory().deduct(item);
        int change = machine.getCurrentBalance() - item.getPrice();
        System.out.println("Dispensing item: " + item);
        if (change > 0) {
            System.out.println("Returning change: " + change + " cents");
        }
        machine.resetBalance();
        machine.setSelectedItem(null);
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void cancelAndRefund(VendingMachine machine) {
        // Cannot cancel while dispensing
        System.out.println("Currently dispensing an item. Cannot cancel now.");
    }

}
