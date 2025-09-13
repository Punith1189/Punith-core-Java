package string_probleam;

import java.util.Scanner;

public class count_upper_lower_other {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[]arr=str.toCharArray();
		int upper=0;
		int lower=0;
		int special=0;
		int number=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				upper++;
			}
			
			else if(arr[i]>='a' && arr[i]<='z')
			{
				lower++;
			}
			else if(arr[i]>='0' && arr[i]<='9')
			{
				number++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Upper "+upper);
		System.out.println("lower "+lower);
		System.out.println("number "+number);
		System.out.println("special "+special);

	}

}
