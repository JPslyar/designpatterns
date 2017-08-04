package com.design.factory;

import com.design.factory.bean.MailSender;
import com.design.factory.bean.SmsSender;
import com.design.factory.bean.impl.Sender;

public class NormalSenderFactory {
	  public Sender produce(String type) {  
	        if ("mail".equals(type)) {  
	            return new MailSender();  
	        } else if ("sms".equals(type)) {  
	            return new SmsSender();  
	        } else {  
	            System.out.println("请输入正确的类型!");  
	            return null;  
	        }  
	    }  
}

