package CompanyQuestions;
import java.util.Scanner;
public class ConvertT {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the temperature");
		int c=s.nextInt();
		double f=(1.8*c)+32;
		System.out.println(f);
		

	}

}
