package string_probleam;

import java.util.Scanner;

public class lower_to_uppper {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		char []arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>='a' && arr[i]<='z')
			{
				arr[i]=(char) (arr[i]-32);
			}
		}
		String newstr=new String(arr);
		System.out.println(newstr);

	}

}
