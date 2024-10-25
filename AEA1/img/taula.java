import java.util.Scanner;

public class taula{
    public static void main(String[] args){
        Scanner myObj1 = new Scanner(System.in);
        System.out.print("Quina taula de multiplicar vols?: ");
        int numero = myObj1.nextInt();
        int i = 0;
        while (i < 10){
            i++;
            int resultat = i*numero;
            System.out.println(numero+" * "+i+" = "+resultat);
        }

    }
}