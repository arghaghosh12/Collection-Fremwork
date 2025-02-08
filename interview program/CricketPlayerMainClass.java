package interwiewprogram;

import java.util.ArrayList;
import java.util.Collections;

class CricketPlayerMainClass {
	public static void main(String[] args) {
		ArrayList <CricketPlayer> al=new ArrayList<CricketPlayer>();
		al.add(new CricketPlayer("Yuvraj Singh","India",10000));
		al.add(new CricketPlayer("Virat Kohli","India",15000));
		al.add(new CricketPlayer("David Warner","Australia",8000));
		al.add(new CricketPlayer("Kane Willamson","Newzeland",8000));
		al.add(new CricketPlayer("Scachin Tendulkar","India",20000));

		Collections.sort(al);
		System.out.println("Cricket player with highest runs: ");
		System.out.println(al.get(al.size()-1));
		System.out.println("******************");

		System.out.println("Cricket player with lowest runs: ");
		System.out.println(al.get(0));

		System.out.println("----------");
		for(CricketPlayer p:al)
		{
			if(p.name.charAt(0)=='S')
			{
				System.out.println(p);
			}
		}
		System.out.println("----------------------");
		for(CricketPlayer p: al)
		{
			if(p.country.equals("India"))
			{
				System.out.println(p);
			}
		}
		
	}



}
