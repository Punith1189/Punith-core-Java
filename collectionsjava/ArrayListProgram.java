package collectionsjava;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) 
	{
		ArrayList <String>list=new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("39");
		list.add("10");
		list.remove("39");
		list.set(1,"40");
		System.out.println(list.get(1));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		

	}

}
