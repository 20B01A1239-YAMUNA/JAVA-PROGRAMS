//WRITE A JAVA PRGM ON SELECTION,LOOPING AND LABELLED BREAK AND CONTINUE STATEMENTS
import java.util.Scanner;
class Statement
{
	Scanner sc=new Scanner(System.in);
	public void selectionstatements()
	{
	  int age;
	  System.out.println("enter age:");
	  age=sc.nextInt();
	  if(age>=18)
	  {
		  System.out.println("Eligible for vote");
	  }
	  else
	  {
		  System.out.println("Not Eligible for vote");

	  }
	}
	public void loopingstatements()
	{
		int i,n;
		System.out.println("enter number:");
		  n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("values of i is"+i);
		}
	}
	public void breakstatement()
	{
		int i,n;
		System.out.println("enter number:");
		  n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i==3)
			{
				break;
				
			}
			
			System.out.println("values of i is"+i);
			

		}
	}
	public void continuestatement()
	{
		int i,n;
		System.out.println("enter number:");
		  n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i==3)
			{
				continue;
				
			}
			
			System.out.println("values of i is"+i);
			

		}

	}
}
public class StatementsDemo {

	public static void main(String[] args)
	{
		Statement st=new Statement();
		st.selectionstatements();
		st.loopingstatements();
		st.breakstatement();
		st.continuestatement();
	}

}
