package com.javafortesters.homework;

import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
           for (Integer num : numbers){
            if (num%2 != 0){
            System.out.println(num);
            }
        }
    }
}
