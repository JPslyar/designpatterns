package com.design.decorator;
//被装饰对象
public class Source implements Sourceable {  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
} 