package collectionsjava;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		System.out.println(s);
		System.out.println("Peek "+s.peek());
		System.out.println("empty "+s.isEmpty());

	}

}
