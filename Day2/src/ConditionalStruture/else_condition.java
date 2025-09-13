package ConditionalStruture;

import java.util.Scanner;

public class else_condition
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		String s="punith";
		
		if(18<=age)
		{
			System.out.println(s+" is a major");
		}
		else
		{
			System.out.println(s+" is a mainar");
		}

	}

}
