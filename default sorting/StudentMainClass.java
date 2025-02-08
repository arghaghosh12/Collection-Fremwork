package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

class StudentMainClass {

	public static void main(String[] args) {
		Student s1=new Student(21,"Tom");
		Student s2=new Student(22,"Roki");
		Student s3=new Student(23,"Raja");
		TreeSet <Student> ts=new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
