package com.design.adapter;


public class Adapter1 extends Source implements Targetable {  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
}  

