package CompanyQuestions;
import java.util.Scanner;
public class Binaryd {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int bi=s.nextInt();
		int i = 0,d=0,r;
		while(bi!=0)
		{
			r=bi%10;
			d=d+(int)(r*Math.pow(2,i));
			bi=bi/10;
			i++;
			
		}
		System.out.println(d);
	}

}
