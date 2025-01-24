import java.util.Scanner;
import java.util.Random;

public class  arrayD4{
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner num = new Scanner(System.in);
        int fil = num.nextInt();
        int col = num.nextInt();
        int fil2 = num.nextInt();
        int col2 = num.nextInt();
        int [][][][] matriu = new int[fil][col][fil2][col2];
        System.out.println("-------------------------------------------");
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                for(int k = 0; k < matriu[i][j].length; k++) {
                    for(int l = 0; l < matriu[i][j][k].length; l++) {
                        //Assign random num to all matrix cells
                        matriu[i][j][k][l] = randomNum.nextInt(10);
                    }
                }
            }
        }
        System.out.println("\n");
        for (int i = 0, j = 0; i < matriu.length; i++){
            for(int l = 0, k = 0; l < matriu[i][j][k].length; l++) {
                System.out.print("- ");
            }
            if (j != matriu[i].length-1){
                System.out.print("- ");
                j = i;
            }
        }
        System.out.println();
        int i = 0;
        for(int j = 0; j < matriu[i].length; j++) {
            for(int k = 0; k < matriu[i][j].length; k++) {
                for(i = 0; i < matriu.length; i++) {
                    for(int l = 0; l < matriu[i][j][k].length; l++) {
                        //Print
                        System.out.print(matriu[i][j][k][l]+ " ");
                    }if (i < matriu.length-1){
                        System.out.print("| ");
                    }
                }System.out.println();
                i = 0;
            }for (int w = 0, x = 0; w < matriu.length; w++){
                for(int z = 0, y = 0; z < matriu[w][x][y].length; z++) {
                    System.out.print("- ");
                }
                if (x != matriu[w].length-1){
                    System.out.print("- ");
                    x = w;
                }   
            }System.out.println();
        }
    }
}