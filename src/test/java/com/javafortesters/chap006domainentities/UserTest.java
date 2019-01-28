package com.javafortesters.chap006domainentities;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void canConstructNewUser(){
        User user = new User();
        Assert.assertEquals("username is expected", "username", user.getUsername());
        Assert.assertEquals("password is expected", "password", user.getPassword());
    }

    @Test
    public void canConstructNewUserWithUsernameAndPassword(){
        User user2 = new User("secondUser", "paZZword");
        Assert.assertEquals("secondUser is expected", "secondUser", user2.getUsername());
        Assert.assertEquals("paZZword is expected", "paZZword", user2.getPassword());
    }

    @Test
    public void canChangePasswordAfterConstruct(){
        User user3 = new User("user3", "password");
        user3.setPassword("changedPassword");
        Assert.assertEquals("changedPassword is expected", "changedPassword", user3.getPassword());
    }

}
