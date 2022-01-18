package numbers;

public class NumbersDemo {

	public static void main(String[] args)
	{
		NaturalNumbers n=new NaturalNumbers();
		EvenNumbers e=new EvenNumbers();
		OddNumbers o =new OddNumbers();
		RandomNumbers r =new RandomNumbers();
		n.start();
		n.natural();
		e.start();
		e.even();
		o.start();
		o.odd();
		r.start();
		r.random();



	}

}
