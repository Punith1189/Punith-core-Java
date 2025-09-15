package Constructor_overloading;

public class Bike 
{
	int num;
	String Brand;
	double cost;
	public Bike()
	{
		num=1911;
		Brand="Honda";
		cost=80000.00;
	}
	public Bike(int num)
	{
		this.num=num;
		Brand="HERO";
		cost=700000.00;
	}
	public Bike(int num,String Brand)
	{
		this.num=num;
		this.Brand=Brand;
		cost=80000.00;	
	}
	public void display()
	{
		System.out.println("num "+num);
		System.out.println("Brand "+Brand);
		System.out.println("cost"+cost);
		
	}
	
}
