package Pattern;
import java.util.Scanner;
public class Fifthpattern {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=0;i<n-1;i++) {
		for(k=i;k<n;k++) {
		System.out.print(" ");
		}
		for(j=1;j<(i*2);j++) {
		System.out.print("*");
		}
		System.out.println();
		}

		for(i=n-2;i>1;i--)
		  {
		    for(k=n;k>=i;k--) {
		    System.out.print(" ");
		    }
		    for(j=2;j<2*i-1;j++) {
		    System.out.print("*");
		    }
		    System.out.println();
		  }
	}

}
