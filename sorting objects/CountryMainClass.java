package sortingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class CountryMainClass {
	public static void main(String[] args) {
		ArrayList <Country>al=new ArrayList<Country>();
		al.add(new Country("India",150));
		al.add(new Country("Chaina",170));
		al.add(new Country("America",11));
		for(Country c: al)
		{
			System.out.println(c);
		}
		System.out.println("-*******************--");
		
		
		System.out.println("Sorting with population: : ");
		CountryPopulationComparator cp=new CountryPopulationComparator();
		Collections.sort(al,cp);
		//Collections.reverse(c1);
		for(Country c:al)
		{
			System.out.println(c);
		}
		System.out.println("---------------");
		
		CountryNameComparator nn=new CountryNameComparator();
		Collections.sort(al,nn);
		System.out.println("Sorting with country.");
		for(Country c:al)
		{
			System.out.println(c);
		}
	}

}
