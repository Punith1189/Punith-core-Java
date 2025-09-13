package constructor_overloading;

import constructer.com.main;

public class laptop 
{
	int slno;
	String name;
	int cost;
	public laptop()
	{
		slno=123;
		name="lenovo";
		cost=90000;
	}
	public laptop(int slno)
	{
		this.slno=slno;
		name="dell";
		cost=40000;
	}
	public laptop(int slno,String name,int cost)
	{
		this.slno=slno;
		this.name=name;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("slno "+slno);
		System.out.println("name "+name);
		System.out.println("cost "+cost);
	}
	public static void main(String[]args)
	{
		laptop l1=new laptop();
		l1.display();
		System.out.println("");
		laptop l2=new laptop(1234);
		l2.display();
		System.out.println("");
		laptop l3=new laptop(1345,"hp",9876);
		l3.display();
	}

}
