package method_overloading;

public class shap 
{
	void draw()
	{
		System.out.println("Draw the shap");
	}
}
class Circle extends shap
{
	void draw()
	{
		System.out.println("Circle shape");
	}
}
class Squre extends shap
{
	void draw()
	{
		System.out.println("Squre shap");
	}
}

