package com.design.factory.bean;

import com.design.factory.bean.impl.Provider;
import com.design.factory.bean.impl.Sender;

public class SmsSenderFactory implements Provider{
   @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}
