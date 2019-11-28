package CompanyQuestions;
import java.util.Scanner;
public class Uniqueelement {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int c=0;
		int i,j,k;
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=0;j<i-1;j++)
			{
				if(a[i]==a[j])
				c++;
			}
			for(k=i+1;k<n;k++)
			{
				if(a[i]==a[k])
					c++;
			}
			if(c==0)
				System.out.println(a[i]);
			
		}

	}

}
