import java.lang.*;
class Buffer
{
	public void displaydata()
	{
		StringBuffer s1 = new StringBuffer("Java is Object Oriented Programming Language :");
        System.out.println("Input: " + s1);
        s1.append(true);
        System.out.println("Output: " + s1);
         System.out.println();
        StringBuffer s2 = new StringBuffer("Java is very complex :");
        System.out.println("Input: " + s2);
        s2.append(false);
        System.out.println("Output: " + s2);
	}
}
public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
	
		  Buffer b=new Buffer();
		  b.displaydata();
    }

		
	}


