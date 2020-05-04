/*
 *Emma Elliott
May 3, 2020
Debugging a Program and Catching Errors
 */
package debugging;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class Debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput= new Scanner(System.in);
        
        String sixcharacters;
        int value=0;
        boolean valid=false;
        
        while (valid==false)
        {
            System.out.println("Enter a String that is over 6 charcters long");
            sixcharacters= keyedInput.nextLine();
            System.out.println("");
        
            try
            {
                value= sixcharacters.length();
//                System.out.println(value);
            
            if (value>6)
                {
                valid=true;
                }  
            }
        
            catch(ArithmeticException e)
            {
                System.out.println("Sorry your string is not six charcters long");
                System.out.println("");
            }
        }  
        
        System.out.println("This is valid");
        // TODO code application logic here
    }
    
}
