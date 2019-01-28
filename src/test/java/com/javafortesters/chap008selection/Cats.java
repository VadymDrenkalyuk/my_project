package com.javafortesters.chap008selection;

import org.junit.Assert;
import org.junit.Test;

public class Cats {
    @Test
    public void catOrCats() {
        int numberOfCats = 1;
        Assert.assertEquals("1 == numberOfCats", "cat", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public void catsAsMethod(){
        Assert.assertEquals("1==cat", "cat", catOrCats(2));
    }

    @Test
    private String catOrCats( int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }
}
