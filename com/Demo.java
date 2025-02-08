package com;

import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(1.2);
		al.add(10);
		al.add(true);
		al.add(null);
		al.add("java");
		System.out.println(al);//[10, 1.2, 10, true, null, java]
		System.out.println(al.get(1)); //1.2
		System.out.println(al.size());//6
		System.out.println(al.contains("Java"));//false
		System.out.println("*******");
		System.out.println(al);//[10, 1.2, 10, true, null, java]
		al.remove(1);
		
		System.out.println(al);//[10, 10, true, null, java]
		System.out.println("----");
		System.out.println(al.isEmpty());//false
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.isEmpty());//true



	}

}
