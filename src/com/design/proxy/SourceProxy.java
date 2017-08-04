package com.design.proxy;


public class SourceProxy implements Sourceable {  
  
    private Source source;  
    /**
     * װ��ģʽͨ�����ݲ�����source����װ���ŵĹ�������
     * ����ģʽ��ֱ���ڴ������ڲ�ʵ������������󣬴Ӷ��ﵽ�����ر������߾�����Ϣ��Ŀ�ġ�
     * 
     * װ����ģʽ��ע����һ�������϶�̬����ӷ�����Ȼ������ģʽ��ע�ڿ��ƶԶ���ķ��ʡ�
     * ���仰 ˵���ô���ģʽ�������ࣨproxy class�����Զ����Ŀͻ�����һ������ľ�����Ϣ��
     * ��ˣ���ʹ�ô���ģʽ��ʱ�����ǳ�����һ���������д���һ�������ʵ����
     * ���ң�������ʹ��װ����ģ ʽ��ʱ������ͨ���������ǽ�ԭʼ������Ϊһ����������װ���ߵĹ�������
     * */
    public SourceProxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  
