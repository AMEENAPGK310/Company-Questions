package CompanyQuestions;
import java.io.*;
import java.util.Scanner;
public class Perfectsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sq=(int)Math.sqrt(n);
		if((sq*sq)==n)
			System.out.println("perfect square");
		else
			System.out.println("not a perfect square");
	}

}
