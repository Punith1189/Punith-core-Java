package ConditionalStruture;

import java.util.Scanner;

public class else_if_condition
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the second numbeer");
		int num2=scan.nextInt();
		System.out.println("enter the third number");
		int num3=scan.nextInt();
		dispaly(num1,num2,num3);
		
		
	}

	private static void dispaly( int num1,int num2,int num3)
	{
		if(num1>num2 && num2>num3)
		{
			System.out.println(num1+"is a greater");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println(num2+"is a greater");
		}
		else
		{
			System.out.println(num3+" is a greater");
		}
	}
}
