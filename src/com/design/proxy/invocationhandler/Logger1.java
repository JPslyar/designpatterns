package com.design.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Logger1{
	//����һ��������
	public Object objectTransferProxy(final Object obj, final String arg){
		//newProxyInstance()�ĵ�����������ʵ��InvocationHandler
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
			//�÷����ڱ�������obj��ÿ����������ǰ�������־,���Ե�����ȡ����
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				beforeLog(arg);
				Object result = method.invoke(obj, args);
				afterLog(arg);
				return result;
			}
		});
	}
	
	public void beforeLog(String arg){
		System.out.println("----------��������ǰ----"+System.currentTimeMillis()+"-------"+arg);
	}
	
	public void afterLog(String arg){
		System.out.println("----------�������ú�----"+System.currentTimeMillis()+"-------"+arg);
	}

	
	public static void main(String[] args) {
		PersonDao dao = (PersonDao)new Logger1().objectTransferProxy(new PersonService(), "ddd");
		dao.say("hahahha");
	}
}
