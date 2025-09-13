package class_objects;

public class student 
{
int rollno;
String name;
float marks;
void study()
{
	System.out.println("student is studing");
}
void eat()
{
	System.out.println("student is eating");
}
public static void main(String[] args) 
{
	student s1=new student();
	s1.rollno=100;
	s1.name="Punith";
	s1.marks=89.9f;
	s1.study();
	
}
}
