package sortingobjects;

class Country {
	String name;
	int population;
	Country(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
	@Override
	public String toString()
	{
		return "Country name is: "+ name +" & population is "+ population+" Crores." ;
	}

}
