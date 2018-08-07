package weekendhomework;

class Vehicle{
	public void Vehicletype()
	{
		System.out.println("Class Vehicle");
	}

}
class car extends Vehicle{
	public void carmodel()
	{
		System.out.println("Class car");
	}
} 

class Audi extends car{

	public void Audimodel()
	{
		System.out.println("Audi: A6");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		{
			Audi c = new Audi();
			c.Audimodel();
			c.carmodel();
			c.Vehicletype();
		}
	}

}


