package CompanyQuestions;
import java.util.Scanner;
public class Lcmnum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i,lcm=0,max;
		max=(a>b)?a:b;
		for(i=max;i<=(a*b);i++)
		{
			if(i%a==0&&i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);

	}

}
