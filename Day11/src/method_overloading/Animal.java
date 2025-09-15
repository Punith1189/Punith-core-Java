package method_overloading;

public class Animal
{ 
	void sound()
	{
		System.out.println("Animal make a sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog make a bow bow");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat make a bow meow");
	}
}

