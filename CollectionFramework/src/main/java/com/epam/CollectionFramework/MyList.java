package com.epam.CollectionFramework;

import java.util.Arrays;

public class MyList <type>{
	static final int InitialSize = 10;
	public Object items[];
	public int listsize=0;
	public MyList() {
        items = new Object[InitialSize];
    }
	public void add(type e) {
        if (listsize==items.length) {
            alterlistsize();
        }
        items[listsize++] = e;
    }
	public void alterlistsize() {
        int addsize = items.length * 2;
        items = Arrays.copyOf(items, addsize);
    }
	public type get(int i) {
        if (i>=listsize||i<0) {
           throw new IndexOutOfBoundsException("Index:"+i+",Size"+i);
        	//System.out.println("index out of bound");
        }
        return (type) items[i];
    }

	public type remove(int i) {
        if (i>=listsize||i<0) {
           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        	//System.out.println("index out of bound");
        }
        Object element =items[i];
        int alteredsize = items.length - ( i + 1 ) ;
        System.arraycopy( items, i + 1, items, i, alteredsize ) ;
        listsize--;
        return (type)element;
    }
	 public String toString(){
	         StringBuilder list = new StringBuilder();
	         list.append('[');
	         for(int i = 0;i<listsize;i++) {
	        	 list.append(items[i].toString());
	             if(i<listsize-1){
	            	 list.append(",");
	             }
	         }
	         list.append(']');
	         return  list.toString();
	    }
}
