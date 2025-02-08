package com;
import java.util.*;
class MainClass {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Dip");
		al.add(1.2);
		System.out.println(al);
		System.out.println("-------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("***********");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}

	}

}
