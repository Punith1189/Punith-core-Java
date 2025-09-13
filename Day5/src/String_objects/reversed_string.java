package String_objects;

import java.util.Scanner;

public class reversed_string {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
	   char[]arr=s1.toCharArray();
	   char[]arr1=new char[arr.length];
	   int j=arr.length-1;
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   arr1[j]=arr[i];
		   j--;
	   }
	   String revstr=new String(arr1);
	   System.out.println(revstr);

	}

}
