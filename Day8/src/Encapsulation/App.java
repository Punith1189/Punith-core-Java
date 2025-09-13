package Encapsulation;

public class App {

	public static void main(String[] args)
	{
		employee emp=new employee();
		emp.setData(2756, "punith", 88888.0);
		System.out.println(emp.getempid());
		System.out.println(emp.getempname());
		System.out.println(emp.getdouble());

	}

}
