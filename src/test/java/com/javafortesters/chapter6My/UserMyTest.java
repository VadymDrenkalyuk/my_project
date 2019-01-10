package com.javafortesters.chapter6My;


import com.javafortesters.domainentitiesMY.UserMy;
import org.junit.Assert;
import org.junit.Test;

public class UserMyTest {
    @Test
    public void canGetDefaultUsernameAndPassword() {
        UserMy user = new UserMy();
        Assert.assertEquals("the username is not expected", "username", user.getUsername());
        Assert.assertEquals("the password is not expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        UserMy user2 = new UserMy("Bob", "PaZZword");
        Assert.assertEquals("the name isn't bob", "Bob", user2.getUsername());
        Assert.assertEquals("the name isn't bob", "PaZZword", user2.getPassword());
        user2.setPassword("sda");

    }

    @Test
    public void canSetPasswordAfterConstructed(){
        UserMy user3 = new UserMy();
        user3.setPassword("SetPass");
        Assert.assertEquals("set pass isnt expected", "SetPass", user3.getPassword());
    }

 }
