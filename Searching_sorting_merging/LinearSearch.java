package Searching_sorting_merging;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Key elemnebes");
		int key=sc.nextInt();
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Key is founded");
			}
		}
	}
		
}
