import java.util.Scanner;

public class  nxn{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int fil = num.nextInt();
        int col = num.nextInt();
        int [][] matriu = new int[fil][col];
        int [][] matriu2 = new int[fil][col];
        int [][] matriusuma = new int[fil][col];
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                //Assign random num to all matrix cells
                System.out.println("Cell in position " + i +" "+ j);
                matriu[i][j] = num.nextInt();
            }
            //Enter
            System.out.println();
        }
        for(int i = 0; i < matriu2.length; i++) {
            for(int j = 0; j < matriu2[i].length; j++) {
                //Assign random num to all matrix cells
                System.out.println("Cell in position " + i +" "+ j);
                matriu2[i][j] = num.nextInt();
            }
            //Enter
            System.out.println();
        }
        for(int i = 0; i < matriusuma.length; i++) {
            for(int j = 0; j < matriusuma[i].length; j++) {
                //Assign random num to all matrix cells
                matriusuma[i][j] = matriu[i][j] + matriu2[i][j];
            }
            //Enter
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("MATRIU 1");
        System.out.println("---------------------");
        //Print matrix
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("MATRIU 2");
        System.out.println("---------------------");
        //Print matrix
        for(int i = 0; i < matriu2.length; i++) {
            for(int j = 0; j < matriu2[i].length; j++) {
                System.out.print(matriu2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("MATRIU SUMA");
        System.out.println("---------------------");
        //Print matrix
        for(int i = 0; i < matriusuma.length; i++) {
            for(int j = 0; j < matriusuma[i].length; j++) {
                System.out.print(matriusuma[i][j]+ " ");
            }
            System.out.println();
        }
    }
}