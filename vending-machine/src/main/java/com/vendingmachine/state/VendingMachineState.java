package com.vendingmachine.state;

import com.vendingmachine.core.VendingMachine;
import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;

public interface VendingMachineState {
    void insertCoin(VendingMachine machine, Coin coin);
    void selectItem(VendingMachine machine, Item item);
    void dispenseItem(VendingMachine machine);
    void cancelAndRefund(VendingMachine machine);
}
