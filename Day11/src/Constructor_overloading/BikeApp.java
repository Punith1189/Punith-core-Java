package Constructor_overloading;

public class BikeApp {

	public static void main(String[] args) 
	{
		Bike b1=new Bike();
		b1.display();
		Bike b2=new Bike(1234);
		b2.display();
		Bike b4=new Bike(1234,"RX-100");
		b4.display();
	}
}
