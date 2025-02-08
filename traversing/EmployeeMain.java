package traversingobjects;

import java.util.Iterator;
import java.util.LinkedList;

class EmployeeMain {
	public static void main(String[] args) {
		LinkedList<Employee> ll=new LinkedList<Employee>();
		ll.add(new Employee("John",3.5));
		ll.add(new Employee("Jock",4.5));
		Iterator<Employee> i=ll.iterator();
		while(i.hasNext())
		{
			Employee e=i.next();
			System.out.println("Salary of "+ e.name +" is "+e.salary +"LPA");
		}
		
		
	}

}
