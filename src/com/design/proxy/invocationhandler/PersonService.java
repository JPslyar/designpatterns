package com.design.proxy.invocationhandler;

public class PersonService implements PersonDao{

	public void say(String message) {
         System.out.println("หตฃบ"+message);		
	}

}
