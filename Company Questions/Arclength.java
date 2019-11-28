package CompanyQuestions;
import java.util.Scanner;
public class Arclength {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radious");
		int r=s.nextInt();
		System.out.println("enter the angle");
		double an=s.nextDouble();
		double arc=2*3.14*r*(an/360);
		System.out.println(arc);
		
		

	}

}
