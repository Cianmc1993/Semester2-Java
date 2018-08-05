import java.util.*;
public class ExampleArrays3a1
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      int rowTotal =0;
      int columnTotal =0;
    //Question1
       int[][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
       
      for(int j=0; j<num.length; j++){ 
       for(int i=0; i<num[0].length; i++){
          System.out.print(num[j][i]+"   ");
        
       }
       System.out.println();
     } 
     
     for(int j=0; j<num.length; j++){ 
       for(int i=0; i<num[0].length; i++){
          rowTotal += num[j][i];
        
       }
       System.out.println(rowTotal);
       rowTotal = 0;
     } 
     
     for(int j=0; j<num[0].length; j++){ 
       for(int i=0; i<num.length; i++){
          columnTotal += num[i][j];
        
       }
       System.out.println(columnTotal);
       columnTotal = 0;
     } 
       

       
      
       
       
       /*
       int[] ages = {18,19,20,21,22,23,24,25};
         
       int studentNumber;
       int birthYear = 0;
       boolean probe = true;
       
       do{
         System.out.println("Enter your studentnumber, or press 0 to end the program.");
         studentNumber = keyboardIn.nextInt();
         if(studentNumber>0 && studentNumber<9){
            birthYear = calcAge(ages[(studentNumber-1)]);
            System.out.println("Your student number is: "+studentNumber);
            System.out.println("Your age is: "+ages[(studentNumber-1)]);
            System.out.println("Your birth Year is: "+birthYear);
         }else probe = false;

       }while(probe);
       System.out.println("Goodbye");
             
   }
   
   public static int calcAge(int age){
      int birthYear = 2018 - age;
      return birthYear;
   }
   */
   }
   

}
