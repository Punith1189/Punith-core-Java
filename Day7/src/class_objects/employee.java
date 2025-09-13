package class_objects;

public class employee
{
	int id;
	String name;
	double salary;
	void project()
	{
		System.out.println("employee doing a project");
	}
	void salary()
	{
		System.out.println("employee take the salary");
	}
	public static void main(String[] args)
	{
		employee e1=new employee();
		e1.id=123;
		e1.name="Raju";
		e1.salary=89000.00;
		
	}

}
