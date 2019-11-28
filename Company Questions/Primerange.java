package CompanyQuestions;
import java.util.Scanner;
public class Primerange {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i,j,f=0;
		for(i=a+1;i<b;i++)
		{
			f=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
				
			}
			if(f==0)
		    	   System.out.println(i);
				
		}
		
	}

}
