package CompanyQuestions;
import java.util.*;
public class Smallestnum {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int num4=s.nextInt();
		int num5=s.nextInt();
		if(num1<num2&&num1<num3&&num1<num4&&num1<num5)
			System.out.println("smallest:"+num1);
		if(num2<num1&&num2<num3&&num2<num4&&num2<num5)
			System.out.println("smallest:"+num2);
		if(num3<num1&&num3<num2&&num3<num4&&num3<num5)
			System.out.println("smallest:"+num3);
		if(num4<num1&&num4<num2&&num4<num3&&num4<num5)
			System.out.println("smallest:"+num4);
		if(num5<num1&&num5<num2&&num5<num3&&num5<num4)
			System.out.println("smallest:"+num5);



		

	}

}
