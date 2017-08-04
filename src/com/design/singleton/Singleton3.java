package com.design.singleton;
//�������������̰߳�ȫ��ÿ�λ�ȡ��Ҫ����Ч�ʵͣ�
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
