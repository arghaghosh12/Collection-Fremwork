package sortingobjects;

import java.util.Comparator;

class CountryNameComparator implements Comparator<Country>{
	@Override
	public int compare(Country x,Country y)
	{
		return x.name.compareTo(y.name);
		//return y.name.compareTo(x.name);
	}
	

}
class CountryPopulationComparator implements Comparator<Country>{
	@Override
	public int compare(Country x,Country y)
	{
		return  x.population-y.population;
		//return y.population-x.population
	}
	

}

