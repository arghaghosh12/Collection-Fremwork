package com;
import java.util.ArrayList;
class MethodExample {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		ArrayList a=new ArrayList();
		a.addAll(al);
		a.add(30);
		System.out.println(al);//[10, 20]
		System.out.println(a); //[10,20,30]
		System.out.println("*****");
		System.out.println(a.containsAll(al));//  true
		System.out.println("------------");
		System.out.println(a);//[10,20,30]
		a.removeAll(al);
		System.out.println(a);//[30]
	}

}
