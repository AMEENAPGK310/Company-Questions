package CompanyQuestions;
import java.util.Scanner;
public class Encipher {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the alphabet");
		char c=s.next().charAt(0);
		System.out.println("enter the key");
		int k=s.nextInt();
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
				c=(char) (c+k);
               System.out.println(c);
	     }

}
}