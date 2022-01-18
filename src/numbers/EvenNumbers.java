package numbers;

public class EvenNumbers extends Thread
{
   public synchronized void even()
   {
		System.out.println("\n EVEN NUMBERS FROM 1 TO 50");
	  for(int i=2;i<=50;i+=2)
	
			 System.out.print(i+"\t");
		 
   }
}
