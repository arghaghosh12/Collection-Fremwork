package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Demo {
	public static void main(String[] args) {
		//Insertion order is not maintained
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20.4);
		hs.add(10);
		hs.add(null);
		hs.add(true);
		System.out.println("Size: -> "+hs.size());
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		
		System.out.println("------------");
		//Insertion order is maintained
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(5);
		lhs.add(10);
		System.out.println("Size: ->"+lhs.size());
		for(Integer i:lhs) {
			System.out.println(i);
		}
		System.out.println("*****************");
		//Maintained the natural sorting order (Ascending order)
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(15);
		ts.add(20);
		ts.add(15); 
		ts.add(5);
		
		System.out.println(ts);
		System.out.println("Size: ->"+ts.size());
		for(int obj: ts)
		{
			System.out.println(obj);
		}
		
		
	}

}
