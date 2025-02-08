package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(21,"Dip");
		Student s2=new Student(22,"Raj");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println("Age: "+s.age+" Name: "+s.name);
		}
		
	}

}
