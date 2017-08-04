package com.design.chainresponsibility;

public class MyHandler extends AbstractHandler implements Handler {  
	  
    private String name;  
  
    public MyHandler(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public void operator() {  
        if(getHandler()!=null){  
            getHandler().operator();  
        }else{
        	System.out.println(name+"deal!");  
        }
    }  
} 