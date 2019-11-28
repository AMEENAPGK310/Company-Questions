package Pattern;
import java.util.Scanner;
public class Seventhpattern {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(2*i)+3;j++)
			{
				if(j==i+1)
			        System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println(" ");
		}
			
		}
        

}
