package com.javafortesters.domainentitiesMY;

public class UserMy {
    private String username;
    private String password;

/*    public UserMy(){
        username = "username";
        password = "password";
    }*/

    public UserMy(){
       this("username", "password");
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public UserMy(String username, String password){
        this.username = username;
        this.password = password;

    }

    public void setPassword(String password){
        this.password = password;
    }

}
