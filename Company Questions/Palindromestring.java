package CompanyQuestions;
import java.util.Scanner;
public class Palindromestring {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int l=str.length();
		String b="";
		for(int i=l-1;i>=0;i--)
			b=b+str.charAt(i);
		if(b.equals(str))
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");

	}

}
