package mapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student("Dip");
		Student s2=new Student("Raj");
		Map<Student,Integer> map=new HashMap<Student,Integer>();
		map.put(s1,50); //map.put(new Student("John"),50);
		map.put(s2, 64); //map.put(new Student("John Cena"),65);
		Set<Student>keys=map.keySet();
		for(Student s:keys)
		{
			System.out.println( s+" Marks: "+map.get(s));
		}
		}

}
