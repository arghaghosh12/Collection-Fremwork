package com;
import java.util.ArrayList;
class MethodDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Java");
		ArrayList al2=new ArrayList();
		al2.add(al);
		//al2.addAll(al);
		al2.add(30);
		System.out.println("Element -> "+ al2 +" & Size ->"+al2.size());
	}

}
/**
 * 1> If we use al2.addAll(al); -> All the objects of 1 collection is added into 
 * another Collection 1 by 1(Sequentially).
 * Therefore Elements are[10,20,30] and size is 3. * 
 * 
 * 2> If we use al2.add(al); -> All objects of 1 Collection is added into another collection as a single object.
 * There fore Elements are [[10,20],30](nested list) and size is 2.
**/