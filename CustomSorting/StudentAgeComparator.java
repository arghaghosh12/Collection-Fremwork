package customsorting;
import java.util.Comparator;
class StudentAgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student x,Student y)
	{
		return x.age-y.age;
		//return y.age-x.age;
		
	}

}
//x-> Current object to be Inserted
//y-> Already Existing Object