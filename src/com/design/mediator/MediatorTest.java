package com.design.mediator;
//ÖÐ½éÄ£Ê½
public class MediatorTest {
    public static void main(String[] args) {  
        Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();  
    }  
}
