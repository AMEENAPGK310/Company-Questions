package Seris;
import java.util.Scanner;
public class Series4 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=4;
		System.out.print(a+" ");
		for(int i=1;i<n;i++)
		{
			int b=a+(i*i);
			System.out.print(b+" ");
			a=b;
			
		}
		
	}

}
