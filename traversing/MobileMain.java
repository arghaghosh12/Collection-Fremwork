package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class MobileMain {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Apple",50000);
		Mobile m2=new Mobile("MI",20000);
		
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);
		Iterator <Mobile> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
