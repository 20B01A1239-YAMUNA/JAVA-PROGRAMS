//WRITE A JAVA PRGM FOR CASTING OF VARIABLES
import java.util.Scanner;
class Casting
{
	int a,b;
	float c,d;
	public void inputdata() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter c value:");
		c=sc.nextFloat();
		d=a;
		b=(int)c;
	}
	public void displaydata()
	{
		System.out.println("int to float::d="+d);
		System.out.println("float to int::b="+b);


	}
}

public class CastConversions {

	public static void main(String[] args) 
	{

Casting c=new Casting();
 c.inputdata();
c.displaydata();

	}

}
