package com.example.demo.Models;

public class AuthenticationRequest {
    private String username;
    private String password;
    AuthenticationRequest(String username,String password){
        this.username = username;
        this.password = password;
    }
    public String getuserName(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    
}

