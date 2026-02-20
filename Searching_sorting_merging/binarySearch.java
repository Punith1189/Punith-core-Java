package Searching_sorting_merging;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter th size");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("enter key");
		int key=sc.nextInt();
		int low=0;int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println("FOunded at "+key);
				return;
			}
			if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("Not");
	}
}
