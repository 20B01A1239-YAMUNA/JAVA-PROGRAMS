import java.util.Scanner;
class NegativeMarksException extends Exception
{
	
	public NegativeMarksException(String msg)
	{
		super(msg);
	}
	public String toString()
	{
		return this.getMessage();
	}
}
class inputMarks{
	public void inputdata() throws NegativeMarksException
	{
		Scanner sc=new Scanner(System.in);
		   int java,python,c,total_marks;
		  
		   System.out.println("enter marks in java");
		   java=sc.nextInt();
		   System.out.println("enter marks in python");
		   python=sc.nextInt();
		   System.out.println("enter marks in c");
		   c=sc.nextInt();
		   total_marks=java+python+c;
		  if (java<0 || java>100)
		  {
			   throw new NegativeMarksException("Invalid marks");
		   }
		  
		  
		  if (python<0 || python>100)
		  {
			   throw new NegativeMarksException("Invalid marks");
		   }
		 
		  if (c<0 || c>100)
		  {
			   throw new NegativeMarksException("Invalid marks");
		   }
		 
		  System.out.println("TOTAL MARKS="+total_marks);

	}
}
public class UserDefinedException {

	public static void main(String[] args)  {
		
		inputMarks id=new inputMarks();
		try {
			id.inputdata();
		}
		catch(NegativeMarksException np)
		{
			System.out.println("please enter valid Marks ");
		}
	}

}
