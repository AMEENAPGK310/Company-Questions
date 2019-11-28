package Pattern;
import java.util.Scanner;
public class Alphabetpattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int l=st.length();
		char c[]=st.toCharArray();
		for(int i=l;i>=0;i--)
		{
			for(int j=0;j<i;j++)
				System.out.printf("%c ",c[j]);
			System.out.println(" ");
		}
	}

}
