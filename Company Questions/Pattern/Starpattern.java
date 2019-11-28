package Pattern;
import java.util.Scanner;
public class Starpattern {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j||(i+j)==n-1)
					System.out.print("* ");
				else
					System.out.print("0 ");
			}
				
			System.out.println(" ");
		}
	}

}
