package CompanyQuestions;
import java.util.Scanner;
public class Nfib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int h[]=new int[n+2];
		h[0]=0;
		h[1]=1;
		int i;
		for(i=2;i<=n;i++)
		{
			h[i]=h[i-1]+h[i-2];
		}
		System.out.println(h[n]);
	}

}
