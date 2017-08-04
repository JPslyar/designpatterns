package com.design.proxy;

public class ProxyTest {
	 public static void main(String[] args) { 
		   //客户不知道代理委托了另一个对象
	        Sourceable source = new SourceProxy();  
	        source.method();  
	    }  
}
