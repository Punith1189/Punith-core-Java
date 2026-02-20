package Searching_sorting_merging;

import java.util.Scanner;

public class insection {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter a elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		System.out.println("Sorted Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
