package com.design.visitor;


public class MyVisitable implements Visitable {  
  
    @Override  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
  
    @Override  
    public String getVisitable() {  
        return "love";  
    }  
}  
