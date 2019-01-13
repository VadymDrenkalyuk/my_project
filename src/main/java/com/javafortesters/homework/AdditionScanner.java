package com.javafortesters.homework;

import java.util.Scanner;

public class AdditionScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number");
        int fNum = myObj.nextInt();
        System.out.println("Enter second number");
        int sNum = myObj.nextInt();
        int result = fNum + sNum;
        System.out.println("result is: " + result);
    }
}