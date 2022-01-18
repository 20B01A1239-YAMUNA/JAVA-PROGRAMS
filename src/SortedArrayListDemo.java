import java.util.*;
class ArrayListDemo
{
	
	public void inputstring()
	{
		ArrayList<String>list=new ArrayList<String>();
		      
        list.add("Veeranshu");
        list.add("Roshini");
        list.add("Saima");
        list.add("Priya");
        list.add("Bani");
        list.add("Aman");
        SortedSet<String>set = new TreeSet<>(list);
        System.out.println("Set of String: " + set);
					
	}
}
public class SortedArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayListDemo s=new ArrayListDemo();
		s.inputstring();

	}

		
}


