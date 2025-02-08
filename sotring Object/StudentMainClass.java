
package storingObject;
import java.util.ArrayList;
class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(20,"Tom");
		//Student s2=new Student(22,"Jerry");
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		//al.add(new Student(20,"Tom"));
		al.add(new Student(22,"Jerry"));
		//al.add(s2);
		for(Object obj: al)
			System.out.println(obj);
		
		System.out.println("--------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
