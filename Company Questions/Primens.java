package CompanyQuestions;
import java.util.Scanner;
public class Primens {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=s.nextInt();
		int i,j;
		for(i=2;i<=limit;i++)
		{
			int f=0;
			for(j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				f=1;
			}
			}
			if(f==2) {
			System.out.println(i);
			}
				
		}
		
		s.close();
		

	}

}
