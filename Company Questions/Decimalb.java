package CompanyQuestions;
import java.util.Scanner;
public class Decimalb {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int i=0;
		int b[]=new int[100];
		while(n>0)
		{
			b[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.printf("%d",b[j]);
	}

}
