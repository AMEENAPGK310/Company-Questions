package CompanyQuestions;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		String b = "";
	    int l=str.length();
	    for(int i=l-1;i>=0;i--)
	    {
	    	b=b+str.charAt(i);
	    }
		if(str.equals(b))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}

}
