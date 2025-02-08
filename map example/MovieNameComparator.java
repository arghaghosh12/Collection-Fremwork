package mapexamples;

import java.util.Comparator;

class MovieNameComparator implements Comparator<Movie> {
	@Override
	
	public int compare(Movie m1,Movie m2)
	{
		return m1.name.compareTo(m2.name);
	}

}
