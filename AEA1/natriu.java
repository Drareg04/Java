import java.util.Random;
import java.util.Scanner;

public class  natriu{
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner num = new Scanner(System.in);

        int col = num.nextInt();
        int [][] matriu = new int[5][col];
        System.out.println("---------------------");
        System.out.println("MATRIU RANDOM NUM");
        System.out.println("---------------------");
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                //Assign random num to all matrix cells
                matriu[i][j] = randomNum.nextInt(11);
                //Print matrix
                System.out.print(matriu[i][j]+ " ");
            }
            //Print matrix 2.0
            System.out.println();
        }
    }
}