 import java.util.Random;

      public class ExampleArrays3b4 {
      
          public static void main(String[] args) {
   
             Random rand = new Random();
             int temp =0;
             int[] numbers = new int[20];
             for(int i=0; i<numbers.length; i++){
                  numbers[i] = rand.nextInt(50) + 1;
             }
             
             for(int i=0; i<numbers.length; i++){
                 for(int j=0; j<numbers.length-1; j++){
                     if(numbers[j]<numbers[j+1]){
                        temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                     }
                     
                 }
             }
             
             for(int i=0; i<numbers.length; i++){
                 System.out.println(numbers[i]);
             }
             
        
             
             
          }
      }
