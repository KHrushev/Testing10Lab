package com.hrushev;

public class FilterOutput {

    public void print(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array[" + (i) + "]=[" + array[i] + "]\t");
        }
        System.out.println("");
    }
}
