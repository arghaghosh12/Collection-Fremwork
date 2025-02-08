package org;

import java.util.ArrayList;
import java.util.LinkedList;

class GenericsExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		for(Integer i: al)
			//for(int i:al)
		{
			System.out.println(i);
		}
		System.out.println("**************");
		
		LinkedList<Double> ll=new LinkedList<Double>();
		ll.add(12.5);
		ll.add(13.5);
		ll.add(14.6);
		for(double x: ll)
			//for(Double x: ll)
		{
			System.out.println(x);
		}
		System.out.println("-----------------");
		
		ArrayList l=new ArrayList();
		l.add(10);//l.add(new Integer(10));
		l.add(1.2);//l.add(new Double(1.2));
		
		//Generalization or upcasting
		//1.Object obj=new Integer(10);
		//2.Object obj=new Double(1.2);
		for(Object obj:l)
		{
			System.out.println(obj);//Internally-> obj.toString()->toString() is overriden in all Wrapper Classes
		}
		
		
	}

}
