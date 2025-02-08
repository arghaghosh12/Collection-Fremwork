package org;

import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {
		int a=10;
		double b=10.4;
		
		ArrayList al=new ArrayList();
		al.add(a);//al.add(new Integer(10));
		al.add(b);//al.add(new Double(10.4))N
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("'''''''''''''''''''''");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
