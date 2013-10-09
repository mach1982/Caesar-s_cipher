mport java.lang.*;
import java.util.*; 


//A simple cispher cipher , which is also an example of a for loop.
public class Program
{


public static void main(String args[]) 
    {
       // Scanner input = new Scanner(System.in);
			//System.out.println("Enter the plaintext"); 
		    //String plainText = input.nextLine(); 
            String plainText="HAL";
            StringBuilder ciphertext = new StringBuilder(plainText);
/*Excercise
      1. change vaule of  i 
      2. change i++ to i--
      3. change the vaule of n
    
*/
        
        for ( int i=0; i<plainText.length(); i++) {
            char c =  ciphertext.charAt(i);
            int n=1;
            ciphertext.setCharAt(i, (char)(c + n)); // c +n where n is ceaser shift
            
          
           
            
        
    }
   
System.out.println(ciphertext);

    }
}
