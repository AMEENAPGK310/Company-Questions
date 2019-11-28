package CompanyQuestions;
import java.util.Scanner;
public class Changecase {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char st=s.next().charAt(0);
		if(st>='a'&&st<='z')
		{
			st=(char) (st-32);
			System.out.println(st);
		}
		else if(st>='A'&&st<='Z')
		{
			st=(char) (st+32);
			System.out.println(st);
		}
			
		

	}

}
