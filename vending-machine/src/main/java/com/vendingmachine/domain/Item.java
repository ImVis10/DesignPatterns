package com.vendingmachine.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Item {
    COKE(150), PEPSI(150), WATER(100), SNACK(200);
    private final int price;
}
