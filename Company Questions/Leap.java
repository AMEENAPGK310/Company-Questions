package CompanyQuestions;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
					System.out.println("leap year");
				else
					System.out.println("not a leap year");
			}
			else
				System.out.println("leap year");
		}
		else
			System.out.println("not a leap year");
	}

}
