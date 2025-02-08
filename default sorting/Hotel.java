package defaultsorting;

class Hotel implements Comparable<Hotel> {
	String name;
	Double ratings; //Wrapper class declaration to call compareTo() of double class
	//double ratings;
	Hotel(String name,double ratings)
	{
		this.name=name;
		this.ratings=ratings;
	}
	@Override
	public String toString()
	{
		return "name: "+ name + " Ratings: " +ratings;
	}
	@Override
	public int compareTo(Hotel h)
	{
		return  (this.ratings.compareTo(h.ratings));
		/*if(this.ratings<h.ratings)
		{
			return -1;
		}
		else if(this.ratings>h.ratings)
		{
			return 1;
		}
		else
			return 0;
			*/
		
		
	}

}
