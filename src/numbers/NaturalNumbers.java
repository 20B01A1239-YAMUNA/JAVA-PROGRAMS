package numbers;

public class NaturalNumbers extends Thread
{
	public synchronized void natural()
	{
		System.out.println("\n NATURAL NUMBERS FROM 1 TO 50");
		for(int i = 1;i<=50;i++)
			System.out.print(i+"\t");
			
		
	}

}
