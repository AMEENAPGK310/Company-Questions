package Seris;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);	
	   int n=s.nextInt();
	   float a=1;
	   float b=a+1;
	   float c=0;
	   System.out.println(a);
	   System.out.println(b);
	   for(int i=2;i<n;i++)
	   {
		  if(i%2==0)
		  {
		  c=a*3;
		  System.out.println(c);
		  a=c;
		  }
		  else if(i%2!=0)
		  {
			  c=b*3;
			  System.out.println(c);
			  b=c;
			 }
		  }
		  
	   }
}
