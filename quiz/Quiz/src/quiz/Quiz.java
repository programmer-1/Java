package quiz;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Quiz {

    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
          
        
       Scanner input = new Scanner(System.in);
  
    //Object creation for Login class
       
       Signin signin_object = new Signin();
       Login login_object = new Login();
        int ch;
       
   
   
       do
       {
     //get login or sign up choice from user
           
       System.out.println("----------------------------------------------");
       System.out.println("   Enter :\n    1. Login\n    2. Sign in\n    3. Exit\n");
       System.out.print("   Enter your choice : ");
       ch = input.nextInt(); 
       
        switch(ch){
           
         case 1:   
                Boolean found = login_object.Login_verification( );
                if(found.equals(true)){
                 
                   Scanner get_question = new Scanner(new File("/home/solai/Solai/quiz/Question"));
                                    
                   while(get_question.hasNext() )
                   {
                       String question = get_question.next();
                       String a = get_question.next();
                       String b = get_question.next();
                       String c = get_question.next();
                       String d = get_question.next();
                       String answer = get_question.next();

                       Question questions = new Question(question , a , b , c , d , answer ) ;
                       Test.Test_case(questions);
                       
                   }
                                
                }
                else{
       
                    System.out.println("Invalid username or password");
                    
         }  
                break;
                
    //Get user name and password for sign up            
                
          case 2: signin_object.create_account();
                 break;
    
          case 3: break;
          
          default : System.out.println("INVALID CHOICE");
          break;
       
        }
        
       }
       while(ch!=3);
           
     
    }    
   
  
}

