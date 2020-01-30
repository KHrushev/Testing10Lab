package com.hrushev;

public class Main {

    public static void main(String[] args) {
        Filter filter = new Filter();
        FilterOutput output = new FilterOutput();
        ArrayInput input = new ArrayInput();
        Sorter sorter = new Sorter();

        float[] array = input.input();
        array = filter.filter(array);

        output.print(array);

        System.out.println("\nSorted array:");
        output.print(sorter.sort(array));
    }
}
