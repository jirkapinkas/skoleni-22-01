package com.test;

public class Main_01_Pool {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        Integer c = Integer.valueOf(10);

        System.out.println(a == b); // true
        System.out.println(a == c); // true
    }

}
