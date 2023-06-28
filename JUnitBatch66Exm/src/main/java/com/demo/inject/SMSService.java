package com.demo.inject;

import java.sql.SQLOutput;

public class SMSService implements Service{

    @Override
    public boolean send(String msg) {
        System.out.println("From SMS send");
        return true;
    }
}
