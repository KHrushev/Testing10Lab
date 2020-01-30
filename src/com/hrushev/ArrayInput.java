package com.hrushev;

import java.util.Scanner;

public class ArrayInput {
    private Scanner scanner = new Scanner(System.in);

    public float[] input() {
        int size = 0;
        float array[];

        System.out.println("Please enter size for an array:");
        while (!scanner.hasNextInt()) {
            System.out.println("You should enter an integer.");
            scanner.next();
        }
        size = scanner.nextInt();

        array = new float[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter array's " + (i+1) + " element.");
            while (!scanner.hasNextFloat()) {
                System.out.println("You should enter a float value.");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        
        return array;
    }
}
