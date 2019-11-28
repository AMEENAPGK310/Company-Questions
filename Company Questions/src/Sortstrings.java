
import java.io.Serializable;
import java.util.Scanner;
public class Sortstrings {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i,j;
		char x;
		char[] ch=str.toCharArray();
		int n=ch.length;
		for(i=0;i<n;i++)
		  {
			for(j=i+1;j<n;j++)
			{
			   if(ch[j]<ch[i])
			   {
				x=ch[i];
				ch[i]=ch[j];
				ch[j]=x;
			   }
			}
		  }
		for(i=0;i<n;i++)
			System.out.printf("%c",ch[i]);
	}
}
