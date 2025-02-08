package sortingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MobileMainClass {
	
	public static void main(String[] args) {
		Mobile m1=new Mobile(15000);
		Mobile m2=new Mobile(16000);
		Mobile m3=new Mobile(14000);
		
		ArrayList<Mobile>al=new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		System.out.println(al);
		//MobileCostComparator cm=new MobileCostComparator(); //-->using comparator Interface
		//Collections.sort(al, cm);
		
		System.out.println("Insertion order is maintained: ");
		
		
		for(Mobile m:al)
		{
			System.out.println(m);
		}
		System.out.println("Assending order: ");
		Collections.sort( al);
		for(Mobile m:al)
		{
			System.out.println(m);
		}
		System.out.println("-----------");
		System.out.println("Descending order: ");
		Collections.reverse(al);
		for(Mobile m:al)
		{
			System.out.println(m);
		}
		
		for(Mobile p: al)
		{
			System.out.println(p);
		}
	}

}
