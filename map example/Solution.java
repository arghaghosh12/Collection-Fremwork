package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>ll=new LinkedHashMap<String,Integer>();
		ll.put("Tom", 21);
		ll.put("Ram",22);
		Set<String> keys=ll.keySet();
		for(String s:keys)
		{
			System.out.println(s+" is "+ll.get(s)+" years old ");
		}
	}

}
