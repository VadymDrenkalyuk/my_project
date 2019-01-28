package com.javafortesters.homework;

public class Task10 {
    public static void main(String[] args) {
        int[] anArray = {1, 2, 7, 9, 3, 4, 6, 5, 2, 8, 1, 5, 7, 4, 3};
        for (int item : anArray) {
            System.out.println(item);
        }
        int count = 0;
        for (int item : anArray){
            if (item%2==0){
                count++;
            }
        }
        System.out.println("The count of evens is " + count);
    }
}
