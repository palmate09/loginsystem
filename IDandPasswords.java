package com.LoginSystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("datta" , "pizza");
        logininfo.put("shubham " , "PASSWORD");
        logininfo.put("shivam" , "abc123");

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
