package Pattern;
import java.util.Scanner;
public class Thirdpattern {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(k=n-1;k>i;k--)
			{
			  System.out.print(" ");
			}
			  for(j=0;j<=i;j++)
			  {
					System.out.print("* ");
			  }
			System.out.println("");
			}
	}
}