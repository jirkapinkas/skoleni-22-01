package com.test.bean;

public class Main {

    public static void main(String[] args) {
        Item item = Item.builder()
                .name("stuff")
                .price(123)
                .build();
    }

}
