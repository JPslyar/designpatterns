package com.design.iterator;


public class MyCollection implements Collection {  
	
    public String string[] = {"A","B","C","D","E"};  
    @Override  
    public Iterator iterator() {  
        return new MyItr();  
    }  
  
    @Override  
    public Object get(int i) {  
        return string[i];  
    }  
  
    @Override  
    public int size() {  
        return string.length;  
    }  
    
    

    public class MyItr implements Iterator {  
      
        private Collection collection;  
        private int pos = -1;  
          
        public MyItr(){  
            this.collection = MyCollection.this;  
        }  
          
        @Override  
        public Object previous() {  
            if(pos > 0){  
                pos--;  
            }  
            return collection.get(pos);  
        }  
      
        @Override  
        public Object next() {  
            if(pos<collection.size()-1){  
                pos++;  
            }  
            return collection.get(pos);  
        }  
      
        @Override  
        public boolean hasNext() {  
            if(pos<collection.size()-1){  
                return true;  
            }else{  
                return false;  
            }  
        }  
      
        @Override  
        public Object first() {  
            pos = 0;  
            return collection.get(pos);  
        }  
      
    }  

} 