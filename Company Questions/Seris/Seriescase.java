package Seris;
import java.util.Scanner;
public class Seriescase {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[n];
		b[0]=a[0];
		b[1]=Math.max(a[0],a[1]);
		for(i=2;i<n;i++)
		{
			b[i]=Math.max(a[i]+b[i-2],b[i-1]);
		}
		System.out.println(b[n-1]);
		}
}