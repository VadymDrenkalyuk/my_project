package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Assert;
import org.junit.Test;

import static com.javafortesters.domainobject.TestAppEnv.DOMAIN;
import static com.javafortesters.domainobject.TestAppEnv.PORT;
import static com.javafortesters.domainobject.TestAppEnv.getUrl;


public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        Assert.assertEquals("Return Hard Coded URL", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Just the domain", "192.123.0.3", DOMAIN);
        Assert.assertEquals( "Just the port", "67", PORT);

    }
}


