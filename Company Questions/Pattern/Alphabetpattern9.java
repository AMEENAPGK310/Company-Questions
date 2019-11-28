package Pattern;
import java.util.Scanner;
public class Alphabetpattern9 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(j==2)
					System.out.print("c");
			}
			System.out.println(" ");
		}
		
	}

}
