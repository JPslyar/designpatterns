package com.design.adapter;
public class AdapterTest {
    public static void main(String[] args) {
    	//���������ģʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
    	//ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
        Targetable target = new Adapter1();  
        target.method1();  
        target.method2();  
        //�����������ģʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
        Source source = new Source();  
        target = new Adapter2(source);  
        target.method1();  
        target.method2(); 
        //�ӿ�����ģʽ:����ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�
        Sourceable sourceable = new SourceSub(); 
        sourceable.method1();
    }  
}
