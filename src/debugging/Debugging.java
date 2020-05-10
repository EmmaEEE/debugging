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
        
        
        boolean notvalid = true;
        String userInput;
        int userInputInt;
        System.out.println("Enter a string that is longer than 6 characters");
        
        while(notvalid == true)
        {
            userInput = input.next();
            try
            {
                if(userInput.length()>6)
                {
                    notvalid = false;
                    System.out.println("The string you entered is greater than 6 characters.");
                }
                else
                {
                    System.out.println("The string you entered is not greater than 6 characters.  Try again");
                    notvalid = true;
                }
            }
            catch(Exception e)
                    {
                        System.out.println("Error. Try Again");
                        notvalid = true;
                    }
        }
        
        notvalid = true;
        System.out.println("Enter a string that contains the letter a");
        while(notvalid == true)
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
                        notvalid = false;
                    }
                    else
                    {
                        if(character == runs-1)
                        {
                            System.out.println("The string you entered does not contain the letter a.  Try again");
                            exit = true;
                            notvalid = true;
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
                        System.out.println("Error. Try again");
                        notvalid = true;
                    }
        }
        
        notvalid = true;
        System.out.println("Enter an integer between 5 and 500");
        do
        {
            try
            {
                userInputInt = input.nextInt();
                if(5<=userInputInt && userInputInt<=500)
                {
                    notvalid = false;
                    System.out.println("The integer you entered is between 5 and 500");
                }
                else
                {
                    System.out.println("The integer you entered is not between 5 and 500.  Try again");
                    notvalid = true;
                }
            }
            catch(java.util.InputMismatchException e)
                    {
                        System.out.println("Error. Try again");
                    }   
        }
        
        while(notvalid == true);
        notvalid = true;
        System.out.println("Enter a string that is between 5 and 15 characters long and does not contain the letter z");
        while(notvalid == true)
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
                        System.out.println("The string you entered contains the letter z.  Try again");
                        exit = true;
                        notvalid = true;
                    }
                    else
                    {
                        if(character == runs-1)
                        {
                            exit = true;
                            notvalid = false;
                        }
                        
                        else 
                        {
                        character = character+1;
                        exit = false;
                        System.out.println("Enter a string that is between 5 and 15 characters long and does not contain the letter z");
                        }
                    }
                }
                }
                catch(Exception e)
                {
                    System.out.println("Error. Try again");
                    notvalid = true;
                }
                }
                else
                {
                    System.out.println("The string you enterd is not within 5 to 15 characters.  Try again");
                }
            }
            catch(Exception e)
                    {
                        System.out.println("Error. Try again");
                        notvalid = true;
                    }
            
        }
        notvalid = true;
        System.out.println("Enter a negative integer");
        while(notvalid==true)
        {
            userInputInt = input.nextInt();
            try
            {
                if(userInputInt<0)
                {
                    System.out.println("The integer you entered is negative.");
                    notvalid = false;
                }
                else
                {
                    System.out.println("The integer you entered is not negative.  Try again");
                    notvalid = true;
                }
            }
            catch(Exception e)
            {
                System.out.println("Error. Try again");
                notvalid = true;
            }
        }
        
        notvalid = true;
        System.out.println("Enter a positive, odd integer");
        while(notvalid == true)
        {
            userInputInt = input.nextInt();
            try
            {
                if(userInputInt>0)
                {
                    if(userInputInt%2 == 0)
                    {
                        System.out.println("The integer is not odd.  Try again");
                        notvalid = true;
                    }
                    else
                    {
                        System.out.println("The integer is positive and odd.");
                        notvalid = false;
                    }
                }
                else
                {
                    System.out.println("The integer is not positive.  Try again");
                    notvalid = true;
                }
            }
            catch(Exception e)
            {
                System.out.println("Error. Try again");
                notvalid = true;
            }
        }
    }
    
}
