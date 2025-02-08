package defaultsorting;

import java.util.TreeSet;

class CarMainClass {
	public static void main(String[] args) {
		Car c1=new Car(500);
		Car c2=new Car(600);
		Car c3=new Car(700);
		
		TreeSet<Car> t=new TreeSet<Car>();
		t.add(c1); //calls compareTo()
		t.add(c2);
		t.add(c3);
		for(Car c:t)
		{
			System.out.println(c);
		}
		
		
	}

}
