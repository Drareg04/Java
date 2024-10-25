import java.util.Scanner;

public class Nota{
	public static void main(String[] args){
	while (true){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Quina nota has tret? ");
		int nota = myObj.nextInt();
		if (nota >= 9 && nota <= 10) {
			System.out.println("La teva nota final és Excel·lent");
			break;
		}else if (nota >= 6.5 && nota < 9) {
			System.out.println("La teva nota final és Notable");
			break;
		}else if (nota >= 5 && nota < 6.5) {
			System.out.println("La teva nota final és Suficient");
			break;
		}else if (nota >= 0 && nota < 5) {
			System.out.println("La teva nota final és Insuficient");
			break;
		}else{
			System.out.println("Introdueix una nota valida");
		}
	}
	}
}