import java.util.Scanner;

public class geometry{
	public static void main(String[] args){
		String figure = "";
		Scanner scanimput = new Scanner(System.in);
		figure = obtenerFigura(scanimput, "What geometrical figure do you want to calculate: \n(triangle, cercle, trapezi, rombe, paralellogram:");		
		double resultat = 0;
		if (figure.equals("triangle")||figure.equals("rombe")||figure.equals("paralellogram")) {
			System.out.print("\033[H\033[2J");
			int heigth = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the heigth of the "+figure+": ");
			System.out.print("\033[H\033[2J");
			int width = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the width of the "+figure+": ");
			resultat = heigth*width;
			if (figure.equals("triangle")){
				resultat = resultat/2;
			}
		}else if (figure.equals("cercle")) {
			double pi = 3.1415;
			System.out.print("\033[H\033[2J");
			int radi = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the radius of the "+figure+": ");
			resultat =	pi*radi*radi;
		}else{
			System.out.print("\033[H\033[2J");
			int heigth = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the heigth of the "+figure+": ");
			System.out.print("\033[H\033[2J");
			int bigbase = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the big base of the "+figure+": ");
			System.out.print("\033[H\033[2J");
			int smallbase = obtenerNumero(scanimput, "Calculating are of the "+figure+":", "Whats the small base of the "+figure+": ");
			resultat =	heigth*(smallbase+(bigbase-smallbase)/2);
		}
		System.out.print("The total are of the "+figure+" is "+resultat+"cm²");
	}
	//Check if scanner is valid geometrical figure
    public static String obtenerFigura(Scanner scanimput, String mensaje) {
	    //create variables to avoid breaking
	    String frase = "";
	    boolean entradaValida = false;
	    //check if scanner is valid
	    while (!entradaValida) {
	        System.out.println(mensaje);
	        String imput = scanimput.nextLine().toLowerCase();
	        if (imput.equals("triangle")||imput.equals("cercle")||imput.equals("trapezi")||imput.equals("rombe")||imput.equals("paralellogram")) {
	            frase = imput;
	            entradaValida = true; 
	        } else{
	        	System.out.print("\033[H\033[2J");
	        }
	    }
	    return frase;
	   }
	//Check if scanner is int
    public static int obtenerNumero(Scanner scanimput, String mensaje, String mensaje2) {
        //create variables to avoid breaking
        int numero = 0;
        boolean entradaValida = false;
        //check if scanner is int
        while (!entradaValida) {
            System.out.println(mensaje);
            System.out.println(mensaje2);
            if (scanimput.hasNextInt()) {
                numero = scanimput.nextInt();
                entradaValida = true; 
            } else {
            	System.out.print("\033[H\033[2J");
            	scanimput.next(); 
            }
        }
        return numero;
    }
}