package CompanyQuestions;
import java.util.Scanner;
public class Powernum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("enter the power");
		int p=s.nextInt();
		int result=1;
		while(p!=0)
		{
			p--;
		   result=result*n;
		}
        
		System.out.println(result);

	}

}
