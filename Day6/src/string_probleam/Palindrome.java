package string_probleam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
			
		}
		System.out.println("reversString "+revstr);
		if(revstr.equals(str))
		{
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("Not palindrome");
		}
			}
}
