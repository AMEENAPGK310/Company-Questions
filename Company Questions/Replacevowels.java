6package CompanyQuestions;
import java.util.Scanner;
public class Replacevowels {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		char[] c=str.toCharArray();
        int n=c.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				c[i]='$';
		}
		for(i=0;i<n;i++)
			System.out.println(c[i]);
				

	}

}