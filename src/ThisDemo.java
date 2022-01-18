class Student
{
	int regno;
	String name;
	String branch;
	float fee;
	public void inputStudentData(int regno,String name,String branch,float fee)
	{
		regno=regno;
		name=name;
	    branch=branch;
		fee=fee;
		this.regno=regno;
		this.name=name;
	    this.branch=branch;
		this.fee=fee;
	}
	public void displayStudentData()
	{
		System.out.print(this.regno);
		System.out.print(this.name);
		System.out.print(this.branch);
		System.out.println(this.fee);

	}
}
public class ThisDemo {

	public static void main(String[] args) 
	{
     Student st=new Student();
		System.out.println("STUDENT-1");
     st.inputStudentData(101," Aman ","CSE ",90000);
     st.displayStudentData();
		System.out.println("STUDENT-2");
     st.inputStudentData(102," Ayaan ","IT ",80000);
     st.displayStudentData();
		System.out.println("STUDENT-3");
     st.inputStudentData(103," Arman ","ECE ",70000);
     st.displayStudentData();
     System.out.println("STUDENT-4");
     st.inputStudentData(104," Amir ","EEE ",60000);
     st.displayStudentData();


	}

}
