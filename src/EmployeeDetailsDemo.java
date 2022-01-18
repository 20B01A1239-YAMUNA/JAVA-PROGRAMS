//Static keyword
class Employee
{
	int idnumber;
	String name;
	String department;
	float salary;
	static String company="Rahul Enterprises";
	static String country="India";
	public void employeeData(int idno,String n,String d,float s)
	{
		idnumber=idno;
		name=n;
		department=d;
		salary=s;
		
	}
	public static String getCompany()
	{
		return company;	
	}

	

public static String getCountry()
{
	return country;	
}
public void displayData()
{
	System.out.println("Employee id number:"+idnumber);
	System.out.println("Employee Name:"+name);
	System.out.println("Employee Department:"+department);
	System.out.println("Employee Salary:"+salary);
}
}
public class EmployeeDetailsDemo {

	public static void main(String[] args)
	{
    Employee e=new Employee();
    System.out.println("----------->EMPLOYEE-1<-----------");
    e.employeeData(101,"Aditya","Human Resource",80000);
    System.out.println("Employee Company:"+e.getCompany());
    System.out.println("Employee Country:"+e.getCountry());
    e.displayData();
    System.out.println("----------->EMPLOYEE-2<-----------");
    e.employeeData(102,"Aman","Finance",90000);
    System.out.println("Employee Company:"+e.getCompany());
    System.out.println("Employee Country:"+e.getCountry());
    e.displayData();
	}

}
