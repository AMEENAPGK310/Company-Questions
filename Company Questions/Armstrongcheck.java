package CompanyQuestions;
import java.util.Scanner;
public class Armstrongcheck {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  number");
		int a=s.nextInt();
		int num=a;
		int b=a;
		int c=0,r=1;
		int sum=0;
		while(a>0)
		{
			c++;
			a=a/10;
		}
		while(num!=0)
		{
			r=num%10;
			sum=(int)(sum+Math.pow(r,c));
			num=num/10;
		}
		

		if(sum==b)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
		

	}

}
