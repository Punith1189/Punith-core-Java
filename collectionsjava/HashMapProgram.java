package collectionsjava;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm=new HashMap<>();
		hm.put("1","10");
		hm.put("2","20");
		hm.put("1","10");
		hm.remove("2");
		System.out.println(hm);
		

	}

}
