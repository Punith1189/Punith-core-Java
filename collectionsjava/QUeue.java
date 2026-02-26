package collectionsjava;

import java.util.LinkedList;
import java.util.Queue;

public class QUeue {

	public static void main(String[] args)
	{
		Queue <Integer> q=new LinkedList<>();
		q.add(10);
		q.add(40);
		q.add(30);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.size());

	}

}
