import java.util.Scanner;

public class multiply{
	public static void main(String[] args){
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter 2 real numbers to multiply");

		Double number1 = myObj1.nextDouble();
		Double number2 = myObj2.nextDouble();
		System.out.println("The final result is "+ number1*number2);
	}
}