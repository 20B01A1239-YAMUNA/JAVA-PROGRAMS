//WRITE A JAVA PRGM TO IMPLEMENT THE FINAL KEYWORD
final class Rectangle
{
	int length,breadth;
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public int area()
	{
		return length*breadth;
	}
}
public class FinalKeywordDemo 
{

	public static void main(String[] args) 
	{
        Rectangle r=new Rectangle(4,6);
        System.out.println("Area of Rectangle:"+r.area());
        
	}

}

