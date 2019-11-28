package Seris;
import java.util.Scanner;
public class Series3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,a=0,b=2,c = 0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=3;i<n;i++)
		{
			if(i%2!=0)
			{
			  c=i*i-1;
			  System.out.print(c+" ");
			 }
			if(i%2==0)
			{
				c=(i*i)-2;
				System.out.print(c+" ");
				
			}
		}
	}
}


