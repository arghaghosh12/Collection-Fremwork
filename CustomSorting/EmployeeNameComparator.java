package customsorting;

import java.util.Comparator;

class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e,Employee f)
	{
		return e.name.compareTo(f.name);
	}

}
