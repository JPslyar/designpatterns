package com.design.singleton;
//借助内部内（线程安全）
public class Singleton2 {
   private Singleton2() { }
   private static class SingletonHolder {
      private final static Singleton2 INSTANCE = new Singleton2();
   }
   public static Singleton2 getInstance() {
      return SingletonHolder.INSTANCE;
   }
}
