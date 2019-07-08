package quiz;

import java.util.Scanner;
import java.io.File;

public class Quiz {

    
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
     
       String username;
       String password;
       String filepath = "Login_verification";
       
       
       System.out.print("User Name : ");
       username = input.nextLine();
       
       System.out.println("Password  : ");
       password = input.nextLine();
       
       Login Login_object = new Login();
       Boolean found = Login_object.Login_verification(username , password , filepath);
       if(found.equals(true)){
            
        
       String[] Q = new String[50];
       String[] answer = new String[10]; 
       
       Scanner check  = new Scanner(new File(Question));
       
       int i;       
       for(i = 0; i <= 10; i++){
       
           Q[i] = input.useDelimiter("[,\n]");
           check.hasNext();
           
           Question questions =  new Question( Q[i] , answer ) ;
       
           Test(questions);
       
       }
    
    
       }
       
       else{
       
           System.out.println("Invalid username or password");
       
       }

        
    }
    
        public static void Test(Question [] questions){
        
            
        Scanner input = new Scanner(System.in); 
        
        int points = 0;
        
        for( int i = 0 ; i < questions.length ; i++){
        
      
         
         System.out.println(questions[i].prompt);
         String answer = input.nextLine();
         
         if(answer.equals(questions[i].answer)){
             
             System.out.println("\nCorrect\n");
             points++;
 
             
         }
         
         else{
             
             System.out.println("\nWrong\n");
             
         }
         
                                
        }
    
       System.out.println("\nYour Score is :" + points + "/2" );
        
    
    
    }
}
