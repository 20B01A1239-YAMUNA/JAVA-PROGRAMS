//WRITE A JAVA PRGM TO DEMONSTRATE 1-D ARRAY
class OneDArray
{
	int month_days[];
	int n;
	public void displaydata()
	{
		int month_days[];
		month_days=new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		month_days[7]=31;
		month_days[8]=30;
		month_days[9]=31;
		month_days[10]=30;
		month_days[11]=31;

		for(n=1;n<=12;n++)
		{
		switch(n)
		{
		case 1:
			System.out.println("January month contains "+month_days[0]+" days");
			break;
		case 2:
			System.out.println("February month contains "+month_days[1]+" days");
			break;
		case 3:
			System.out.println("March month contains "+month_days[2]+" days");
			break;
		case 4:
			System.out.println("April month contains "+month_days[3]+" days");
			break;
		case 5:
			System.out.println("May month contains "+month_days[4]+" days");
			break;
		case 6:
			System.out.println("June month contains "+month_days[5]+" days");
			break;
		case 7:
			System.out.println("July month contains "+month_days[6]+" days");
			break;
		case 8:
			System.out.println("August month contains "+month_days[7]+" days");
			break;
		case 9:
			System.out.println("September month contains "+month_days[8]+" days");
			break;
		case 10:
			System.out.println("October month contains "+month_days[9]+" days");
			break;
		case 11:
			System.out.println("November month contains "+month_days[10]+" days");
			break;
		case 12:
			System.out.println("December month contains "+month_days[11]+" days");
			break;

		}
		}
	}
}
public class OneDArrayDemo {

	public static void main(String[] args) 
	{
        OneDArray oa=new OneDArray();
        oa.displaydata();
        
	}

}
