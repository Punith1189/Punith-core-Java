package Teacher.com;

public class App {

	public static void main(String[] args) 
	{
		Teacher tr;
		MathsTeacher mr=new MathsTeacher();
		tr=mr;
		tr.take();
		tr.teach();
		((MathsTeacher ).tr).talk();
		((MathsTeacher ).tr).exam();
		
		
		
	}

}
