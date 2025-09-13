package Arrays.com;

import java.util.Scanner;

public class two_dArray 
{
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	{
		String[][]arr=new String[3][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the name of company: "+(i+1)+"employee: "+(j+1));
				arr[i][j]=scan.next();
			}
		}
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	for(int j=0;j<=arr[i].length-1;j++)
	    	{
	    		System.out.println("the name of company: "+(i+1)+"employee: "+(j+1)+arr[i][j]);
	    	}
	    }
	}

}

}
