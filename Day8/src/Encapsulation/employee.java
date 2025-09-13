package Encapsulation;

public class employee 
{
	private int empid;
	private String name;
	private double salary;
	public void setData(int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public int getempid()
	{
		return empid;
	}
	public String getempname()
	{
		return  name;
	}
	public double getdouble()
	{
		return salary;
	}

}
