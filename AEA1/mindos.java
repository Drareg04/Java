import java.util.Random;

public class  mindos{
    public static void main(String[] args) {
        Random randomNum = new Random();

        int [][] matriu = new int[5][5];
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
        int min = matriu[0][0];
        int min2 = 10;
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                //Check if its the lowest number
                if (matriu[i][j] <= min) {
                    min = matriu[i][j];
                }else if (matriu[i][j] < min2) {
                    min2 = matriu[i][j];
                }
            }
        }
        System.out.println("El segon numero mes petit es: " + min2);
    }
}