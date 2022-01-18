package numbers;

public class OddNumbers extends Thread
{
	 public synchronized void odd()
	   {
			System.out.println("\n ODD NUMBERS FROM 1 TO 50");
		  for(int i=1;i<=50;i+=2)
		 
				 System.out.print(i+"\t");
			 
		  
	   }

}
