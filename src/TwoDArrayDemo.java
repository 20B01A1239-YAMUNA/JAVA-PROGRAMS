//WRITE A PRGM TO PERFORM OPERATIONS ON MATRIX USING 2D ARRAY
import java.util.Scanner;
class TwoDArray
{
	Scanner sc=new Scanner(System.in);
	public void addandsub()
	{
		int a[][],b[][],c[][],i,j;
		a=new int [3][3];
		b=new int [3][3];
		c=new int [3][3];
		System.out.println("Enter First Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix Addition");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+"\t");
				
			}
			System.out.println();

		}
		System.out.println("Matrix Subtraction");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+"\t");
				
			}
			System.out.println();

		}




	}
}
public class TwoDArrayDemo 
{

	public static void main(String[] args)
	{
		TwoDArray td=new TwoDArray();
		td.addandsub();
	}

}
