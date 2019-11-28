package CompanyQuestions;
import java.util.Scanner;
public class Numpalindrome {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int num=n;
		int i,r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==num)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		s.close();
		

	}

}
