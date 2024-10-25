import java.util.Scanner;

public class mes{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	System.out.print("Introdueix un mes: ");
	int numero = myObj.nextInt();
	Scanner myObj2 = new Scanner(System.in);
	switch (numero){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("El mes te 31 dies");
			break;
	 	case 4:case 6:case 9:case 11:
			System.out.println("El mes te 30 dies");
			break;
		case 2:
			System.out.print("Introdueix un any: ");
			int numero2 = myObj2.nextInt();
			int last_digit = numero2 % 4;
			if (last_digit==0){
				System.out.println("El mes te 29 dies");
			}else{
				System.out.println("El mes te 28 dies");
			}
			break;
		default:
			System.out.println("Introdueix un número vàlid");
	}
	}
}