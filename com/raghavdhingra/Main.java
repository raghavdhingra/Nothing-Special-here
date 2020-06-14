package com.raghavdhingra;

public class Main {

    public static void main(String[] args) {
        Array number = new Array(3);
        number.insert(5);
        number.insert(6);
        number.insert(8);
        number.insert(9);
        number.insert(10);
        number.insert(11);
        number.removeAt(5);
        number.insert(8);
    }
}
