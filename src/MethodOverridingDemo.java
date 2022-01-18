//WRITE A JAVA PRGM TO IMPLEMENT THE CONCEPT OF METHODOVERRIDING
class Bank
{
	public int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	public int getRateOfInterest()
	{
		return 6;
	}
}
class UnionBank extends Bank
{
	public int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI extends Bank
{
	public int getRateOfInterest()
	{
		return 8;
	}
}
class Indian extends Bank
{
	public int getRateOfInterest()
	{
		return 9;
	}
}



public class MethodOverridingDemo
{

	public static void main(String[] args)
	{
		SBI s=new SBI();
		UnionBank ub=new UnionBank();
		ICICI i=new ICICI();
		Indian in=new Indian();
		System.out.println("SBIBANK INTEREST    :"+s.getRateOfInterest());
		System.out.println("UNIONBANK INTEREST  :"+ub.getRateOfInterest());
		System.out.println("ICICIBANK INTEREST  :"+i.getRateOfInterest());
		System.out.println("INDIANBANK INTEREST :"+in.getRateOfInterest());


	}

}
