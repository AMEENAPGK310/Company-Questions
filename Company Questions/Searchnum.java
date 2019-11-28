package CompanyQuestions;
import java.util.Scanner;
public class Searchnum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,f=0;
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("enter the search element");
		int k=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				f=1;
				break;
			}
			else
				f=0;
		}
		if(f==1)
			System.out.println("number found at position:"+i);
	}

}
