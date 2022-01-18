//WRITE A JAVA PRGM THAT USE ARITHMETIC,UNARY,CONDITIONAL OPERATORS
import java.util.Scanner;
class Operators
{
	public void arithmeticoperators()
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
		System.out.println("ARITHMETIC OPERATORS");
		System.out.println("ADDITION:"+(a+b));
		System.out.println("SUBTRACTION:"+(a-b));
		System.out.println("MULTIPLICATION:"+(a*b));
		System.out.println("DIVISION:"+(a/b));

	}
	public void unaryoperators()
	{
		int a=38,b;
		int x=40,y;
		b=++a;
		y=--x;
		b++;
		--y;
		System.out.println("UNARY OPERATORS");
		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
		System.out.println("The value of x:"+x);
		System.out.println("The value of y:"+y);
		
	}
	public void conditionaloperator()
	{
		int x=43,y=21,z=90;
		System.out.println("CONDITIONAL OPERATOR");
		int largestnumber=(x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println("largestnumber:"+largestnumber);

	}
}
public class OperatorsDemo {

	public static void main(String[] args) 
	{
            Operators ops=new Operators();
            ops.arithmeticoperators();
            ops.unaryoperators();
            ops.conditionaloperator();
	}

}
