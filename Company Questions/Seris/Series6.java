package Seris;
import java.util.Scanner;
public class Series6 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=0,c=0;
		for(int i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
			c=a+2;
			a=c;
			}
			if(i%2==0)
			{
			c=b+1;
			b=c;
			}

		}
		System.out.println(c);
		
	}

}