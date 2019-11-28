package CompanyQuestions;
import java.util.Scanner;
public class Primen
{
  public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=s.nextInt();
	  int i,f=0;
	  for(i=2;i<n;i++)
	  {
		  if(n%i==0)
		      f=1;
	  }
	  if(f==0)
		  System.out.println("prime number");
	  else
		  System.out.println("not prime number");
		

	}

}
