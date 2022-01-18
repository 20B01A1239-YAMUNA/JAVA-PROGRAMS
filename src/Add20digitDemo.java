import java.util.*;
class Add20DigitNumbers{
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	public void inputdata()
	{
		System.out.println("Enter str1 value:");
		str1=sc.next();
		System.out.println("Enter str2 value:");
		str2=sc.next();
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		for(int i=str1.length()-1;i>=0;i--)
		{
		     arr1.add(Integer.parseInt((str1.charAt(i)+"")));
		}
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		for(int i=str2.length()-1;i>=0;i--)
		{
		arr2.add(Integer.parseInt((str2.charAt(i)+"")));
		}
		ArrayList<Integer> sum= new ArrayList<Integer>();
		for(int i=0;i<arr1.size();i++)
		{
			int a=(arr1.get(i));
			int b=(arr2.get(i));
			int c=a+b;
			if(c>9 && i!=arr1.size()-1) {
			   int rem=c/10;
			   c=c%10;
			   
			int d=arr1.get(i+1);
			d+=rem;
			      arr1.set(i+1,d);
			      sum.add(c);
			}
			else {
				
				sum.add(c);
			}
		}
			for(int i=sum.size()-1;i>=0;i--)
			{
				System.out.print(sum.get(i));
			}

		
	}
}
public class Add20digitDemo {

	public static void main(String[] args) 
	{
		Add20DigitNumbers a=new Add20DigitNumbers();
		a.inputdata();
	}

}
