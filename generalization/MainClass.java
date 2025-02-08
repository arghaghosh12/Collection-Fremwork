package generalization;

import java.util.ArrayList;

class MainClass {
	public static void main(String[] args) {
		//Designe generics to accept  Student & Employee objects
		ArrayList<Person>al=new ArrayList<Person>();
		al.add(new Student());
		al.add(new Employee());
		for(Person p:al)
		{
			if(p instanceof Student)
			{
				Student s=(Student) p;
				System.out.println("marks: "+s.marks);
				//System.out.println("Marks: "+((Student)p).marks);
			}
			else if(p instanceof Employee)
			{
				System.out.println("salary: "+((Employee)p).salary);
			}
		}
	}

}
