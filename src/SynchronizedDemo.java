class MultiplicationTable
{
	public synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		System.out.println(i+"*"+n+"="+(i*n));
	}
}
class Thread1 extends Thread
{
	MultiplicationTable mt;
	public Thread1(MultiplicationTable m)
	{
		mt=m;
	}
	public void run()
	{
		mt.printTable(10);
	}
}
class Thread2 extends Thread
{
	MultiplicationTable mt;
	public Thread2(MultiplicationTable m)
	{
		mt=m;
	}
	public void run()
	{
		mt.printTable(20);
	}
}

public class SynchronizedDemo 
{

	public static void main(String[] args) 
	{
		
		MultiplicationTable mt=new MultiplicationTable();
		Thread1 t1=new Thread1(mt);
		Thread2 t2=new Thread2(mt);
		t1.start();
		t2.start();
		

		

	}

}
