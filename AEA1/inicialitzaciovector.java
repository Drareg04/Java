public class inicialitzaciovector{
    public static void main(String[] args) {
      int[] arrayValorsDobles = new int[51];
      int vfinal = 100;
      for(int i=0; i <= (vfinal/2); i++){
        arrayValorsDobles[i] = i*2;
      }
      System.out.print("S'ha generat l'array: ["+arrayValorsDobles[0]);
      for(int i = 1; i < arrayValorsDobles.length; i++){
        System.out.print(", "+arrayValorsDobles[i]);
      }
      System.out.print("]");
  }
}