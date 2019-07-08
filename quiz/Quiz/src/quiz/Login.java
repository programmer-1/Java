
package quiz;

import java.io.File;

import java.util.Scanner;


public class Login {
    
    public static boolean Login_verification( ){
    
       boolean found = false; 
       
       String temp_user_name;
       String temp_password;
       
       try{
           
           // get user name and password from the user to login
                Scanner read = new Scanner(System.in);
                
                System.out.print("   User Name  :");
                String username = read.nextLine();
                
                System.out.print("   Password   :");
                String password = read.nextLine();
        
           try (Scanner check = new Scanner(new File("/home/solai/Solai/quiz/Account.txt"))) {
               check.useDelimiter("[,\n]");
               
               while(check.hasNext() && !found){
                   
                   temp_user_name = check.next();
                   temp_password = check.next();
                   
                   found = (temp_user_name.trim().equals(username.trim()) && temp_password.trim().equals(password.trim()));
                   
                   
               }
           }
           return found;
           
       }
       catch(Exception exe){
       
           System.out.println("ERROR");
       
       }
        
       return found;
    
    }
    
    
      
}
