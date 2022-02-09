package com.test;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main_Lambda {

    public static void main(String[] args) {
        // inner / anonymous class
        IntStream.range(0, 100)
                .forEach(new IntConsumer() {
                    @Override
                    public void accept(int i) {
                        System.out.println(i);
                    }
                });

        // funkcionalni interface lze alternativne zapsat pomoci lambda vyrazu
        IntStream.range(0, 100)
                .forEach((int i) -> {
                        System.out.println(i);
                    });

        IntStream.range(0, 100)
                .forEach((i) -> {
                    System.out.println(i);
                });

        IntStream.range(0, 100)
                .forEach(i -> {
                    System.out.println(i);
                });

        IntStream.range(0, 100)
                .forEach(i -> System.out.println(i));

        // method reference
        IntStream.range(0, 100)
                .forEach(System.out::println);

    }

}
