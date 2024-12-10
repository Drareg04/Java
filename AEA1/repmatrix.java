import java.util.Scanner;

public class  repmatrix{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int fil = num.nextInt();
        int col = num.nextInt();
        int [][] matriu = new int[fil][col];
        for(int i = 0; i < matriu.length; i++) {
            for(int j = 0; j < matriu[i].length; j++) {
                //Assign random num to all matrix cells
                do{
                System.out.println("Cell in position " + i +" "+ j);
                matriu[i][j] = num.nextInt();
                }while((matriu[i][j]<0)||(matriu[i][j]>10));
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
        for(int a = 0; a <= 10; a++) {
            int rep = 0;
            for(int i = 0; i < matriu.length; i++) {
                for(int j = 0; j < matriu[i].length; j++) {
                    if (matriu[i][j] == a) {
                        rep++;
                    }
                }
            }
            System.out.println(a + " se repite : " + rep);
        }
    }
}