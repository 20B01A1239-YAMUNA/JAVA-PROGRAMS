//WRITE A JAVA PRGM TO IMPLEMENT METHOD OVERLOAD CONCEPT
class MethodOverload
{
	public void addition()
	{
		System.out.println("method with no arguments");
		int a=12,b=13,c=14;
		System.out.println(a+b+c);
		
	}
	public int addition(int a,int b,int c)
	{
		System.out.println("method with three int arguments");
		return a+b+c;
	}
	public float addition(float a,float b,float c)
	{
		System.out.println("method with three float arguments");
		return a+b+c;
	}
	public double addition(double a,double b,double c)
	{
		System.out.println("method with three double arguments");
		return a+b+c;
	}
	public String addition(String a,String b,String c)
	{
		System.out.println("method with three string arguments");
		return a+b+c;
	}
}
public class methodOverloadingDemo 
{

	public static void main(String[] args) 
	{
		MethodOverload mo=new MethodOverload();
		mo.addition();
		int i=mo.addition(2,3,4);
		System.out.println("Addition of three integer numbers:"+i);
		float f=mo.addition(3.4f,4.5f,6.9f);
		System.out.println("Addition of three float numbers:"+f);
		double d=mo.addition(45.67,78.33,76.21);
		System.out.println("Addition of three double numbers:"+d);
		String s=mo.addition("Yamuna"," Sri"," Dharmavarapu");
		System.out.println("Addition of three Strings:"+s);

	}



}
