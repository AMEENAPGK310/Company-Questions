package CompanyQuestions;
import java.util.Scanner;
public class Gcdarray {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j,max=0,min=0,x=1,lcm = 0;
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				if(a[i]>a[j])
				{
					max=a[i];
					min=a[j];
				}
				else 
				{
					max=a[j];
				    min=a[i];
			    }
			for(int k=0;k<n;k++)
			{
				x=k*max;
				if(x%min==0)
					lcm=x;
			}
		}

	}
		System.out.println(lcm);
	}
}