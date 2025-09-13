package constructer.com;

public class car 
{
	String brand;
	int year;
	car()
	{
		brand="unknow";
		year=0;
	}
	car(String b,int y)
	{
		brand=b;
		year=y;
	}
	void display()
	{
		System.out.println("brand "+brand+" year"+year);
	
}}
