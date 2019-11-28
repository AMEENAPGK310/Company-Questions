package CompanyQuestions;
import java.util.Scanner;
public class binaryO {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int bi=s.nextInt();
		int i = 0,d=0,r,r2;
		int o=0;
		while(bi!=0)
		{
			r=bi%10;
			d=d+(int)(r*Math.pow(2,i));
			bi=bi/10;
			i++;
			
		}
		i=1;
		while(d!=0)
		{
			r2=d%8;
			o=o+r2*i;
			d=d/8;
			i=i*10;
		}
		System.out.println(o);
			
	}


}
