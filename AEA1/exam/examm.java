import java.util.Scanner;

public class  examm{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresi el numero de files que tindrà la matriu: ");
        int fil = scan.nextInt();
        System.out.print("Ingresi el numero de columnes que tindrà la matriu: ");
        int col = scan.nextInt();
        int matriu[][] = new int[fil][col];
        System.out.println("Ingresi els elements de la matriu:");
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                System.out.print("Posició " + i + ", " + j + ": ");
                matriu[i][j] = scan.nextInt();
            }
        }
        System.out.println("Resultat matriu: ");
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                System.out.print(matriu[i][j] + " ");
            }System.out.println();
        }       
    }
}