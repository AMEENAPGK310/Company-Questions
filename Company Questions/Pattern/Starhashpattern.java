package Pattern;
import java.util.Scanner;
public class Starhashpattern {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n*2;j++)
			{
				if((i+j)==n||(j-i)==n)
				{
					System.out.print("* ");
				}
				else
					System.out.print("# ");
			}
		System.out.println(" ");
		}
	}

}
