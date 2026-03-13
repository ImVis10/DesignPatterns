package com.vendingmachine.state;

import com.vendingmachine.core.VendingMachine;
import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;

public class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Inserted: " + coin + " (" + coin.getValue() + " cents)");
        machine.addBalance(coin.getValue());
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void selectItem(VendingMachine machine, Item item) {
        // Cannot select item without inserting coin
        System.out.println("Please insert coins before selecting an item.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        // Cannot dispense item without inserting coin
        System.out.println("Please insert coins before dispensing an item.");
    }

    @Override
    public void cancelAndRefund(VendingMachine machine) {
        // No coins to refund
        System.out.println("No coins inserted to refund.");
    }
}
