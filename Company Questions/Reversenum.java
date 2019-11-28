package CompanyQuestions;
import java.util.Scanner;
public class Reversenum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0,sum=0;
		int num=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
