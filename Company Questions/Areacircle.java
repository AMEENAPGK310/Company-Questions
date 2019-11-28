package CompanyQuestions;
import java.util.Scanner;
public class Areacircle {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radious");
		int r=s.nextInt();
		double area=3.14*r*r;
		System.out.println(area);

	}

}
