package CompanyQuestions;
import java.util.Scanner;
public class Greatest3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
        int a=s.nextInt();
        System.out.println("enter the second number");
        int b=s.nextInt();
        System.out.println("enter the third number");
        int c=s.nextInt();
        int seclargest=0;
        if(a>b&&a<c)
        	seclargest=a;
        else if(b<c)
        	seclargest=b;
        else
        	seclargest=c;
        
        System.out.println(seclargest);
                        

      }

}
