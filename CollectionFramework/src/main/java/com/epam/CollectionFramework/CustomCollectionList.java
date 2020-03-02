package com.epam.CollectionFramework;

public class CustomCollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<Integer> Customlist = new MyList<>();
		System.out.println("Initial List:"+Customlist);
        Customlist.add(100);
        Customlist.add(12);
        Customlist.add(30000);
        Customlist.add(6666);
        Customlist.add(12856);
        Customlist.add(58639);
        System.out.println("The list after adding elements :"+Customlist);
        Customlist.remove(1);
        Customlist.remove(3);
        System.out.println("The list after removing elements 1 and 3:"+Customlist);
        System.out.println("The element at index 0 is"+Customlist.get(0) );
        System.out.println("The element at index 2 is"+Customlist.get(2) );
 
       
        System.out.println("The list elements are"+Customlist);
	}

}
