package storingObject;
import java.util.ArrayList;
class EmployeeMainClass {
	public static void main(String[] args) {
		ArrayList <Employee> al=new ArrayList<Employee>();
		al.add(new Employee(100,"John",3.5));
		al.add(new Employee(200,"Argha",4.5));
		al.add(new Employee(300,"Dip",2.6));
		al.add(new Employee(400,"Nur",2.8));
		al.add(new Employee(400,"Manju",2.9));
		for(Object obj:al)
		{
			System.out.println(obj);
			
		}
		System.out.println("----------------");
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).name.startsWith("J"))
			{
				System.out.println(al.get(i));
			}
		}
		System.out.println("***********");
		for(Employee emp:al)
			System.out.println(emp);
		
		System.out.println("------------");
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).salary>2.5 && al.get(i).salary<3.5)
			{
				System.out.println(al.get(i));
			}
		}
	}

}
