package com.vendingmachine.core;

import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;
import com.vendingmachine.inventory.Inventory;
import com.vendingmachine.state.DispensingState;
import com.vendingmachine.state.HasMoneyState;
import com.vendingmachine.state.NoCoinState;
import com.vendingmachine.state.VendingMachineState;

public class VendingMachine {
    private VendingMachineState state;
    private final Inventory<Item> itemInventory;
    private int currentBalance;
    private Item selectedItem;

    private final VendingMachineState noCoinState = new NoCoinState();
    private final VendingMachineState hasMoneyState = new HasMoneyState();
    private final VendingMachineState dispensingState = new DispensingState();

    public VendingMachine() {
        this.state = noCoinState;
        this.itemInventory = new Inventory<>();
        this.currentBalance = 0;
        this.selectedItem = null;
    }

    public void insertCoin(Coin coin) {
        state.insertCoin(this, coin);
    }

    public void selectItem(Item item) {
        state.selectItem(this, item);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void cancelAndRefund() {
        state.cancelAndRefund(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public VendingMachineState getNoCoinState() { return noCoinState; }
    public VendingMachineState getHasMoneyState() { return hasMoneyState; }
    public VendingMachineState getDispensingState() { return dispensingState; }

    // Internal machine operations
    public Inventory<Item> getItemInventory() { return itemInventory; }
    public void addBalance(int amount) { this.currentBalance += amount; }
    public int getCurrentBalance() { return currentBalance; }
    public void resetBalance() { this.currentBalance = 0; }
    public void setSelectedItem(Item item) { this.selectedItem = item; }
    public Item getSelectedItem() { return selectedItem; }
}
