package Developer.com;

public class App {

	public static void main(String[] args)
	{
		Deeveloper dev;
		BackendDeveloper bk=new BackendDeveloper();
		dev=bk;
		dev.project();
		dev.submit();
		((BackendDeveloper) dev).write();
		((BackendDeveloper) dev).run();
				
	}

}
