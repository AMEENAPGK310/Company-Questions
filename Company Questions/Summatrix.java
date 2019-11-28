package CompanyQuestions;
import java.util.Scanner;
public class Summatrix {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.println(sum[i][j]);
			}
			
		}
        
	}

}
