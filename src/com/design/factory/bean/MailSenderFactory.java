package com.design.factory.bean;

import com.design.factory.bean.impl.Provider;
import com.design.factory.bean.impl.Sender;

public class MailSenderFactory implements Provider{
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}
