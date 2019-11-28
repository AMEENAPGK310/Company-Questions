package Pattern;
import java.util.Scanner;
public class Alphabetpattern7 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0)
					System.out.print("c ");
				else if(i==n)
					System.out.print("k ");
			   else if(j==0||j==n-1)
				System.out.print("s ");
			   else
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
