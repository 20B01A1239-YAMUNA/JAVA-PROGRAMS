package numbers;
import java.util.Random;
import java.util.Scanner;
public class RandomNumbers extends Thread
{
	
	public synchronized void random()
	{
		System.out.println("\n RANDOM NUMBER BETWEEN 1 TO 50");
		Random rn=new Random();
		int i=rn.nextInt(50);
		System.out.println(i+"\t");
		
	}

}
