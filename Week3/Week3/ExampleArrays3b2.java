import java.util.*;
public class ExampleArrays3b2
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Random noGenerator = new Random();
    //Question2
    
      int[] array = new int[6];
      int placeholder=0;
      boolean go=true;
      
      for(int i = 0; i<array.length; i++){
            placeholder = noGenerator.nextInt(6)+1;
            for(int j=0; j<array.length; j++){ 
               if(placeholder == array[j]){
                    i--;
                    go=false;
               }     
            }
            if(go)array[i] = placeholder;
            go = true;
       }
       
       for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
       }



   }
}
