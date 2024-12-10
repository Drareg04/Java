import java.util.Random;
import java.util.ArrayList;

public class  pentakill{
    public static void main(String[] args) {
        Random randomNum = new Random();
        System.out.println("---------------------");
        System.out.println("MATRIU RANDOM NUM");
        System.out.println("---------------------");

        int [][] matriu = new int[5][5];
        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        float total;
        int max;
        int repeat;
        int diagonal;
        int lastline;

        total = max = repeat = diagonal = lastline = 0;
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                //Assign random num to all matrix cells
                matriu[i][j] = randomNum.nextInt(101);
                //Print matrix
                System.out.print(matriu[i][j]+ " ");
                //Get total number to get the avarage num
                total += matriu[i][j];
                //Get all prime numbers
                if (matriu[i][j] < 2) {
                        primes.add(matriu[i][j]);
                    }
                for (int x = 2; x <= matriu[i][j]; x++){
                    if (matriu[i][j] == x){
                        primes.add(x);
                    }else if ((matriu[i][j] % x) == 0) {
                        x = matriu[i][j] + 1;
                    }
                }
                //Check if num is bigger than last one
                if (matriu[i][j] > max){
                    max = matriu[i][j];
                    repeat = 1;
                //Check if num it's equal to max add repeat
                }else if (matriu[i][j] == max) {
                    repeat++;
                }
                //Check if num is pair
                if (matriu[i][j] % 2 == 0){
                    pairs.add(matriu[i][j]);
                }
            }
            //Print matrix 2.0
            System.out.println();
        }
        for(int i = 0; i < matriu.length; i++) {
            diagonal += matriu[i][i];
        }
        for(int i = matriu.length - 1; i >= 0; i--) {
            diagonal += matriu[i][matriu.length-1-i];
        }
        for(int i = 0; i < matriu.length; i++) {
            lastline += matriu[matriu.length - 1][i];
        }
        System.out.println("\nEl promedio de la matriz es: " + total/25);
        System.out.println("El numero mas grande es " + max + " y se repite "+ repeat);
        System.out.println("Los siguientes numeros son primos: "+primes);
        System.out.println("Los siguientes numeros son pares: "+pairs);
        System.out.println("La suma de las diagonales es: "+ diagonal);
        System.out.println("La suma de la ultima linea es: "+ lastline);
    }
}