package mapexamples;

import java.util.Set;
import java.util.TreeMap;

public class MovieMainClass {
	public static void main(String[] args) {
		TreeMap<Movie,Double> tm=new TreeMap<Movie,Double>(new MovieNameComparator());
		tm.put(new Movie("Kgf"),7.8);
		tm.put(new Movie("Boss"),8.8);
		tm.put(new Movie("Power"),6.8);
		Set<Movie> keys = tm.keySet();
		for(Movie m: keys)
		{
			System.out.println(m+ " ratings: "+tm.get(m));
		}
	}

}

