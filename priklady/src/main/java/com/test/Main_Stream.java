package com.test;

import com.test.bean.Item;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main_Stream {

    public static void main(String[] args) {
//        Stream.generate(UUID::randomUUID)
//                .forEach(System.out::println);
//        Stream.generate(() -> UUID.randomUUID())
//                .forEach(System.out::println);

        Item item1 = new Item("A", 1, "D");
        Item item2 = item1;

        item2.setName("B");
        System.out.println(item1);
        System.out.println(item2);
    }

}
