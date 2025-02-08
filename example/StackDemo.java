package example;

import java.util.Stack;

class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s); //[10, 20, 30]

		System.out.println(s.pop());//30
		System.out.println(s.pop());//20
		System.out.println(s.pop());//10
		System.out.println(s.pop());//EmptyStackException 
		
	}

}
