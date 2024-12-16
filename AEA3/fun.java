public class fun{
    public static void main(String[] args){
        asterix(7);
        obelix(1);
        num(6, '5');
        asterix(3);
        obelix(5);
        num(2, '3');
    }
    public static void asterix(int rep){
        for(int i = 0; i < rep; i++){
            System.out.print('*');
        }
        System.out.println();
    }
    public static void obelix(int rep){
        for(int i = 0; i < rep; i++){
            System.out.print('-');
        }
        System.out.println();
    }
    public static void num(int rep, int num){
        for(int i = 0; i < rep; i++){
            System.out.print(num);
        }
        System.out.println();
    }
}