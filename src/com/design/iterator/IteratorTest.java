package com.design.iterator;
//迭代器模式主用作用是同意了集合遍历的方法
public class IteratorTest {
	public static void main(String[] args) {  
        Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
    }  
}
