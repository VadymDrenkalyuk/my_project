package com.javafortesters.homework;

public class AdditionConsole {

    public static void test(){
        System.out.println("This is me");
    }

    AdditionConsole(int salary, String jobTitle){
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    AdditionConsole(){

    }

    public int salary = 0;
    public String jobTitle = "dev";

    public static void main(String[] args) {
        String c = args[0];
        String d = args[1];
        int a = Integer.parseInt(c);
        int b = Integer.parseInt(d);
        int result = a+b;
        System.out.println(result);
    }
}
