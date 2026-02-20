package Searching_sorting_merging;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter a elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[minIndex]>arr[j])
				{
					minIndex=j;
				}
			}
			int temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}	
		System.out.println("Sorted Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
