package com.javafortesters.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task16 {
    static Map<String, List> map;

    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);
        map = new HashMap<>();

        map.put("even", evenList);
        map.put("odd", oddList);

        map.get("even").contains(5);
        map.get("odd").contains(18);

        System.out.println(isNumberPresent(105456));

    }

    public static boolean isNumberPresent(int n) {
        if (n % 2 == 0) {
            return map.get("even").contains(n);
        } else {
            return map.get("odd").contains(n);
        }
    }



}
