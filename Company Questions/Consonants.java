package CompanyQuestions;
import java.util.Scanner;
public class Consonants {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		
			   System.out.println("charcter is vowel and uppercase");
		   else
			System.out.println("character is consonant and uppercase");

			System.out.println("character is vowel and lowercase");
		
		else
			System.out.println("character is consonant and lowercase");
				
	}

}g
