package com.design.observer;

//���۲����
public class MySubject extends Observerable {  
  
   private String name;

public MySubject() {
	super();
}

public MySubject(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	notifyObservers();
}
   
  
}  
