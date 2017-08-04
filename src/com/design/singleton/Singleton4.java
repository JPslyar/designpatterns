package com.design.singleton;
//局部加锁（线程安全，效率相对Singleton3要好）
public class Singleton4 {
	private static Singleton4 instance = null;
	   private Singleton4() { }
	   public static Singleton4 getInstance() {
	      if(instance == null) {
	    	  synchronized(Singleton4.class){
	        	 Singleton4 temp = instance;
	            if(temp == null) {
	               temp = new Singleton4();
	               instance = temp;
	            }
	         }
	      }
	      return instance;
	   }

}
