class Class
{
	int a=100,b=20;
	String str1="Roshini";
	String str2="Sharma";
	public void method1()
	{
		System.out.println("calling method1....");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("value of a+b:"+(a+b));

	}
	public void method2()
	{
		System.out.println("calling method2....");
		System.out.println("String1:"+str1);
		System.out.println("String2:"+str2);
		System.out.println("String1+String2:"+(str1 + str2));

	}

	
}
public class ClassDemo {

	public static void main(String[] args)
	{
      Class c=new Class();
      c.method1();
      c.method2();

	}

}
