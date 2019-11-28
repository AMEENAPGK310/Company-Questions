package CompanyQuestions;
import java.util.Scanner;
public class Sumprime {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first limit");
		int n1=s.nextInt();
		System.out.println("enter the second limit");
		int n2=s.nextInt();
		int i,sum=0,c=0,j;
		for(i=n1;i<=n2;i++)
		{ 
			c=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0 && i!=1)
				sum=sum+i;
		}
		System.out.println(sum);

	}

}
