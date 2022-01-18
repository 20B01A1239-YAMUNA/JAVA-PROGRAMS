//WRITE A JAVA PRGM TO IMPLEMENT THE CONSTRUCTOR WITH AND WITHOUT PARAMETERS
class Employe
{
	int idno;
	String name;
	float salary;
	public Employe()
	{
		idno=0;
		name="";
		salary=0.0f;
		
	}
	public Employe(int i)
	{
		System.out.println("integer constructor");
		idno=i;
	}
	public Employe(String n)
	{
		System.out.println("String constructor");
		name=n;
	}
	public Employe(float s)
	{
		System.out.println("float constructor");
		salary=s;
	}
	public Employe(int i,String n,float s)
	{
		System.out.println("integer,float,String constructor");
		idno=i;
		name=n;
		salary=s;
	}
	public void displaydata()
	{
		System.out.println("Employee IDNO  :"+idno);
		System.out.println("Employee NAME  :"+name);
		System.out.println("Employee Salary:"+salary);

	}

}
public class ConstructorDemo
{

	public static void main(String[] args)
	{
       Employe e=new Employe();
       Employe e1=new Employe(101);
       Employe e2=new Employe("Aman Junaid Khan");
       Employe e3=new Employe(75000f);
       Employe e4=new Employe(101,"Aman Junaid Khan",75000f);
       e.displaydata();
       e1.displaydata();
       e2.displaydata();
       e3.displaydata();
       e4.displaydata();
       
	}

}
