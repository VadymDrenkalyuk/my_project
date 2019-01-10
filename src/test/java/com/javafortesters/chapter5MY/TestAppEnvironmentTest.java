package com.javafortesters.chapter5MY;

import com.javafortesters.domainobjectMY.TestAppEnvir;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
       Assert.assertEquals("the URL isn't match expected", "192.168.37.3:80", TestAppEnvir.getUrl());
    }

    @Test
    public void canGEtDomainAndPortStatically(){
        Assert.assertEquals("reterns just Domain", "192.168.37.3", TestAppEnvir.DOMAIN);
        Assert.assertEquals("reterns just Port", "80", TestAppEnvir.PORT);
    }
}
