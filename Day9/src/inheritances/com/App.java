package inheritances.com;

public class App {

	public static void main(String[] args) 
	{
		TeacherRobot tr=new TeacherRobot();
		DoctorRobot dr=new DoctorRobot();
		cheifRobot cr=new cheifRobot();
		tr.talk();
		tr.walk();
		dr.chek();
		dr.walk();
		dr.talk();
		cr.cook();
		cr.eat();
		cr.walk();

	}

}
