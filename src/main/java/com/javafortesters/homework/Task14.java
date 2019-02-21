package com.javafortesters.homework;

import java.util.Arrays;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
}

