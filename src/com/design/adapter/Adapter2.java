package com.design.adapter;


public class Adapter2 implements Targetable {  
  
    private Source source;  
      
    public Adapter2(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
  
    @Override  
    public void method1() {  
        source.method1();  
    }  
}  
