import java.util.*; 
class CountingWords
{
	public void countingWords()
	{
		String str="Java C javascript python C javascript C javascript python C++ javascript DataStructures C javascript Java python C";
		
		String[] st=str.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<>();
		
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
		System.out.println(hm);
	}
}
public class HashMapDemo
{
	public static void main(String[] args)
	{
		CountingWords cw=new CountingWords();
		cw.countingWords();
	}
		  
		 

}


