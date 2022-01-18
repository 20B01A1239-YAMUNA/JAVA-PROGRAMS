class Exceptions
{
	
	public void operations() throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException,NullPointerException
	{
		int s=Integer.parseInt("YAMUNA SRI");
		String str = null;
		System.out.println(str.toLowerCase());
		int a=5,b=0,d;
		d=a/b;
		int c[]=new int[3];
		c[7]=9;
		
		
	}
}
public class ExceptionDemo
{

	public static void main(String[] args) 
	{
		int x=3,y=5,z;
		Exceptions e=new Exceptions();
		try {
			e.operations();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("enter a number greater than zero in denominator");
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("enter the correct index value");
		}
		
		
		catch(NumberFormatException ne)
		{
			System.out.println("Number Format Exception");

		}

		catch(NullPointerException np) {
			System.out.println("Null Pointer Exception");
		}
		finally {
		System.out.println("Execution of Finally Block");
		}
		z=x+y;
		System.out.println(z);
		
		


	}

}
