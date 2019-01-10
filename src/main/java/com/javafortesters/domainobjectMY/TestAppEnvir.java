package com.javafortesters.domainobjectMY;

public class TestAppEnvir {

    public static final String DOMAIN = "192.168.37.3";
    public static final String PORT = "80";

    public static String getUrl() {
        return DOMAIN + ":" + PORT;
    }


}
