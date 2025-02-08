package com;

class ForEachDemo {
	public static void main(String[] args) {
		int a[]={10,20,30};
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("------------");
		double marks[]= {20.3,15.6,78.6,65.6};
		for(double m:marks)
		{
			System.out.println(m);
		}
		
		System.out.println("******************");
		String subjects[]= {"java","sql","Python"};
		for(String s:subjects)
		{
			System.out.println(s);
		}
	}

}
