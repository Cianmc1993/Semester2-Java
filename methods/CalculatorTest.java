import java.util.Scanner;
public class CalculatorTest
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int answer;
      int no1, no2;
      char operator;
      
      System.out.println("Type in first number ");
      no1 = kb.nextInt();
      
      System.out.println("Type in second number ");
      no2 = kb.nextInt();
      
      getOperatorMenu(kb ,opt, no1, no2);
      
      // System.out.println("Insert operator: ");
//       operator = kb.next().charAt(0);
// 
//       answer = getOperatorMenu(operator, no1, no2);
//       System.out.println("The answer is  " + answer);
   }

   // public static int calculate(char op, int num1, int num2)
//    {
//            
//             if(op == '+')
//             {
//             return num1 + num2;
//             }
//          
//             else if(op == '-')
//             {
//             return num1 - num2;
//             }
//             
//             else if(op == '*')
//             {
//             return num1 * num2;
//             }
//             
//             else if(op == '/')
//             {
//             return num1 / num2;
//             }
//                         
//             else if(op == '%')
//             {
//             return num1 % num2;
//             }
//             else
//             return 0;
//             
//    }
      
       public static int getOperatorMenu(Scanner kb, char op, int num1, int num2)
       {
       int opt;
       
       System.out.println("1.add");
       System.out.println("2.subtract");
       System.out.println("3.multiply");
       System.out.println("4.divide");
       System.out.println("5.remainder");
       System.out.println("6.quit");
       
       System.out.println("Enter option: ");
       opt = kb.nextInt();
       
       switch(opt)
       {
          case 1 :
             op = '+';
             return num1 + num2;
             
          case 2 :
             op = '-';
             return num1 - num2;
             
          case 3 :
             op = '*';
             return num1 * num2;
             
          case 4 :
             op = '/';
             return num1 / num2;
             
          case 5 :
             op = '%';
             return num1 % num2;
             
          case 6 :
              break;
          default :
             System.out.println("Invalid choice");
             break;
          
         }while(opt != 6);
             return 0;
      }
}