import java.util.Scanner;

public class Dia{
	public static void main(String[] args){
	int z = 1;
	while (z == 1){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Introdueix un numero entre el 1 i el 7: ");
		String numero = myObj.nextLine();
		if (numero.equals("1")) {
			System.out.println("Dilluns");
			z = z+1;
		}else if (numero.equals("2")) {
			System.out.println("Dimarts");
			z = z+1;
		}else if (numero.equals("3")) {
			System.out.println("Dimecres");
			z = z+1;
		}else if (numero.equals("4")) {
			System.out.println("Dijous");
			z = z+1;
		}else if (numero.equals("5")) {
			System.out.println("Divendres");
			z = z+1;
		}else if (numero.equals("6")) {
			System.out.println("Dissabte");
			z = z+1;
		}else if (numero.equals("7")) {
			System.out.println("Diumenge");
			z = z+1;
		}else{
			System.out.println("Introdueix un número vàlid");
		}
	}
	}
}