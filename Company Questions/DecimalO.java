package CompanyQuestions;
import java.util.Scanner;
public class DecimalO {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int r,o=0,i=1;
		while(d!=0)
		{
			r=d%8;
			o=o+r*i;
			d=d/8;
			i=i*10;
		}
		System.out.println(o);

	}

}
