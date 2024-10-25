import java.util.Scanner;

public class numrepe{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String total = "";
            for (int m = 1; m <= i; m++){
                total = total+i;
            }
            System.out.println(total);
        }
    }
}