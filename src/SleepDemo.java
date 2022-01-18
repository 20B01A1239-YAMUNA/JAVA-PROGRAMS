class NaturalNumbers extends Thread
{
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException ie)
			{
			System.out.println(ie.getMessage());	
			}
		}
	}
}

public class SleepDemo {

	public static void main(String[] args) 
	{
		NaturalNumbers n= new NaturalNumbers();
		n.start();

	}

}
