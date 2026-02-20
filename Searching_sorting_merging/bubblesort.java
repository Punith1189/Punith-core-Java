package Searching_sorting_merging;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter a elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted");
		for(int nums:arr)
		{
			System.out.println(nums +" ");
		}
	}

}
