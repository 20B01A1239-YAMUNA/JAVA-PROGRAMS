import java.util.*;
import java.util.Scanner;
class  List
{
	public void insert()
	{
		LinkedList<Integer> l1 =new LinkedList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		System.out.println("List after created\n"+l1);
		l1.addLast(17);  
		l1.addFirst(11);
		System.out.println("List after inserted\n"+l1);
   

	}
	public void delete()
	{
		LinkedList<Integer> l2 =new LinkedList<Integer>();
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l2.add(16);
		System.out.println("List after created\n"+l2);
		l2.removeFirst();
		l2.removeLast();
		System.out.println("List after deleted\n"+l2);
	}
	public void display()
	{
		LinkedList<Integer> l3 =new LinkedList<Integer>();
		l3.add(12);
		l3.add(13);
		l3.add(14);
		l3.add(15);
		l3.add(16);
		System.out.println("Display the created list\n"+l3);
		
		 
	}

	}
public class LinkedListCollections
{
  public static void main(String[] args)
  {
	  List l=new List();
	  Scanner sc=new Scanner(System.in);
	  int ch;
	  
	  
	  do 
	  {
		  System.out.println("enter your choice in the given below:");
		  System.out.println("1.insert\n2.delete\n3.display\n4.exit");
		  ch=sc.nextInt();
		
		  switch(ch)
		  {
		  case 1:
			  l.insert();
			  break;
		  case 2:
			  l.delete();
			  break;
		  case 3:
			  l.display();
			  break;
		  case 4:
			  System.out.println("EXIT");
			  break;
		  default:
			  System.out.println("invalid option");
			  break;
		  }
	  }
  
	  while(ch!=4);
	  
	  
  
	  
  }

}


