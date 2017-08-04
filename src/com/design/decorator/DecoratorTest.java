package com.design.decorator;
/**
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�
 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * 
 * 1����Ҫ��չһ����Ĺ��ܡ�
 * 2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬������
 * ���̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
 * 
 * ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 * */
public class DecoratorTest {
   public static void main(String[] args) {  
        Sourceable source = new Source();  
        //�ͻ�ָ����װ������Ҫװ�ε�����һ����
        Sourceable obj = new Decorator(source);  
        obj.method();  
    }  
}
