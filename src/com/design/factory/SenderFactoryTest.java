package com.design.factory;

import com.design.factory.bean.MailSenderFactory;
import com.design.factory.bean.impl.Provider;
import com.design.factory.bean.impl.Sender;

public class SenderFactoryTest {
	public static void main(String[] args) {  
		//��ͨ����ģʽ
        NormalSenderFactory factory = new NormalSenderFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
        //�෽������ģʽ
        MutilSenderFactory mutilFactory = new MutilSenderFactory();  
        sender = mutilFactory.produceMail();  
        sender.Send();  
        //��̬����ģʽ
        sender = StaticSenderFactory.produceMail();  
        sender.Send();  
        
        //���󹤳�ģʽ(��չ�Ժ�)
        Provider provider = new MailSenderFactory();  
        sender = provider.produce();  
        sender.Send();
    }  
}
