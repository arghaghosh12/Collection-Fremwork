package interwiewprogram;

 class CricketPlayer implements Comparable<CricketPlayer> {
	String name;
	String country;
	int runs;
	CricketPlayer(String name,String country,int runs)
	{
		this.name=name;
		this.country=country;
		this.runs=runs;
	}
	@Override
	public String toString()
	{
		return name+ " representing "+ country+ " score "+runs+ " runs";
	}
	public int compareTo(CricketPlayer c)
	{
		return this.runs-c.runs;
	}

}
