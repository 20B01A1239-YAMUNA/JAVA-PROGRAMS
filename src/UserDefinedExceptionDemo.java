import java.util.Scanner;
class NegativePriceException extends Exception
{
	
	public NegativePriceException(String msg)
	{
		super(msg);
	}
	public String toString()
	{
		return this.getMessage();
	}
}
class inputprice{
	public void inputdata() throws NegativePriceException
	{
		Scanner sc=new Scanner(System.in);
		   int price;
		   String book_title="Let Us C";
			String book_author="Yashavant kanetkar ";
			int pages = -117;
			 System.out.println(book_title);
			   System.out.println(book_author);
			   System.out.println(pages+"\npages should not be negative");
		   System.out.println("enter the price");
		   price=sc.nextInt();
		  if (price<0)
		  {
			   throw new NegativePriceException("Invalid cost");
		   }
		   else {
			   System.out.println("price:"+price);
		  }
		


	}
}
public class UserDefinedExceptionDemo {

	public static void main(String[] args)  {
		
		inputprice id=new inputprice();
		try {
			id.inputdata();
		}
		catch(NegativePriceException np)
		{
			System.out.println("enter the price greater than zero");
		}
	}

}
