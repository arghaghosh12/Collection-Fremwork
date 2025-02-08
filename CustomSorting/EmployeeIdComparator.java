package customsorting;

import java.util.Comparator;

class EmployeeIdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e,Employee f)
	{
		return  e.id-f.id;
	}
	

}
