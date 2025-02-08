package customsorting;

import java.util.TreeSet;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(102,"Dip");
		Employee e2=new Employee(101,"Raj");
		Employee e3=new Employee(103,"Ram");
		//TreeSet<Employee> ts=new TreeSet<Employee>(new EmployeeNameComparator());
		TreeSet<Employee> ts=new TreeSet<Employee>(new EmployeeIdComparator());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		for(Employee e: ts)
		{
			System.out.println(e);
		}
		
		
		
	}

}
