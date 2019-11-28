package CompanyQuestions;
import java.util.Scanner;
public class Fibseries {

	public static void main(String[] args) 
	{
    Scanner s=new Scanner(System.in);
	System.out.println("enter the limit");
	int n=s.nextInt();
	int a=0,b=1,c=0,i;
	System.out.println(a);
	System.out.println(b);
	for(i=2;i<n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
		
	}

}
