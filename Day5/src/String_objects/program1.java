package String_objects;

public class program1 {

	public static void main(String[] args)
	{
		String s1="Java";
		String s2="java";
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
