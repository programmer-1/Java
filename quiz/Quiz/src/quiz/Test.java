
package quiz;

import java.util.Scanner;


public class Test {

      
    public static int points = 0;
    public static int i = 0;
    
    public static void Test_case(Question questions){
        
       
        Scanner get = new Scanner(System.in); 
     
        
    // Questions evluation    
         i  +=1;
         System.out.println(questions.question);
         System.out.println(questions.a);
         System.out.println(questions.b);
         System.out.println(questions.c);
         System.out.println(questions.d);
         
         String answer = get.nextLine();
         
         if(answer.equals(questions.answer)){
             
             System.out.println("\nCorrect\n");
             points++;
 
             
         }
         
         else{
             
             System.out.println("\nWrong\n");
             
         }

       // Score 
         if(i==4)
         {
             System.out.println("Your Score is :" + points + "/4");
             System.out.println("Logout");
             System.out.println("----------------------------------------------");
         
         }
        }
    
    
}
