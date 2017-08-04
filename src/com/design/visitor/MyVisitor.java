package com.design.visitor;


public class MyVisitor implements Visitor {  
  
    @Override  
    public void visit(Visitable sub) {  
        System.out.println("visit the subject��"+sub.getVisitable());  
    }  
}  
