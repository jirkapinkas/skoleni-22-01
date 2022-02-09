package com.test;

import com.test.bean.Item;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main_Sort {

    public static void main(String[] args) {
        List list = List.of(
                Item.builder().name("Rex").price(1).build(),
                Item.builder().name("Max").price(1).build(),
                Item.builder().name("Bóbik").price(1).build(),
                Item.builder().name("Á").price(1).build(),
                Item.builder().name("A").price(1).build(),
                Item.builder().name("Bóbina").price(2).build(),
                Item.builder().name("Dášenka").price(2).build()
        );

        Collator collator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
        list.stream()
                .sorted(Comparator.comparing(Item::getPrice)
                        .thenComparing(Item::getName, collator))
                .forEach(System.out::println);
    }

}
