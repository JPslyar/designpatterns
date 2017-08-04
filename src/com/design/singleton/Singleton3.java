package com.design.singleton;
//方法加锁，（线程安全，每次获取都要加锁效率低）
public class Singleton3 {
   private static Singleton3 instance = null;
   private Singleton3() { }

   public static synchronized Singleton3 getInstance() {
      if(instance == null) {
         instance = new Singleton3();
      }
      return instance;
   }
}
