package Pattern;
import java.util.Scanner;
public class NumberPattern3 {

	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);	
	    int n=s.nextInt();
	    int i,j;
	    for(i=0;i<=n;i++)
	    {
	    	for(j=1;j<=n;j++)
	    	{
	    		if(j<=i)
	    		{
	    			System.out.print(j);
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	for(j=n;j>=1;j--)
	    	{
	    		if(j<=i)
	    		{
	    			System.out.print(j);
	    		}
	    			
	    	}
	    	System.out.println(" ");
	    }
	}

}