import java.util.Scanner;

public class fun{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        char chr;
        int rep;
        for(int i = 0; i < 6; i++){
            System.out.print("Que vol imprimir: ");
            chr = num.next().charAt(0);
            System.out.print("Quantes vegades: ");
            rep = num.nextInt();
            joker(rep, chr);
        }
    }
    public static void joker(int rep, char chr){
        for(int i = 0; i < rep; i++){
            System.out.print(chr);
        }
        System.out.println();
    }
}