import java.util.Scanner;

public class triangle{
	public static void main(String[] args){
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		System.out.print("Enter the high of the triangle in centimeters: ");
		int number1 = myObj1.nextInt();
		System.out.print("Enter the width of the trianglein centimeters: ");
		int number2 = myObj2.nextInt();
		int number = (number1*number2)/2;
		System.out.println("The are of the triangle is "+number+"cm²");
	}
}