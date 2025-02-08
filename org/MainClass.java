package org;

import java.util.ArrayList;

class MainClass {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(1.2);
		al.add("java");
		/*for(Object obj:al)
		{
			if(obj instanceof String)
			{
				System.out.println(obj);
			}
		}*/
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i) instanceof String)
				System.out.println(al.get(i));
		}
	}

}
