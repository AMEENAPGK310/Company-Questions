package Pattern;
import java.util.Scanner;
public class Numberpattern2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.printf("%d ",j);
			}
			System.out.println(" ");
		}
	}

}
