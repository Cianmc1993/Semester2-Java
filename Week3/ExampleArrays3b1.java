import java.util.*;
public class ExampleArrays3b1
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
    //Question1
    
   
       int[] students = new int[15];
       int[] distri = new int[10];
       int temp=0;
       int modal=0;

      for(int j=0; j<students.length; j++){ 
          System.out.println("Please enter grade for student "+(j+1));
          students[j] = keyboardIn.nextInt();
          if(students[j]>10 || students[j]<0){
            System.out.println("Please enter a valid grade.");
            j--;
          }
      }
      
      for(int i=0; i<=10; i++){
            for(int j=0; j<students.length; j++){
               if(i==students[j])distri[i]++;
            } 
      }
      
      for(int j=0; j<distri.length; j++){
              System.out.println("The grade "+j+" appeared "+distri[j]+" times.");
              if(distri[j]>temp)modal=j;
      }
      
      
      System.out.println("The modal is "+distri[modal]);
      
      /*
      for(int i=0; i<distri.length; i++){
            for(int j=0; j<distri.length-1; j++){
               if(distri[j]<distri[j+1]){
                  temp = distri[j];
                  distri[j] = distri[j+1];
                  distri[j+1] = temp;    
               } 
            } 
      } 
      */
      
      
      

  
         
     
     
     
   

   }




}
