interface internalmarks
{
	
		int total=30;
		public void main();

}
interface externalmarks 
{
	int total=70;
	public void main();
}

 class TotalMarks implements internalmarks,externalmarks
{
	int internal,external,total;
	public TotalMarks(int i,int e)
	{
		internal=i;
		external=e;
	}
	public void midmarks()
	{
		System.out.println("total internal marks:"+internal+"/"+internalmarks.total);
	}
	public void semmarks()
	{
		System.out.println("total external marks:"+external+"/"+externalmarks.total);
	}
	public void main()
	{
		System.out.println("total marks:"+(internal+external+"/"+(internalmarks.total+externalmarks.total)));

		
	}


}
 

public class MultipleInheritanceDemo
{

	public static void main(String[] args)
	
    {
		TotalMarks fm = new TotalMarks(29,65);
		fm.midmarks();
		fm.semmarks();
		fm.main();

    }

}
