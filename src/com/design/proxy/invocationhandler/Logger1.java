package com.design.proxy.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Logger1{
	//创造一个代理类
	public Object objectTransferProxy(final Object obj, final String arg){
		//newProxyInstance()的第三个参数需实现InvocationHandler
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
			//该方法在被代理类obj的每个方法调用前后添加日志,可以单独抽取出来
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
		System.out.println("----------方法调用前----"+System.currentTimeMillis()+"-------"+arg);
	}
	
	public void afterLog(String arg){
		System.out.println("----------方法调用后----"+System.currentTimeMillis()+"-------"+arg);
	}

	
	public static void main(String[] args) {
		PersonDao dao = (PersonDao)new Logger1().objectTransferProxy(new PersonService(), "ddd");
		dao.say("hahahha");
	}
}
