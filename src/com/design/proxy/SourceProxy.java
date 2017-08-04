package com.design.proxy;


public class SourceProxy implements Sourceable {  
  
    private Source source;  
    /**
     * 装饰模式通过传递参数将source传给装饰着的构造器；
     * 代理模式是直接在代理者内部实例化被代理对象，从而达到了隐藏被代理者具体信息的目的。
     * 
     * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
     * 换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。
     * 因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
     * 并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
     * */
    public SourceProxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  
