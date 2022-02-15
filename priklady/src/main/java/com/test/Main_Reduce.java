package com.test;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class Main_Reduce {

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println(a.add(b)); // 0.3

        double sum = DoubleStream.of(0.1, 0.2)
                .sum();
        System.out.println(sum); // FUCK!!! 0.30000000000000004

        Optional<BigDecimal> bdSum = DoubleStream.of(0.1, 0.2)
                .mapToObj(BigDecimal::valueOf)
                .reduce(BigDecimal::add);
        System.out.println(bdSum.get()); // 0.3
    }
}
