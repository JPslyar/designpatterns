package com.design.factory.bean;

import com.design.factory.bean.impl.Sender;

public class SmsSender implements Sender {  
	  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
} 