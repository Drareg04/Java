import java.util.Scanner;

public class Scan{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");

		String userName = myObj.nextLine();
		System.out.println("Hi "+ userName);
	}
}