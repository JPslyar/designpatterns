package com.design.factory;

import com.design.factory.bean.MailSender;
import com.design.factory.bean.SmsSender;
import com.design.factory.bean.impl.Sender;

public class StaticSenderFactory {
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
