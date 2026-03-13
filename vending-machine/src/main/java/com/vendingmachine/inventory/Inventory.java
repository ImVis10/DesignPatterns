package com.vendingmachine.inventory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory<T> {
    private final Map<T, Integer> inventory = new ConcurrentHashMap<>();
    
    public int getQuantity(T item) {
        return inventory.getOrDefault(item, 0);
    }

    public void add(T item, int quantity) {
        inventory.compute(item, (k, v) -> (v == null) ? quantity : v + quantity);
    }

    public void deduct(T item) {
        inventory.compute(item, (k, v) -> {
            if (v == null || v <= 0) {
                throw new IllegalStateException("Item is out of stock");
            }
            return v - 1;
        });
    }

    public boolean hasItem(T item) {
        return getQuantity(item) > 0;
    }
}
