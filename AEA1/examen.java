import java.util.Scanner;

public class examen{
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
      double total = 0;
      double price = 0;
      for(int i=0; i < 5; i++){
        do{
          System.out.print("Introdueix el preu del producte: ");
          price = Scanner.nextInt();
        }while(price<0);
        if(price > 50){
          if(price * 0.06<15){
            price = price * 0.94;
          }else{
            price -= 15;
          }
        }
        System.out.println("Preu producte numero "+(i+1)+": "+price);
        total += price;
      }
      System.out.println("El total es: "+total);
  }
}