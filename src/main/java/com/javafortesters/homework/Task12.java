package com.javafortesters.homework;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] Array = {4, 3, 1, 2, 5};
        String ArrayString = Arrays.toString(Array);
        System.out.println(ArrayString);

        int[] Array2 = {2, 3, 1, 5, 2};
        String Array2String = Arrays.toString(Array2);
        System.out.println(Array2String);

        double sum1 = 0;
        for (int i = 0; i < Array.length; i++) {
            sum1 += Array[i];
        }
        double average = sum1 / Array.length;

        double sum2 = 0;
        for (int i = 0; i < Array2.length; i++) {
            sum2 += Array2[i];
        }
        double average2 = sum2 / Array2.length;
        if (average > average2) {
            System.out.println("The average of the Array is bigger than average of the Array2");
        } else if (average < average2) {
            System.out.println("The average of the Array2 is bigger than average of the Array");
        } else if (average == average2) {
            System.out.println("The average of Array is equal to the average of anArray");
        }
    }
}
