package CompanyQuestions;
import java.util.Scanner;
public class Checkfib {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int d=s.nextInt();
		int a=0,b=1,c=0,i;
		if(d==0)
			System.out.println("yes");
		for(i=0;i<d;i++)
		{   
		   c=a+b;
		   a=b;
		   b=c;

		if(c==d)
		{
			System.out.println("yes");
			break;
		}
		if(c>d)
		{
			System.out.println("not");
			break;
		}
		}
		s.close();

	}

}
