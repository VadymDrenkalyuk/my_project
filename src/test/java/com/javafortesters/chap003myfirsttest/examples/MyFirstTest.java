package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyFirstTest {

    public int addTwoNumbers(int a, int b) {
        int answer = a + b;
        return answer;
    }

    public int addTwoNumbers(String a, String b) {
        int Aa = Integer.parseInt(a);
        int Bb = Integer.parseInt(b);

        int answer = Aa + Bb;
        return answer;
    }


    @Test
    public void testAddTwoNumbers() {

        int sumResult = addTwoNumbers(6, 98);

        assertEquals("a+b=12", 12, sumResult);
    }

    @Test
    public void testAddTwoNumbers2() {

        int sumResult = addTwoNumbers(3, 7);

        assertEquals("sum value is not valid, it equals " +sumResult, 11, sumResult);
    }



    @Test
    public void canSubtractTwoMinusTwo() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canMultiplyTwoPlusTwo() {
        int answer = 2 * 2;
        assertEquals("2*2=4", 10, answer);
    }

    @Test
    public void canDivideTwoOnTwo() {
        int answer = 2 / 2;
        assertEquals("2/2=1", 1, answer);
    }

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void whenClassNameHasNotTestInItThenItIsNotRun(){
        assertTrue("whenClassNameHasNotTestInItThenItIsNotRun", false);
    }

}

