package Encapsulation;

public class student 
{
	private int rollno;
	private String name;
	private int marks;
	public void setData(int rollno,String name,int marks)
	{
       this.rollno=rollno;
       this.name=name;
       this.marks=marks;
       }
		public int getrollno()
		{
			return rollno;
		}
		public String getname()
		{
			return name;
		}
		public int getmarks()
		{
			return marks;
		}
}
	

