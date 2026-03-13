package com.vendingmachine;

import com.vendingmachine.core.VendingMachine;
import com.vendingmachine.domain.Coin;
import com.vendingmachine.domain.Item;

public class App {
public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        // 1. Restock the machine
        machine.getItemInventory().add(Item.COKE, 2);
        machine.getItemInventory().add(Item.WATER, 1);
        System.out.println("--- Machine Restocked ---");

        // --- Scenario 1: Successful Purchase ---
        System.out.println("\n--- Scenario 1: Buy a Coke ---");
        machine.insertCoin(Coin.QUARTER); // 25
        machine.insertCoin(Coin.QUARTER); // 50
        machine.insertCoin(Coin.QUARTER); // 75
        machine.insertCoin(Coin.QUARTER); // 100
        machine.insertCoin(Coin.QUARTER); // 125
        machine.insertCoin(Coin.QUARTER); // 150
        machine.selectItem(Item.COKE);
        machine.dispenseItem();

        // --- Scenario 2: Insufficient Funds ---
        System.out.println("\n--- Scenario 2: Insufficient Funds ---");
        machine.insertCoin(Coin.QUARTER); // 25
        machine.selectItem(Item.WATER);   // Costs 100, will fail

        // --- Scenario 3: Cancel and Refund ---
        System.out.println("\n--- Scenario 3: Cancel Transaction ---");
        machine.cancelAndRefund();        // Refunds the 25 cents

        // --- Scenario 4: Out of Stock ---
        System.out.println("\n--- Scenario 4: Out of Stock ---");
        machine.insertCoin(Coin.QUARTER); // 25
        machine.insertCoin(Coin.QUARTER); // 50
        machine.insertCoin(Coin.QUARTER); // 75
        machine.insertCoin(Coin.QUARTER); // 100
        machine.selectItem(Item.WATER);
        machine.dispenseItem();           // Successfully buys the last water
        
        System.out.println("\nAttempting to buy Water again...");
        machine.insertCoin(Coin.QUARTER);
        machine.insertCoin(Coin.QUARTER);
        machine.insertCoin(Coin.QUARTER);
        machine.insertCoin(Coin.QUARTER);
        machine.selectItem(Item.WATER);   // Will hit the out-of-stock check
        machine.cancelAndRefund();        // Get money back
    }
}