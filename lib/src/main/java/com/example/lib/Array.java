package com.example.lib;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[] = {5, 7, 4, 1, 3};
        int i, j;

        System.out.println("Original Array");
        for (i = 0; i < 4; i++) {
            System.out.println(" " + a[i]);
        }
        int temp;
        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 4; j++) {
                if (a[i] <  a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }
        }

        System.out.print("Array");
        for (i = 0; i < 4; i++)
        {
            System.out.println(" " + a[i]);
        }

    }
}
