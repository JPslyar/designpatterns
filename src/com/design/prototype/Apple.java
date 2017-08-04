package com.design.prototype;

import java.awt.Color;

public class Apple extends Prototype{
   private static final long serialVersionUID = 1L;
   private Color color;
   private Type type;

   public Apple() {
	super();
   }

   public Apple(Color color, Type type) {
	  super();
	  this.color = color;
	  this.type = type;
   }

public Color getColor() {
	return color;
}

public void setColor(Color color) {
	this.color = color;
}

public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}
   
public static void main(String[] args) {
	try {
		Apple apple1 = new Apple(new Color(100, 100, 0),new Type("国产水晶果"));
		Apple apple2 = (Apple) apple1.clone();
		Apple apple3 = (Apple) apple1.deepClone();
		System.out.println("apple1 rgb:"+apple1.getColor()+" type:"+apple1.getType());
		System.out.println("apple2 rgb:"+apple2.getColor()+" type:"+apple2.getType());
		System.out.println("apple3 rgb:"+apple3.getColor()+" type:"+apple3.getType());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
