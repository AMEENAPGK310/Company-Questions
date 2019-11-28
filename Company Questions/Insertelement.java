package CompanyQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class Insertelement {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n+1];
		int i;
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter the element which is to be inserted");
		int k=s.nextInt();
		System.out.println("enter the position");
		int pos=s.nextInt();
		for(i=n-1;i>=pos;i--)
		{
			a[i+1]=a[i];
			
		}
		a[pos]=k;
		for(i=0;i<n+1;i++)
			System.out.println(a[i]);
			}

}
