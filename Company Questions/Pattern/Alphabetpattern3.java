package Pattern;
import java.util.Scanner;
public class Alphabetpattern3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		for(int i=0;i<n;i++)
		{
			

			for(int j=0;j<=i;j++)
			{
				
				System.out.printf("%c ",k+65);
				k++;
			}
			System.out.println("");
				
		}

	}

}
