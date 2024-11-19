import java.util.Scanner;

public class arrayloop{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String[] cars = {"A", "A", "A", "A"};
        for (int e = 0; e < cars.length; e++){
          String car = Scanner.nextLine();
          cars[e]=car;         
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < cars.length; i++)
          System.out.println(cars[i]);
  }
}