import java.util.Scanner;
import java.util.Random;

public class  tictactoe {
    public static String white = "\u001B[37m";
    public static String red = "\u001B[31m";
    public static String blue = "\u001B[34m";
    public static String green = "\u001B[32m";
    public static String clear = "\033[H\033[2J";
    public static char [][] game = new char[3][3];
    public static char [][][][] matrix = new char[3][3][3][3];
    public static int player;
    public static boolean notfinished = true;
    public static void main(String[] args) {
        tictactoe tictactoe = new tictactoe();
        Scanner num = new Scanner(System.in);
        Random randomNum = new Random();
        player = randomNum.nextInt(2);
        int choice = 0;
        for(int i = 0; i < game.length; i++) {
            for(int j = 0; j < game[i].length; j++) {
                game[i][j] = ' ';
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                for(int k = 0; k < matrix[i][j].length; k++) {
                    for(int l = 0; l < matrix[i][j][k].length; l++) {
                        //Assign space to all cells
                        matrix[i][j][k][l] = ' ';
                    }
                }
            }
        }
        int choice2, check;;
        System.out.println(clear);
        System.out.println("\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░\u001B[36m██╗\u001B[91m░░░░░░░\u001B[36m██╗███████╗██╗\u001B[91m░░░░░░\u001B[36m█████╗\u001B[91m░░\u001B[36m█████╗\u001B[91m░\u001B[36m███╗\u001B[91m░░░\u001B[36m███╗███████╗\u001B[91m░░░░░░");
        System.out.println("░░\u001B[36m██║\u001B[91m░░\u001B[36m██╗\u001B[91m░░\u001B[36m██║██╔════╝██║\u001B[91m░░░░░\u001B[36m██╔══██╗██╔══██╗████╗\u001B[91m░\u001B[36m████║██╔════╝\u001B[91m░░░░░░");
        System.out.println("░░\u001B[36m╚██╗████╗██╔╝█████╗\u001B[91m░░\u001B[36m██║\u001B[91m░░░░░\u001B[36m██║\u001B[91m░░\u001B[36m╚═╝██║\u001B[91m░░\u001B[36m██║██╔████╔██║█████╗\u001B[91m░░░░░░░░");
        System.out.println("░░░\u001B[36m████╔═████║\u001B[91m░\u001B[36m██╔══╝\u001B[91m░░\u001B[36m██║\u001B[91m░░░░░\u001B[36m██║\u001B[91m░░\u001B[36m██╗██║\u001B[91m░░\u001B[36m██║██║╚██╔╝██║██╔══╝\u001B[91m░░░░░░░░");
        System.out.println("░░░\u001B[36m╚██╔╝\u001B[91m░\u001B[36m╚██╔╝\u001B[91m░\u001B[36m███████╗███████╗╚█████╔╝╚█████╔╝██║\u001B[91m░\u001B[36m╚═╝\u001B[91m░\u001B[36m██║███████╗\u001B[91m░░░░░░");
        System.out.println("░░░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m╚═╝\u001B[91m░░\u001B[36m╚══════╝╚══════╝\u001B[91m░\u001B[36m╚════╝\u001B[91m░░\u001B[36m╚════╝\u001B[91m░\u001B[36m╚═╝\u001B[91m░░░░░\u001B[36m╚═╝╚══════╝\u001B[91m░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m████████╗\u001B[91m░\u001B[36m█████╗\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m╚══██╔══╝██╔══██╗\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║\u001B[91m░░\u001B[36m██║\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║\u001B[91m░░\u001B[36m██║\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m╚█████╔╝\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░\u001B[36m╚═╝\u001B[91m░░░░\u001B[36m╚════╝\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░\u001B[36m██████╗██╗\u001B[91m░░░\u001B[36m██╗██████╗\u001B[91m░\u001B[36m███████╗██████╗\u001B[91m░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░\u001B[36m██╔════╝██║\u001B[91m░░░\u001B[36m██║██╔══██╗██╔════╝██╔══██╗\u001B[91m░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░\u001B[36m╚█████╗\u001B[91m░\u001B[36m██║\u001B[91m░░░\u001B[36m██║██████╔╝█████╗\u001B[91m░░\u001B[36m██████╔╝\u001B[91m░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░\u001B[36m╚═══██╗██║\u001B[91m░░░\u001B[36m██║██╔═══╝\u001B[91m░\u001B[36m██╔══╝\u001B[91m░░\u001B[36m██╔══██╗\u001B[91m░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░\u001B[36m██████╔╝╚██████╔╝██║\u001B[91m░░░░░\u001B[36m███████╗██║\u001B[91m░░\u001B[36m██║\u001B[91m░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░\u001B[36m╚═════╝\u001B[91m░░\u001B[36m╚═════╝\u001B[91m░\u001B[36m╚═╝\u001B[91m░░░░░\u001B[36m╚══════╝╚═╝\u001B[91m░░\u001B[36m╚═╝\u001B[91m░░░░░░░░░░░░░░░░");
        System.out.println("░\u001B[36m████████╗██╗\u001B[91m░\u001B[36m█████╗\u001B[91m░\u001B[36m████████╗\u001B[91m░\u001B[36m█████╗\u001B[91m░░\u001B[36m█████╗\u001B[91m░\u001B[36m████████╗\u001B[91m░\u001B[36m█████╗\u001B[91m░\u001B[36m███████╗\u001B[91m░");
        System.out.println("░\u001B[36m╚══██╔══╝██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝\u001B[91m░");
        System.out.println("░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║██║\u001B[91m░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m███████║██║\u001B[91m░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║\u001B[91m░░\u001B[36m██║█████╗\u001B[91m░░░");
        System.out.println("░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║██║\u001B[91m░░\u001B[36m██╗\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██╔══██║██║\u001B[91m░░\u001B[36m██╗\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║\u001B[91m░░\u001B[36m██║██╔══╝\u001B[91m░░░");
        System.out.println("░░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║╚█████╔╝\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m██║\u001B[91m░░\u001B[36m██║╚█████╔╝\u001B[91m░░░\u001B[36m██║\u001B[91m░░░\u001B[36m╚█████╔╝███████╗\u001B[91m░");
        System.out.println("░░░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m╚═╝\u001B[91m░\u001B[36m╚════╝\u001B[91m░░░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m╚═╝\u001B[91m░░\u001B[36m╚═╝\u001B[91m░\u001B[36m╚════╝\u001B[91m░░░░\u001B[36m╚═╝\u001B[91m░░░░\u001B[36m╚════╝\u001B[91m░\u001B[36m╚══════╝\u001B[91m░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        String wait = num.nextLine();
        while(notfinished){
            tictactoe.displayall();
            if(choice == 0){
                for (int g = 0; g < 3; g++){
                    for (int g2 = 0; g2 < 3; g2++){
                        if (game[g][g2] == ' ')
                            game[g][g2] = '1';
                    }
                }
                tictactoe.displayall();
                do{
                    choice = tictactoe.LLegirEnterTeclat(num);
                    check = tictactoe.checkchoice(choice);
                }while(check == 0);
                tictactoe.displayall();
            }
            tictactoe.displaytiny(choice);
            do{
                choice2 = tictactoe.LLegirEnterTeclat(num);
                check = tictactoe.placesign(choice, choice2);
            }while(check == 0);
            int win = tictactoe.checkwin(choice);
            if (win == 1)
                tictactoe.placewin(choice);
                tictactoe.checkbigwin();
            choice = tictactoe.checkchoice(choice2);
            if (notfinished){
                if (player == 0){
                    player = 1;
                }else{
                    player = 0;
                }
            }
        }
        String win;
        if(player == 0){
            System.out.println(clear);
            System.out.println("\u001B[36m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░\u001B[91m██╗\u001B[36m░░\u001B[91m██╗██╗\u001B[36m░\u001B[91m██████╗\u001B[36m░░░░░░░░░░░░░░░░░\u001B[91m██╗\u001B[36m░░░░░░░\u001B[91m██╗██╗███╗\u001B[36m░░\u001B[91m██╗\u001B[36m░\u001B[91m██████╗\u001B[36m░░");
            System.out.println("░░\u001B[91m╚██╗██╔╝╚█║██╔════╝\u001B[36m░░░░░░░░░░░░░░░░░\u001B[91m██║\u001B[36m░░\u001B[91m██╗\u001B[36m░░\u001B[91m██║██║████╗\u001B[36m░\u001B[91m██║██╔════╝\u001B[36m░░");
            System.out.println("░░░\u001B[91m╚███╔╝\u001B[36m░░\u001B[91m╚╝╚█████╗\u001B[36m░░░░░░░░░░░░░░░░░░\u001B[91m╚██╗████╗██╔╝██║██╔██╗██║╚█████╗\u001B[36m░░░");
            System.out.println("░░░\u001B[91m██╔██╗\u001B[36m░░░░░\u001B[91m╚═══██╗\u001B[36m░░░░░░░░░░░░░░░░░░\u001B[91m████╔═████║\u001B[36m░\u001B[91m██║██║╚████║░\u001B[91m╚═══██╗\u001B[36m░░");
            System.out.println("░░\u001B[91m██╔╝╚██╗\u001B[36m░░░\u001B[91m██████╔╝\u001B[36m░░░░░░░░░░░░░░░░░░\u001B[91m╚██╔╝\u001B[36m░\u001B[91m╚██╔╝\u001B[36m░\u001B[91m██║██║\u001B[36m░\u001B[91m╚███║██████╔╝\u001B[36m░░");
            System.out.println("░░\u001B[91m╚═╝\u001B[36m░░\u001B[91m╚═╝\u001B[36m░░░\u001B[91m╚═════╝\u001B[36m░░░░░░░░░░░░░░░░░░░░\u001B[91m╚═╝\u001B[36m░░░\u001B[91m╚═╝\u001B[36m░░\u001B[91m╚═╝╚═╝\u001B[36m░░\u001B[91m╚══╝╚═════╝\u001B[36m░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░"+white);
            }
        else{
            System.out.println(clear);
            System.out.println("\u001B[91m░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("░░░\u001B[36m█████╗\u001B[91m░\u001B[36m██╗\u001B[91m░\u001B[36m██████╗\u001B[91m░░░░░░░░░░░░░░░░░\u001B[36m██╗\u001B[91m░░░░░░░\u001B[36m██╗██╗███╗\u001B[91m░░\u001B[36m██╗\u001B[91m░\u001B[36m██████╗\u001B[91m░░");
            System.out.println("░░\u001B[36m██╔══██╗╚█║██╔════╝\u001B[91m░░░░░░░░░░░░░░░░░\u001B[36m██║\u001B[91m░░\u001B[36m██╗\u001B[91m░░\u001B[36m██║██║████╗\u001B[91m░\u001B[36m██║██╔════╝\u001B[91m░░");
            System.out.println("░░\u001B[36m██║\u001B[91m░░\u001B[36m██║\u001B[91m░\u001B[36m╚╝╚█████╗\u001B[91m░░░░░░░░░░░░░░░░░░\u001B[36m╚██╗████╗██╔╝██║██╔██╗██║╚█████╗\u001B[91m░░░");
            System.out.println("░░\u001B[36m██║\u001B[91m░░\u001B[36m██║\u001B[91m░░░░\u001B[36m╚═══██╗\u001B[91m░░░░░░░░░░░░░░░░░░\u001B[36m████╔═████║\u001B[91m░\u001B[36m██║██║╚████║\u001B[91m░\u001B[36m╚═══██╗\u001B[91m░░");
            System.out.println("░░\u001B[36m╚█████╔╝\u001B[91m░░░\u001B[36m██████╔╝\u001B[91m░░░░░░░░░░░░░░░░░░\u001B[36m╚██╔╝\u001B[91m░\u001B[36m╚██╔╝\u001B[91m░\u001B[36m██║██║\u001B[91m░\u001B[36m╚███║██████╔╝\u001B[91m░░");
            System.out.println("░░░\u001B[36m╚════╝\u001B[91m░░░░\u001B[36m╚═════╝\u001B[91m░░░░░░░░░░░░░░░░░░░░\u001B[36m╚═╝\u001B[91m░░░\u001B[36m╚═╝\u001B[91m░░\u001B[36m╚═╝╚═╝\u001B[91m░░\u001B[36m╚══╝╚═════╝\u001B[91m░░░");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░"+white);
        }
    }
    public void displayall() {
        System.out.print(clear);
        if (player == 0){
            System.out.println(red + "X" + white + "'s turn\n");
        }else{
            System.out.println(blue + "O" + white + "'s turn\n");
        }
        System.out.println(white + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        int j = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int k = 0; k < matrix[i][j].length; k++) {
                for(j = 0; j < matrix[i].length; j++) {
                    for(int l = 0; l < matrix[i][j][k].length; l++) {
                        //Print
                        if (j == 0 && l == 0){
                            System.out.print("N");
                        }if (matrix[i][j][k][l] == 'X')
                            System.out.print(" " + red + matrix[i][j][k][l] + white + " ");
                        else if(matrix[i][j][k][l] == 'O')
                            System.out.print(" " + blue + matrix[i][j][k][l] + white + " ");
                        else
                            System.out.print(" " + matrix[i][j][k][l] + " ");
                        if (l != 2){
                            if (game[i][j] == '1')
                                System.out.print(green + " |" + white);
                            else
                                System.out.print(" |");
                        }
                    }System.out.print(" N");
                }if (k != 2){
                    System.out.println();
                    for (int n = 0; n < 3; n++) {
                        if (game[i][n] == '1')
                            System.out.print("N" + green + " ------------ " + white);
                        else
                            System.out.print("N ------------ ");
                    }
                    System.out.println("N");
                }else{
                    System.out.println();
                }
                j = 0;
            }System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        }
    }
    public void displaytiny(int choice) {
        int i, j;

        if (choice <= 3)
            i = 0;
        else if (choice <= 6)
            i = 1;
        else
            i = 2;
        j = choice - (i*3) - 1;
        System.out.println("\n\nZZZZZZZZZZZZZZZZ");
        for(int k = 0; k < matrix[i][j].length; k++) {
            for(int l = 0; l < matrix[i][j][k].length; l++) {
                //Print
                if (l == 0){
                    System.out.print("N");
                }if (matrix[i][j][k][l] == 'X')
                    System.out.print(" " + red + matrix[i][j][k][l] + white + " ");
                else if(matrix[i][j][k][l] == 'O')
                    System.out.print(" " + blue + matrix[i][j][k][l] + white + " ");
                else
                    System.out.print(" " + matrix[i][j][k][l] + " ");
                if (l != 2){
                    System.out.print(green + " |" + white);
                }
            }if (k != 2){
                    System.out.println(" N\nN" + green + "--------------" + white + "N");
            }
        }System.out.println(" N\nZZZZZZZZZZZZZZZZ");
    }

    public int placesign(int choice, int choice2) {
        int i, j, k, l;
        
        if (choice < 1)
            return (0);
        else if (choice <= 3)
            i = 0;
        else if (choice <= 6)
            i = 1;
        else
            i = 2;
        j = choice - (i*3) - 1;
        if (choice2 < 1)
            return (0);
        else if (choice2 <= 3 )
            k = 0;
        else if (choice2 <= 6)
            k = 1;
        else if (choice2 <= 9)
            k = 2;
        else{
            i = 0;
            return (0);
        }
        l = choice2 - (k*3) - 1;
        if(matrix[i][j][k][l] == ' '){
            if(player == 0)
                matrix[i][j][k][l] = 'X';
            else
                matrix[i][j][k][l] = 'O';
            return (1);
        }
        return (0);
    }
    public int checkwin(int choice) {
        int i, j;
        char sign;

        if(player == 0)
                sign = 'X';
            else
                sign = 'O';
        if (choice <= 3)
            i = 0;
        else if (choice <= 6)
            i = 1;
        else
            i = 2;
        j = choice - (i*3) - 1;
        if (matrix[i][j][0][0] == sign && matrix[i][j][0][1] == sign && matrix[i][j][0][2] == sign)
            return (1);
        if (matrix[i][j][1][0] == sign && matrix[i][j][1][1] == sign && matrix[i][j][1][2] == sign)
            return (1);
        if (matrix[i][j][2][0] == sign && matrix[i][j][2][1] == sign && matrix[i][j][2][2] == sign)
            return (1);
        if (matrix[i][j][0][0] == sign && matrix[i][j][1][0] == sign && matrix[i][j][2][0] == sign)
            return (1);
        if (matrix[i][j][0][1] == sign && matrix[i][j][1][1] == sign && matrix[i][j][2][1] == sign)
            return (1);
        if (matrix[i][j][0][2] == sign && matrix[i][j][1][2] == sign && matrix[i][j][2][2] == sign)
            return (1);
        if (matrix[i][j][0][0] == sign && matrix[i][j][1][1] == sign && matrix[i][j][2][2] == sign)
            return (1);
        if (matrix[i][j][0][2] == sign && matrix[i][j][1][1] == sign && matrix[i][j][2][0] == sign)
            return (1);
        return (0);
    }
    public void placewin(int choice) {
        int i, j;
        char sign;

        if(player == 0)
                sign = 'X';
            else
                sign = 'O';

        if (choice <= 3)
            i = 0;
        else if (choice <= 6)
            i = 1;
        else
            i = 2;
        j = choice - (i*3) - 1;
        if(player == 0)
            game[i][j] = 'X';
        else
            game[i][j] = 'O';
        for(int k = 0; k < matrix[i][j].length; k++) {
            for(int l = 0; l < matrix[i][j][k].length; l++) {
                matrix[i][j][k][l] = sign;
            }

        }
    }
    public int checkchoice(int choice) {
        int i, j;

        if (choice <= 3)
            i = 0;
        else if (choice <= 6)
            i = 1;
        else if (choice <= 9)
            i = 2;
        else{
            i = 0;
            return (0);
        }
        j = choice - (i*3) - 1;
        if (game[i][j] != ' ' && game[i][j] != '1')
            return (0);
        for (int g = 0; g < 3; g++){
            for (int g2 = 0; g2 < 3; g2++){
                if (game[g][g2] == '1'){
                    game[g][g2] = ' ';
                }
            }
        }
        game[i][j] = '1';
        return (choice);
    }
    public void checkbigwin() {
        char sign;

        if(player == 0)
                sign = 'X';
            else
                sign = 'O';
        if (game[0][0] == sign && game[0][1] == sign && game[0][2] == sign)
            notfinished = false;
        if (game[1][0] == sign && game[1][1] == sign && game[1][2] == sign)
            notfinished = false;
        if (game[2][0] == sign && game[2][1] == sign && game[2][2] == sign)
            notfinished = false;
        if (game[0][0] == sign && game[1][0] == sign && game[2][0] == sign)
            notfinished = false;
        if (game[0][1] == sign && game[1][1] == sign && game[2][1] == sign)
            notfinished = false;
        if (game[0][2] == sign && game[1][2] == sign && game[2][2] == sign)
            notfinished = false;
        if (game[0][0] == sign && game[1][1] == sign && game[2][2] == sign)
            notfinished = false;
        if (game[0][2] == sign && game[1][1] == sign && game[2][0] == sign)
            notfinished = false;
    }
    public static int LLegirEnterTeclat(Scanner scan){
        boolean correcte=false;
        int Llegit;
        Llegit = 0;
        scan.next();
        do{
            correcte = scan.hasNextInt();
            if (correcte) {
                Llegit = scan.nextInt();
            } 
        }
        while (!correcte);
        return (Llegit);
    }
}