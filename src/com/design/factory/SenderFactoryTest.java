package com.design.factory;

import com.design.factory.bean.MailSenderFactory;
import com.design.factory.bean.impl.Provider;
import com.design.factory.bean.impl.Sender;

public class SenderFactoryTest {
	public static void main(String[] args) {  
		//普通工厂模式
        NormalSenderFactory factory = new NormalSenderFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
        //多方法工厂模式
        MutilSenderFactory mutilFactory = new MutilSenderFactory();  
        sender = mutilFactory.produceMail();  
        sender.Send();  
        //静态工厂模式
        sender = StaticSenderFactory.produceMail();  
        sender.Send();  
        
        //抽象工厂模式(扩展性好)
        Provider provider = new MailSenderFactory();  
        sender = provider.produce();  
        sender.Send();
    }  
}
