import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String teamname , inningname ;
		System.out.println("Enete teamname");
		teamname=in.nextLine();
		System.out.println("Enter inning");
		inningname=in.nextLine();
		System.out.println("Eneter run");
		int run=in.nextInt();
		System.out.println("Name: " + teamname );
		System.out.println("Scored: " + run );
		
		switch(inningname)
		{
		    case  "First" : run=run+1;
		              System.out.println("Need " + run +" to win");
		              break;
		    case "Second" : System.out.println("Match ended ");
		             break;
		    default: System.out.println("Invalid input");
		}

	}

}
