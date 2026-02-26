
package collectionsjava;

import java.util.HashMap;

public class Hash_map 
{
	public static void main(String[] args) {
		HashMap <Integer,String> h=new HashMap<>();
		h.put(4, "10");
		h.put(3, "10");
		h.put(2, "20");
		h.put(1, "java");
		System.out.println(h);
		System.out.println(h.get(4));
		System.out.println(h.remove(4));
		System.out.println(h.size());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h);
		
		
	}

}
