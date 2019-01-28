package com.javafortesters.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] anArray = {10, 9, 7, 9, 3, 4, 6, 5};
        String intAnArrayString = Arrays.toString(anArray);
        System.out.println(intAnArrayString);

        for (int i = 0; i < anArray.length; i++) {
            if (i % 2 != 0) {
                anArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(anArray));
    }
}
