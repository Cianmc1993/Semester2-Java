import java.util.*;
public class ExampleArrays3a3
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
    //Question3
    
     System.out.println("Enter size of magic square:");
     int choice = keyboardIn.nextInt();
       int[][] magic = new int[choice][choice];
       int [] tester = new int[choice*choice];
       
     

      for(int j=0; j<magic.length; j++){ 
       for(int i=0; i<magic[0].length; i++){
          System.out.println("Please enter value for row "+(j+1)+" column "+(i+1));
          magic[j][i] = keyboardIn.nextInt();
       }
      }
  
    for(int k=1; k<=(choice*choice);k++){ 
     for(int j=0; j<magic.length; j++){ 
       for(int i=0; i<magic[0].length; i++){
          if(k==magic[j][i])tester[k-1]++;
       }
     }
    }
    
    for(int i=0; i<tester.length; i++){
      if(tester[i]!=1){
            System.out.println("Not filled properly");
            break;
       }
    }
     
     
     
     
   

   }




}
