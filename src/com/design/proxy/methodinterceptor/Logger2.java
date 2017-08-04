package com.design.proxy.methodinterceptor;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class Logger2{
	//创造一个代理类
	public Object objectTransferProxy(Object obj){
      Enhancer en = new Enhancer();
      en.setSuperclass(obj.getClass());
      //最好抽取出来
      en.setCallback(new MethodInterceptor() {
		public Object intercept(Object obj, Method method, Object[] args,
				MethodProxy proxy) throws Throwable {
			beforeLog();
			Object result = proxy.invokeSuper(obj, args);
			afterLog();
			return result;
		}
	  });
	  return en.create();
	}
	
	public void beforeLog(){
		System.out.println("----------方法调用前----"+System.currentTimeMillis()+"-------");
	}
	
	public void afterLog(){
		System.out.println("----------方法调用后----"+System.currentTimeMillis()+"-------");
	}

	
	public static void main(String[] args) {
		PersonDao dao = (PersonDao)new Logger2().objectTransferProxy(new PersonService());
		dao.say("hahahha");
	}
}
