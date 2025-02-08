package orgv;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Task1 {
	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		al.add("Argha");
		al.add("Dip");
		al.add("Sudip");
		al.add("Nur");
		al.add("Rohit");
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Sort names in ascending order");
		System.out.println("2: Sort names in descinding order");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
			/*if(choice==1)
			{
				Collections.sort(al);
				System.out.println(al);
			}
			else if(choice==2)
			{
				
				Collections.sort(al);
				Collections.reverse(al);
				System.out.println(al);
			}
			else
				
				System.out.println("INVALID CHOICE");
				*/
		switch(choice)
		{
		case 1:
			Collections.sort(al);
			for(String s: al)
			{
				System.out.println(s);
			}
			break;
		case 2:
			Collections.sort(al);
			Collections.reverse(al);
			for(String s:al)
			{
				System.out.println(s);
			}
			break;
		default:
			System.out.println("Invalid Choice");
		}
	
	}

}
