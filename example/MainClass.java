package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class MainClass {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(10.01);
		al.add(20.11);
		
		// 1. Only Forward => Iterator
		Iterator<Double> i = al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("************");
		
		// 2. Both forward and backward => ListIterator();
		ListIterator<Double> li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.nextIndex() + " -> "+ li.next() );
		
		System.out.println("---------");
		while(li.hasPrevious())
			System.out.println(li.previousIndex() + " -> "+ li.previous());
		

		System.out.println("************");
		
		// 3. Only Backward -> ListIterator(al.size());
		ListIterator<Double> ll = al.listIterator(al.size());
		while(ll.hasPrevious())
			System.out.println(ll.previousIndex() + " -> "+ ll.previous());

	}

}
