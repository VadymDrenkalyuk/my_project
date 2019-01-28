package com.javafortesters.chapter5MY;

import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvTest {
    @Test
    public void canGetURLStatically(){
        Assert.assertEquals("The URL doesn't match", "192.168.37.2:80", TestAppEnv2.getUrl());
    }

    @Test
    public void canGetDomain(){
        Assert.assertEquals("Just the Domain", "192.168.37.2", TestAppEnv2.DOMAIN);
    }

    @Test
    public void canGetPort() {
        Assert.assertEquals("Just the port", "80", TestAppEnv2.PORT);
    }

}
