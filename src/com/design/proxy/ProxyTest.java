package com.design.proxy;

public class ProxyTest {
	 public static void main(String[] args) { 
		   //�ͻ���֪������ί������һ������
	        Sourceable source = new SourceProxy();  
	        source.method();  
	    }  
}
