package com.design.observer;

import java.util.Enumeration;
import java.util.Vector;


public class Observerable{  
    //保证线程安全     
    private Vector<Observer> vector = new Vector<Observer>();  

    public void addObserver(Observer observer) {  
        vector.add(observer);  
    }  
  
    public void delObserver(Observer observer) {  
        vector.remove(observer);  
    }  
  
    public void notifyObservers() { // notifyObservers()中必须要调用Observer的update方法
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }  
}  
