package defaultsorting;

import java.util.TreeSet;

class HotelMainClass {
	public static void main(String[] args) {
		TreeSet<Hotel> ts=new TreeSet<Hotel>();
		ts.add(new Hotel("Taj",4.5));
		ts.add(new Hotel("Itc",4.4));
		ts.add(new Hotel("Royal",4.7));
		for(Hotel h:ts)
		{
			System.out.println(h);
		}
		
		
	}

}
