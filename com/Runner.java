package com;
import java.util.ArrayList;
class Runner {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(25);
		al.add(37);
		System.out.println(al); //[20, 25, 37]
		al.add(1,55);
		System.out.println(al);// [20, 55, 25, 37]
		al.set(2,77);
		System.out.println(al); //[20, 55, 77, 37]
	}

}
