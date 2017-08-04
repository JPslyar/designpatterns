package com.design.proxy.methodinterceptor;

public class PersonService implements PersonDao{

	public void say(String message) {
         System.out.println("หตฃบ"+message);		
	}

}
