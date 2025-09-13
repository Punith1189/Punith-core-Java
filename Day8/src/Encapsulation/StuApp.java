package Encapsulation;

public class StuApp {

	public static void main(String[] args) 
	{
		student s1=new student();
		s1.setData(123, "Punith", 70);
		System.out.println(s1.getrollno());
		System.out.println(s1.getname());
		System.out.println(s1.getmarks());

	}

}
