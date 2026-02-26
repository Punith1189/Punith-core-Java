package collectionsjava;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args)
	{
		LinkedList <String> list=new LinkedList<>();
		list.add("punith");
		list.add("Reddy");
		list.addFirst("Vaishu");
		list.addLast("kumari");
		list.removeFirst();
		System.out.println(list);

	}

}
