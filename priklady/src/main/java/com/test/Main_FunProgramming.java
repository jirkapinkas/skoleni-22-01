package com.test;

import java.util.function.Function;
import java.util.stream.IntStream;

// funkcionalni interface = interface s PRAVE JEDNOU abstraktni metodou
@FunctionalInterface
interface I {
    void stuff();
    // od Java 8:
    static void stuff2() {

    }
    // od Java 8:
    default void stuff3() {

    }
    // od Java 11:
    private static void stuff5() {

    }
    // od Java 11:
    private void stuff4() {

    }
}

public class Main_FunProgramming {

    public static void main(String[] args) {

        int counter = 0;

//        IntStream.range(0,100)
//                .forEach(i -> {
////                    System.out.println(i);
//                    counter += i;
//                });

        counter = IntStream.range(0,100).sum();

        System.out.println(counter);
    }

}
