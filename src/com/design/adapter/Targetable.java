package com.design.adapter;
//目标接口，能够适配Source里面的方法
public interface Targetable {  
  
    /* 与原类中的方法相同 */  
    public void method1();  
  
    /* 新类的方法 */  
    public void method2();  
}  
