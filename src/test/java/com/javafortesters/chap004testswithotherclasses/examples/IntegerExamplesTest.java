package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        Integer five = new Integer("5");
        System.out.println(Integer.valueOf("A"));
        assertEquals("intValue returns int 4", 4, four.compareTo(five));
        assertEquals("intValue returns " + five, 5, five.intValue());
        Integer six = 6;
        assertEquals("Autoboxing assignment for 6", 6, six.intValue());
        Integer seven = new Integer(7);
        assertEquals("intValue returns int 7", 7, seven.intValue());

    }

    @Test
    public void hex() {
               System.out.println(Integer.toHexString(21));
              System.out.println(Integer.MAX_VALUE);
              System.out.println(Integer.MIN_VALUE);

    }

    @Test
    public void hexTwo() {
        String myhex = Integer.toHexString(11);

        System.out.println(myhex);
    }
}

