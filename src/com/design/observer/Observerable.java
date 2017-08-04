package com.design.observer;

import java.util.Enumeration;
import java.util.Vector;


public class Observerable{  
    //��֤�̰߳�ȫ     
    private Vector<Observer> vector = new Vector<Observer>();  

    public void addObserver(Observer observer) {  
        vector.add(observer);  
    }  
  
    public void delObserver(Observer observer) {  
        vector.remove(observer);  
    }  
  
    public void notifyObservers() { // notifyObservers()�б���Ҫ����Observer��update����
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }  
}  
