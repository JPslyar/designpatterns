package com.design.visitor;
//������ģʽ��Visitor��
public class VisitorTest {
	public static void main(String[] args) {  
        Visitor visitor = new MyVisitor();  
        MyVisitable visitable = new MyVisitable();  
        visitable.accept(visitor);      
    }  
}
