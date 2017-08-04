package com.design.singleton;
//饿汉式单例（线程安全）
public class Singleton1 {
   private final static Singleton1 INSTANCE = new Singleton1();
   private Singleton1() { }
   public static Singleton1 getInstance() {
      return INSTANCE;
   }
}
