package String_objects;

public class program2 {

	public static void main(String[] args) 
	{
		String s1=new String("JAVA");
		String s2=new String("JAVA");
		if(s1==s2)
		{
			System.out.println("Reference are same");
		}
		else
		{
			System.out.println("Reference not are same");
		}
		if(s1.equals(s2))
		{
			System.out.println("value are same");
		}
		else
		{
			System.out.println("value  are not same");
		}

	}

}
