package Pattern;
import java.util.Scanner;

public class Alphabetpattern2 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		int l=st.length();
		char ch[]=st.toCharArray();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c ",ch[j]);
			}
			System.out.println(" ");
		}
		
				
	}

}
