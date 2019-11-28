package Pattern;
import java.util.Scanner;
public class Numberpattern1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.printf("%d ",j);
			System.out.println(" ");
		}
	}

}