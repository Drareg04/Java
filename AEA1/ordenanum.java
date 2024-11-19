public class ordenanum{
    public static void main(String[] args) {
      float[] ordenanum = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
      float min = ordenanum[0]; 
      float max = ordenanum[0];
      for(int i=0; i<ordenanum.length; i++){
        if(ordenanum[i]>max){
          max = ordenanum[i];
        }else if (ordenanum[i]<min) {
          min = ordenanum[i];
        }
      }
      System.out.print("El numero mes gran es: "+max+"\nEl numero mes petit es: "+min);
  }
}