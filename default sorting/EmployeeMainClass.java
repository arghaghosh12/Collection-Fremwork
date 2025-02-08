package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>();
		ts.add(new Employee(101,"John Cena"));
		ts.add(new Employee(100,"John"));
		ts.add(new Employee(102,"Jack"));
		for(Employee e: ts)
		{
			System.out.println(e);
		}
		
	}

}
