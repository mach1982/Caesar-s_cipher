using System;
using System.Text;

namespace SampleNamespace
{
    public class SampleClass
    {
        public static void Main()
        {
            // Write hello world to the console
            //System.Console.WriteLine("Enter Plaintest");
            //String plaintext=Console.ReadLine();
            
            System.Console.WriteLine("Ceaser shift of 1");
            String plaintext="HAL";
          
            char[] ptext = plaintext.ToCharArray();
            String c =null; 
            
            //char[] c = plaintext.ToCharArray();
            for (int i=0; i<ptext.Length; i++) {
                
                int p = (int)(ptext[i]+1);
                
            c+=Convert.ToString((char)p);
            }
   
          System.Console.WriteLine(""+c );        
           
             
            
        } // End of Main function (program statup)
            
    } // End of SampleClass
} // End of SampleNamespace
