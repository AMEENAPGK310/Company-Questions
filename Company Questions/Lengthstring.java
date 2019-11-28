package CompanyQuestions;
import java.util.Scanner;
public class Lengthstring {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		int i=0;
		for(char ch:str.toCharArray())
		{
			i++;
		}
		System.out.printf("length:%d",i);
		
	}

}
