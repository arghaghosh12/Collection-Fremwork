package traversingobjects;

class Mobile {
	String brand;
	int cost;
	Mobile(String brand,int cost)
	{
		this.brand=brand;
		this.cost=cost;
		
	}
	@Override
	public String toString()
	{
		return "Brand: "+brand +" cost: "+ cost;
	}
	

}
