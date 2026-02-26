package collectionsjava;

import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args)
	{
		LinkedHashSet <Integer> l=new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(3);
		l.remove(20);
		System.out.println(l.size());
	}

}
