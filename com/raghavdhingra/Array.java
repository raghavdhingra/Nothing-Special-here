package com.raghavdhingra;

import java.util.Arrays;

public class Array {
    private int[] numberArray;
    private int count;

    public Array(int length){
        numberArray = new int[length];
    }

    public void print(){
        System.out.println(Arrays.toString(numberArray));
    }

    public void removeAt(int index){

        for (int i=index;i<count;i++){
            numberArray[i] = numberArray[i+1];
        }
        count--;
    }

    public void insert(int num){
        if (numberArray.length == count){
            int[] newArr = new int[count*2];
            for (int i=0;i<count;i++){
                newArr[i] = numberArray[i];
            }
            numberArray = newArr;
        }
        numberArray[count++] = num;
    }
}
