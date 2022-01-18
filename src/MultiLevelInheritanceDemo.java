//WRITE A JAVA PRGM TO IMPLEMENT THE CONCEPT OF MULTILEVEL INHERITANCE
class Car
{
	public Car()
	{
		System.out.println("Car is parent class");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type:Car");

	}
}
class Maruthi extends Car{
	public Maruthi()
	{
		System.out.println("Maruthi is child class for Car class");
	}
	public void brand() 
	{
		System.out.println("Car Brand:Maruthi");
			
	}
	public void speed()
	{
		System.out.println("Speed :144kmph");
	}

}
class Maruthi800 extends Maruthi
{
	public Maruthi800()
	{
		System.out.println("Maruthi800 is child class for Maruthi class");
	}
	public void brand() 
	{
		System.out.println("Car Brand:Maruthi800");
			
	}
	public void speed()
	{
		System.out.println("Speed :148kmph");
	}
	
}

public class MultiLevelInheritanceDemo
{

	public static void main(String[] args) 
	{
       Maruthi800 c=new Maruthi800();
       c.vehicleType();
       c.brand();
       c.speed();
       
	}

}
