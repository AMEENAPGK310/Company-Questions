package CompanyQuestions;
import java.util.Scanner;
public class Hyp {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int base=s.nextInt();
		int alt=s.nextInt();
		int hyp=(base*base)+(alt*alt);
		double h=Math.sqrt(hyp);
		System.out.println("Hypotenuse of right-angled triangle:"+h);
	}

}
