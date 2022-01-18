import java.util.*;
class ArrayListss
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
        System.out.println("<---------------Example on ArrayList--------------->");
        System.out.println("Set of String: " + set);
					
	}
}
class HashMaps
{
	public void countingWords()
	{
		String str="Java C javascript python C javascript C javascript python C++ javascript DataStructures C javascript Java python C";
		
		String[] st=str.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<st.length-1;i++)
		{
			if(hm.containsKey(st[i]))
			{
				hm.put(st[i],hm.get(st[i])+1);
			}
			else
			{
				hm.put(st[i],1);
			}
		}
		 System.out.println("<----------------Example on HashMap---------------->");
		System.out.println(hm);
	}
}
class HashTables
{
	public void hashTable()
	{
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		 hm.put(101,"Aman");
		 hm.put(102,"Ayaan");
		 hm.put(103,"Arman");
		 hm.put(104,"Aditya");
		 hm.put(105,"Arjun");
		 System.out.println("<---------------Example on HashTable--------------->");
		System.out.println(hm);
	}
}



public class CollectionFrameWorkDemo {

	public static void main(String[] args) {
		ArrayListss s=new ArrayListss();
		s.inputstring();
		HashTables h=new HashTables();
		h.hashTable();
		HashMaps hm=new HashMaps();
		hm.countingWords();
		

	}

}
