package CompanyQuestions;
import java.util.Scanner;
public class Delvowels {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		String st=str.replaceAll("[AEIOUaeiou]","");
		System.out.println(st);

	}

}
