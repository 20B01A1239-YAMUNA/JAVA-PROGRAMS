//WRITE A JAVA PRGM TO IMPLEMENT THE CONCEPT OF SINGLE INHERITANCE
class ClassRoom
{
	int benches,nooffans;
	public ClassRoom(int b,int nof) 
	{
		benches=b;
		nooffans=nof;
	}
	public void displayClassRoom()
	{
		System.out.println("Enter the no.of benches   :"+benches);
		System.out.println("Enter the no.of fans      :"+nooffans);
	}
}
class DigitalClassRoom extends ClassRoom
{
	boolean avsystem;
	
	public DigitalClassRoom(int b,int nof,boolean av) 
	{
		super(b,nof);
		avsystem=av;
		
	}
	public void displayDigitalClassRoom()
	{
		System.out.println("Is avsystem is there?     :"+avsystem);
	}
	
}
public class SingleInheritanceDemo 
{

	public static void main(String[] args)
	{
		DigitalClassRoom dc=new DigitalClassRoom(20,10,true);
		dc.displayClassRoom();
		dc.displayDigitalClassRoom();
		

	}

}
