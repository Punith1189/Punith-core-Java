package Arrays.com;

import java.util.Scanner;

public class single_Array {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int[]arr=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("student marks "+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("student marks "+(i+1)+"in "+arr[i]);
		}
		
		

	}

}
