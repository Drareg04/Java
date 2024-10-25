import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        int preutotal = 0;
        Scanner scanimput = new Scanner(System.in);

        preutotal = obtenerNumero(scanimput, "What's the price of you'r purchase: ");

        if(preutotal >= 100){
        	if((preutotal*0.08)>10){
        		System.out.println("The final price it's "+ (preutotal-10)+"£");
        	}else{
        		System.out.println("The final price it's "+ (preutotal*0.92)+"£");
        	}
		}else{
			System.out.println("The final price it's "+ preutotal+"£");
		}
        scanimput.close();
    }

    public static int obtenerNumero(Scanner scanimput, String mensaje) {
        int numero = 0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            System.out.print(mensaje);
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