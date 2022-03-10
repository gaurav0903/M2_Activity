import java.util.Scanner;

public class Question1 {
	
	public static String FirstlettlerCapital(String s)
	{
		String a= (s.substring(0,1)).toUpperCase();
		int i ,n=-1;
		for(i=0;i<s.length();i++)
		{
			if(Character.isWhitespace(s.charAt(i)))
			{
				n=i;
			}
		}
		String b=(s.substring(1,n)).toLowerCase();
		String c=s.substring(n).toUpperCase();
		String d= a+ b+ " " +c;
		return d;
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name :");
		String s=in.nextLine();
		System.out.print(FirstlettlerCapital(s));
		// TODO Auto-generated method stub

	}

}
