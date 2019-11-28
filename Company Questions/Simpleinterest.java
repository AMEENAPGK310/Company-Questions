package CompanyQuestions;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int n=s.nextInt();
		int r=s.nextInt();
		double i=p*n*r;
		System.out.println("Simple interest:"+i);

	}

}
