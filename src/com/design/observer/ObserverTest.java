package com.design.observer;

/**
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ
 * */
public class ObserverTest {  
  
    public static void main(String[] args) {  
        MySubject sub = new MySubject();  
        sub.addObserver(new Observer1());  
        sub.addObserver(new Observer2());  
        sub.setName("jiangpeng");
    }  
  
}  
