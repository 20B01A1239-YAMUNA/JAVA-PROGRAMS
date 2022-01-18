import java.util.Scanner;
class Score
{
	String teamname,player1,player2;
	int pointsearnedplayer1,pointsearnedplayer2;
	public void scorecard(String tn,String p1,String p2)
	{
		teamname=tn;
		player1=p1;
		player2=p2;
		pointsearnedplayer1=0;
		pointsearnedplayer2=10;
	}
	public void scorepoints(String pn,int playerscore)
	{
		if(pn.equals(player1)==true)
			pointsearnedplayer1=pointsearnedplayer1+playerscore;
		else if(pn.equals(player2)==true)
			pointsearnedplayer2=pointsearnedplayer2+playerscore;
	}
	public int getpoints(String pn)
	{
		if(pn.equals(player1)==true)
			return pointsearnedplayer1;
		else if(pn.equals(player2)==true)
						return pointsearnedplayer2;
		else
			return 0;
								
	}
	public int gettotalpoints()
	{
		return pointsearnedplayer1+pointsearnedplayer2;
	}
	public void printsummary()
	{
		System.out.println(teamname+":"+gettotalpoints());
	}
}
	public class ScoreCard 
	{
	public static void main(String[] args) 
	{
		String teamname,player1,player2;
		 Scanner sc =new Scanner(System.in);
		 Score card=new Score();
	        
				System.out.println("ENTER TEAM NAME:");
		        teamname = sc.next();
		        System.out.println("ENTER PLAYER1 NAME:");
		        player1 = sc.next();
		        System.out.println("ENTER PLAYER2 NAME:");
		        player2 = sc.next();
		    int ch;
			do 
			   {
				System.out.println("1.ScorePoints\n2.GetPoints\n3.GetTotalPoints\n4.PrintSummary\n5.Exit");
				System.out.println("ENTER YOUR CHOICE:");
		         ch = sc.nextInt();
		        switch(ch) 
		        {
		        case 1:
		        	System.out.println("ENTER PLAYER NAME:");
		        	String pn=sc.next();
		        	System.out.println("ENTER SCORE");
		        	int playerscore=sc.nextInt();
		        	card.scorepoints(pn,playerscore);
		        	break;
		        case 2:
		        	System.out.println("ENTER PLAYER NAME:");
		        	 pn=sc.next();
		        	 int totalpoints=card.getpoints(pn);
		        	 System.out.println(totalpoints);
		        	
		        	
		        	break;
		        case 3:
		        	
		        	System.out.println("TOTAL SCORE:"+card.gettotalpoints());
		        	break;
		        case 4:
		        	System.out.println("TEAM NAME:"+teamname);
		        	System.out.println("TOTAL SCORE:"+card.gettotalpoints());
		            break;
		        case 5:
		        	System.out.println("EXIT");
		        	break;
		        default:
		        	System.out.println("ENTER THE VALID NUMBER");
		        	break;
		        }
		        
			}
			 while(ch!=5);

}
	}



