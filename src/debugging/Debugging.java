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
       
        Scanner input = new Scanner(System.in);
        
        
        boolean repeat = true;
        String userInput;
        int userInputInt;
        System.out.println("Enter a string that is greater than 6 characters long -->");
        
        while(repeat == true)
        {
            userInput = input.next();
            try
            {
                if(userInput.length()>6)
                {
                    repeat = false;
                    System.out.println("The string you entered is greater than 6 characters.");
                }
                else
                {
                    System.out.println("The string you entered is not greater than 6 characters.  Try again -->");
                    repeat = true;
                }
            }
            catch(Exception e)
                    {
                        System.out.println("This is a general error.  Try Again -->");
                        repeat = true;
                    }
        }
        
        repeat = true;
        System.out.println("Enter a string that contains the letter a -->");
        while(repeat == true)
        {
            try
            {
                String test;
                boolean exit = false;
                userInput = input.next();
                int runs = userInput.length();
                int character = 0;
                while(exit == false)
                {
                    test = Character.toString(userInput.charAt(character));
                    if(test.equals("a"))
                    {
                        System.out.println("The string you entered contains the letter a");
                        exit = true;
                        repeat = false;
                    }
                    else
                    {
                        if(character == runs-1)
                        {
                            System.out.println("The string you entered does not contain the letter a.  Try again -->");
                            exit = true;
                            repeat = true;
                        }
                        else
                        {
                        character = character+1;
                        exit = false;
                        }
                    }
                }
            }
            catch(Exception e)
                    {
                        System.out.println("This is a general error.  Try again -->");
                        repeat = true;
                    }
        }
        
        repeat = true;
        System.out.println("Enter an integer between 5 and 500 characters -->");
        do
        {
            try
            {
                userInputInt = input.nextInt();
                if(5<=userInputInt && userInputInt<=500)
                {
                    repeat = false;
                    System.out.println("The integer you entered is between 5 and 500.");
                }
                else
                {
                    System.out.println("The integer you entered is not between 5 and 500.  Try again -->");
                    repeat = true;
                }
            }
            catch(java.util.InputMismatchException e)
                    {
                        System.out.println("This is a general error.  Try again -->");
                    }   
        }
        
        while(repeat == true);
        repeat = true;
        System.out.println("Enter a string that is between 5 and 15 characters long and does not contain the letter z -->");
        while(repeat == true)
        {
            userInput = input.next();
            
            try
            {
                if(5<=userInput.length() && 15>=userInput.length())
                {
                
                try
                {
                String test;
                boolean exit = false;
                int runs = userInput.length();
                int character = 0;
                while(exit == false)
                {
                    test = Character.toString(userInput.charAt(character));
                    if(test.equals("z"))
                    {
                        System.out.println("The string you entered contains the letter z.  Try again -->");
                        exit = true;
                        repeat = true;
                    }
                    else
                    {
                        if(character == runs-1)
                        {
                            exit = true;
                            repeat = false;
                            System.out.println("The string entered is between 5 and 15 characters long and does not contain the letter z -->");
                        }
                        else
                        {
                        character = character+1;
                        exit = false;
                        System.out.println("Enter a string that is between 5 and 15 characters long and does not contain the letter z -->");
                        }
                    }
                }
                }
                catch(Exception e)
                {
                    System.out.println("This is a general error.  Try again -->");
                    repeat = true;
                }
                }
                else
                {
                    System.out.println("The string you enterd is not within 5 to 15 characters.  Try again -->");
                }
            }
            catch(Exception e)
                    {
                        System.out.println("This is a general error.  Try again -->");
                        repeat = true;
                    }
            
        }
        repeat = true;
        System.out.println("Enter a negative integer -->");
        while(repeat==true)
        {
            userInputInt = input.nextInt();
            try
            {
                if(userInputInt<0)
                {
                    System.out.println("The integer you entered is negative.");
                    repeat = false;
                }
                else
                {
                    System.out.println("The integer you entered is not negative.  Try again -->");
                    repeat = true;
                }
            }
            catch(Exception e)
            {
                System.out.println("This is a general error.  Try again -->");
                repeat = true;
            }
        }
        
        repeat = true;
        System.out.println("Enter a positive, odd integer -->");
        while(repeat == true)
        {
            userInputInt = input.nextInt();
            try
            {
                if(userInputInt>0)
                {
                    if(userInputInt%2 == 0)
                    {
                        System.out.println("The integer you entered is not odd.  Try again -->");
                        repeat = true;
                    }
                    else
                    {
                        System.out.println("The integer you entered is positive and odd.");
                        repeat = false;
                    }
                }
                else
                {
                    System.out.println("The integer you entered is not positive.  Try again -->");
                    repeat = true;
                }
            }
            catch(Exception e)
            {
                System.out.println("This is a general error.  Try again -->");
                repeat = true;
            }
        }
    }
    
}
