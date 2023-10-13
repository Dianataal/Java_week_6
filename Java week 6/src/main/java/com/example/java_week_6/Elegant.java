package com.example.java_week_6;

public class Elegant {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2, -4, 23, 54, };
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}