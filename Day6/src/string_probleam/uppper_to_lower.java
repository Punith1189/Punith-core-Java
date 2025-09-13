package string_probleam;

import java.util.Scanner;

public class uppper_to_lower {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sting");
		String str=sc.next();
		char[]arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				arr[i]=(char) (arr[i]+32);
			}
		}
		String newstr=new String(arr);
		System.out.println(newstr);
	}
}
