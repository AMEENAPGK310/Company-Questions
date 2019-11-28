package Seris;
import java.util.Scanner;
public class Series5 {

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   float a=(float) 0.5;
	   float j=3;
	   System.out.print(a+" ");
	   for(int i=1;i<n;i++)
	   {
		   float c=a*j;
		   System.out.print(c+" ");
		   j=+3;
		   a=c;
		   
	   }
	}

}
