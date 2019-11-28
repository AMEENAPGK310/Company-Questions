package CompanyQuestions;
import java.util.Scanner;
public class Strongcheck {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0;
		int b=n;
		while(n!=0)
		{
		int f=1;
		int a=n%10;
		for(int i=1;i<=a;i++)
		{
			 f=f*i;
			 
		}
		sum=sum+f;
		n=n/10;
		}
		if(sum==b)
			System.out.println("strong numbr");
		else
			System.out.println("not strong numbr");


	}

}
