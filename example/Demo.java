package example;

import java.util.ArrayList;
import java.util.ListIterator;

class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		//traverse using ListIterator
		ListIterator<Integer> li=l.listIterator();
		//forward
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-----------");
		//backword traversal after forward cursor will be at last
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		ListIterator<Integer> l2=l.listIterator(l.size());
		//l.size()==cursor will point to next(of last position)
		System.out.println("**********");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
		
		
		
	}

}
