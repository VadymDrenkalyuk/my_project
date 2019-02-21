package com.javafortesters.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task16 {
    public static void main(String[] args) {
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);
        Map<String, List> map = new HashMap<>();

        map.put("even", evenList);
        map.put("odd", oddList);

        System.out.println(map.get("even").contains(5));
        System.out.println(map.get("odd").contains(9));

    }
}
