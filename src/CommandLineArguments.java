//WRITE A JAVA PRGM THAT USE COMMAND LINE ARGUMENTS
public class CommandLineArguments {

	public static void main(String[] args)
	{
       int first_num=Integer.parseInt(args[0]);
       int second_num=Integer.parseInt(args[1]);
       int c=first_num+second_num;
       System.out.println("Addition:"+c);

	}

}
