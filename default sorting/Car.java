package defaultsorting;

class Car  implements Comparable<Car>{
	int cost;
	Car(int cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return "Cost: "+ cost;
	}
	public int compareTo(Car c)
	{
		return this.cost-c.cost; //Ascending order
		//return c.cost-this.cost;-->Dencending order
	}
	

}
//this-> Current object to be inserted
//c->Already existing object 
