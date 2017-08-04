package com.design.visitor;


public interface Visitable {  
    public void accept(Visitor visitor);  
    public String getVisitable();  
}  
