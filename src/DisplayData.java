//WRITE A JAVA PRGM TO READ DATA FROM KEYBOARD AND DISPLAY ON CONSOLE
import java.util.Scanner;
class ReadingData
{
	int a,b;
	public void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);

	}
}
public class DisplayData {

	public static void main(String[] args)
	{
		ReadingData rd = new ReadingData();
		rd.inputdata();
		rd.printdata();
	}

}
