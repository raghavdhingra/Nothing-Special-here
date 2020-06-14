package com.raghavdhingra;

public class Main {

    public static void main(String[] args) {
        Array number = new Array(3);
        number.insert(5);
        number.insert(6);
        number.insert(8);
        number.print();
        number.insert(10);
        number.removeAt(1);
        number.print();
        number.removeAt(1);
        number.insert(5);
        number.print();
    }
}
