package CompanyQuestions;
import java.util.Scanner;
public class Revfib
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		int i;
		for(i=2;i<n;i++)
			a[i]=a[i-1]+a[i-2];
		for(i=n-1;i>=0;i--)
			System.out.printf("%d ",a[i]);
					
		}

	}

