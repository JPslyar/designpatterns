package com.design.visitor;
//访问者模式（Visitor）
public class VisitorTest {
	public static void main(String[] args) {  
        Visitor visitor = new MyVisitor();  
        MyVisitable visitable = new MyVisitable();  
        visitable.accept(visitor);      
    }  
}
