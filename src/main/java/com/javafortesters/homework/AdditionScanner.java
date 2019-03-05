package com.javafortesters.homework;

import java.util.Scanner;

import static com.javafortesters.homework.AdditionConsole.test;


public class AdditionScanner {

    //static int test = 0;

    public static void main(String[] args) {
        //int test = 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number");
        int fNum = myObj.nextInt();
        System.out.println("Enter second number");
        int sNum = myObj.nextInt();
        int result = fNum + sNum;
        System.out.println("result is: " + result);
        /*test();

        AdditionConsole vasya = new AdditionConsole();
        AdditionConsole petya = new AdditionConsole(200, "CEO");
        AdditionConsole kolya = new AdditionConsole(3000, "CTO");

        System.out.println("Vasya's jobTitle=" + vasya.jobTitle + " and salary=" + vasya.salary);
        System.out.println("petya's jobTitle=" + petya.jobTitle + " and salary=" + petya.salary);
        System.out.println("kolya's jobTitle=" + kolya.jobTitle + " and salary=" + kolya.salary);

        vasya.salary = 500;
        vasya.jobTitle = "Sales";

        AdditionConsole ashot = new AdditionConsole();

        System.out.println("\nVasya's jobTitle=" + vasya.jobTitle + " and salary=" + vasya.salary);
        System.out.println("petya's jobTitle=" + petya.jobTitle + " and salary=" + petya.salary);
        System.out.println("kolya's jobTitle=" + kolya.jobTitle + " and salary=" + kolya.salary);
        System.out.println("ashot jobTitle=" + ashot.jobTitle + " and salary=" + ashot.salary);
        */
    }

}