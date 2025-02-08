package defaultsorting;

class Employee  implements Comparable<Employee>{
	int id;
	String  name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "id: "+ id+ " Name: "+ name;
	}
	@Override
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
	

}
