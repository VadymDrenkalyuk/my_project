package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void canConstructANewUser(){
        User buser = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        Assert.assertEquals("default username expected", "username", user.getUsername());
        Assert.assertEquals("default password expected", "password", user.getPassword());

    }

    @Test
    public void userHasNonDefaultUsernameAndPassword (){
        User auser = new User();
        Assert.assertEquals("non-default username", "bob", auser.username);
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rd");
        Assert.assertEquals("given username expected", "admin", user.getUsername());
        Assert.assertEquals("given password expected", "pA55w0rd", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword ("PaZZwor6");
        Assert.assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }
}
