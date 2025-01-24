import java.util.Scanner;

public class  examv{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //-------------------EX1-----------------------
        int vectorex1_1[] = {2,6,5};
        int vectorex1_2[] = {3,8,7};
        int vectorex1_suma[] = new int[vectorex1_1.length];
        
        System.out.println("La suma dels dos vectors es:");
        for(int i = 0; i < vectorex1_1.length && i < vectorex1_2.length; i++){
            vectorex1_suma[i] = vectorex1_1[i] + vectorex1_2[i];
            System.out.print(vectorex1_suma[i] + " ");
        }
        //-------------------EX2-----------------------
        System.out.print("\n---------------EX2---------------\nIngresi la longitud del vector: ");
        int lgth = scan.nextInt();
        int vectorex2_1[] = new int[lgth];
        System.out.println("Ingresi els elements del vector:");
        for(int i = 0; i < vectorex2_1.length; i++){
            System.out.print("Element " + (i + 1) + ": ");
            vectorex2_1[i] = scan.nextInt();
        }
        System.out.print("Ingresi valor a buscar: ");
        int clue = scan.nextInt();
        int result = -1;
        for(int i = 0; i < vectorex2_1.length; i++){
            if(vectorex2_1[i] == clue){
                result = i;
                i = vectorex2_1.length;
            }
        }
        if(result == -1){
            System.out.print("El valor " + clue + " no s'ha trobat en el vector.");
        }else{
            System.out.print("El valor " + clue + " s'ha trobat a la posició " + result + " del vector.");
        }
    }
}