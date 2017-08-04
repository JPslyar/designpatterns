package com.design.factory;

import com.design.factory.bean.MailSender;
import com.design.factory.bean.SmsSender;
import com.design.factory.bean.impl.Sender;

public class MutilSenderFactory {
	 public Sender produceMail(){  
         return new MailSender();  
     }  
       
     public Sender produceSms(){  
         return new SmsSender();  
     }  
}
