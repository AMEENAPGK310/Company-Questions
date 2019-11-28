package Pattern;
import java.util.Scanner;
public class Alphabetpattern6 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k,l;
		char a='c',b='s',c='k';
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(a);
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(b);
				
			}
		   for(l=0;l<=i;l++)
		   {
			   System.out.print(c);
		   }
			System.out.println(" ");
		}

	}

}
