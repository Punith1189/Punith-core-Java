package collectionsjava;

import java.util.TreeSet;

public class TreeSet_P {

	public static void main(String[] args) 
	{
		TreeSet <Integer> set=new TreeSet<>();
		TreeSet <String> st=new TreeSet<>();
		set.add(100);
		set.add(100);
		set.add(200);
		set.add(10);
		set.add(20);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.first());
		st.add("Python");
		st.add("Java");
		st.add("Html");
		st.add("Python");
		System.out.println(st);
		
		

	}

}
