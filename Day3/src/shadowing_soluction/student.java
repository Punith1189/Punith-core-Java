package shadowing_soluction;

public class student 
{
	int rollno;
	String name;
	int marks;
	public student(int rollno,String name,int marks) 
	{
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
	}
	void study()
	{
		System.out.println(name+" is studing java");
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+marks);
	}
       public static void main(String[]args)
       {
    	   student s1=new student(11,"punith",66);
    	   s1.study();
    	   s1.display();
    	   student s2=new student(12,"Raju",56);
    	   s2.study();
    	   s2.display();
       }
       }

