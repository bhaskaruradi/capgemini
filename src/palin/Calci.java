package palin;
import java.util.Scanner;
public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1");
		double num1=sc.nextInt();
		System.out.println("enter num2");
		double num2=sc.nextInt();      
		System.out.println("enter operator");
		String ch=sc.next();
		switch (ch)
		{
		 
		case "+": 
			System.out.println(num1+num2);
		break;
		case "-": 
			System.out.println(num1-num2);
		break;
		case "*": 
			System.out.println(num1*num2);
		break;
		case "/": 
			System.out.println(num1/num2);
		break;
		default :
			System.out.println("Invalid operation");
			break;
		}
	}

}
