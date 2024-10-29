import java.util.Scanner;

public class multiply{
	public static void main(String[] args){
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter 2 real numbers to multiply");

		Int number1 = myObj1.nextInt();
		Int number2 = myObj1.nextInt();
		System.out.println("The final result is "+ number1*number2);
	}
}