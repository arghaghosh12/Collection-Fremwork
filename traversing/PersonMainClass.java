package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class PersonMainClass {
	public static void main(String[] args) {
		Person p1=new Person(23,"Rohit",5.5);
		Person p2=new Person(24,"Anuj",5.8);
		ArrayList<Person> al=new ArrayList<Person>();
		//al.add(new Person(20,"Jack",5.9));
		//al.add(new Person(21,"John",5.3));
		
		al.add(p1);
		al.add(p2);
		
		Iterator<Person> i=al.iterator();
		while(i.hasNext())
		{
			Person p=i.next();
			System.out.println("Age: "+ p.age+" Name: "+ p.name+" Height: "+ p.height);
		}
		
	}

}
