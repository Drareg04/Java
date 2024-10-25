import java.util.Scanner;
import java.util.Random;

public class joc{
    public static void main(String[] args){
        Scanner guess = new Scanner(System.in);
        Random randomNum = new Random();
        int random = randomNum.nextInt(11);
        //int randomNum = (int)(Math.random() * 11); // 0 to 10 
        int numguess = 0;
        String Frase = "Mes sort la proxima vegada, ";
        for (int i = 3; i>0; i--){
            do{
                System.out.print("Introdueix un numero del 0 al 10: ");
                numguess = guess.nextInt();
            }while((numguess<0)||(numguess>10));
            if(numguess==random){
                i = 0;
                Frase = "Feliçitats, ";
            }else{
                System.out.println("Error, el numero no es "+numguess);
            }
        }
        System.out.println(Frase+"el numero era "+random);
    }
}