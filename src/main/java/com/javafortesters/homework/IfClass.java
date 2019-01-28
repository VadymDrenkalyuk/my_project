package com.javafortesters.homework;

public class IfClass {

    public static boolean isVariableEqualsFive(int var){
        boolean result = (var == 5);
        return result;
    }

    public static void main(String[] args) {
        int var = 5;
        if ( isVariableEqualsFive(var) ){
            System.out.println("ALL OK");
        } else {
            System.out.println("ALL NOT OK");
        }
    }
}
