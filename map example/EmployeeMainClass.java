package mapexamples;

import java.util.Set;
import java.util.TreeMap;

class EmployeeMainClass {
	public static void main(String[] args) {
		TreeMap<Employee, String> tm=new <Employee,String>TreeMap();
		tm.put(new Employee(100),"John");
		tm.put(new Employee(200),"Jack");
		tm.put(new Employee(300),"Alex");
		Set<Employee>keys=tm.keySet();
		for(Employee e: keys)
		{
			System.out.println(e+" Name: "+tm.get(e));
		}
	}

}
