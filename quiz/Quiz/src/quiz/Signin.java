
package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Signin {
    
    public static void create_account() throws FileNotFoundException, IOException{
       
        Scanner in = new Scanner(System.in);
        
        String username;
        String Password;
        
        System.out.print("   Enter user name : ");
        username = in.nextLine();
        
        System.out.print("   Enter the password : ");
        Password = in.nextLine();
        
        File open = new File("/home/solai/Solai/quiz/Account");
        
        Boolean a = open.exists();
        
        
     
        BufferedWriter write1;
        try (FileWriter write = new FileWriter("/home/solai/Solai/quiz/Account.txt")) {
            write1 = new BufferedWriter(write);
            write1.write(username);
            write1.write(',');
            write1.write(Password);
            
            
            write1.close();
          
        }
 
  
    }
    
}
