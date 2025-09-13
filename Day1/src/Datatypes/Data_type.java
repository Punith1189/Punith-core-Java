package Datatypes;

import java.util.Scanner;

public class Data_type {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte value");
		 byte a=sc.nextByte();
		System.out.println("enter the int value");
		int b=sc.nextInt();
		System.out.println("enter the short value");
		short c=sc.nextShort();
		System.out.println("enter the long value");
		long d=sc.nextLong();
		System.out.println("enter the float value");
		float e=sc.nextFloat();
		System.out.println("enter the double value");
		double f=sc.nextDouble();
		System.out.println("enter the boolean value");
		boolean g=sc.nextBoolean();
		System.out.println("enter the String value");
		String h=sc.next();
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
		
		
	}

}
