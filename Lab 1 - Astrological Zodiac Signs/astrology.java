//Importing libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: Feb 2th, 2023
 * Application Name: astrology.java
 * Description: This application takes user input character by character and determines the type of arthematic calculation to perform based on a determined set of common math
 * symbols like (+) for addition and (/) for division. The program finally after validating user input, prints out the result in a readable format with decimal precision.
 * 
 */

public class astrology {
    
    //Constants
    static final String SET_TITLE = "\033]0;%s\007";

    //RAW String - multiline string
    static final String BANNER = """ 
    ==============================
    ~ Astrological Zodiac Signs ~          
    ==============================
    """;


    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";


    public static void main(String[] args) 
    {
        //Declaring variables
        int birth_month = 0;
        int birth_day = 0;
        
        //empty string to store user input for their birthday
        String user_birthday = "";
    
        //Creating an input validation checker (true, allows program to proceed) (false, does not proceed until correct input is received)
        boolean validInput = false;

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Setting Title for Window
        System.out.printf(SET_TITLE, "Astrological Zodiac Signs - Kuldeep Mohanta");

        // Print the banner
        System.out.println(BANNER);

        System.out.println("\nHello, This program's purpose is to take your birthday (MM-DD) and tell you your Zodiac sign based on your birthday!");

        // Loop until the user enters a valid input
        while (!validInput)

            {
                //Prompt user for their birthday MM DD
                System.out.print("Enter your birthday (MM DD): ");

                //Scan user input and store within empty string
                user_birthday = scanner.nextLine();

                //Splitting user input with string split function
                String[] month_day_format = user_birthday.split(" ");
                
                //If the split string is not equal to two index values (1 - MM and 2 - DD) **Format required to validate
                if (month_day_format.length != 2) 
                    {
                        System.out.println("Please enter your birthday in the format MM DD! ");
                    }
                    
                //Validate if birthday values are valid integers
                try
                    {
                        //Check the values of MM DD in the split up MM DD array using int parse
                        birth_month = Integer.parseInt(month_day_format[0]);
                        birth_day = Integer.parseInt(month_day_format[1]);
                        
                            
                        //If the ranges for the birth month are outside of these ranges then validation is fail
                        if (birth_month < 1 || birth_month > 12) 
                            {
                                System.out.println("\nError - Birth Month is not within the range of 01 - 12! ");

                            }
                        
                        //If the ranges for the birth day are outside of these ranges then validation is fail
                        else if (birth_day < 1 || birth_day > 31)
                            {
                                System.out.println("\nError - Birth day is not within the range of 01 - 31! ");
                                validInput = false;
                            }
                        //Validation is true
                        else
                            {
                                validInput = true;
                            }
                        
                    }
            
                //User did not enter numeric values
                catch (Exception e)
                    {
                        System.out.println("\nError, input is not valid! Please enter a valid birthday in the format MM DD: ");
                    }
                
                //If input is valid, allow program to proceed and process the rest of the app -> printing the zodiac sign 
                if (validInput)
                {
                    // Initialize an empty string to hold the zodiac sign
                    String zodiacSign = "";

                // Creating ranges to determine Zodiac sign based on Integer values
                    if (birth_day >= 63 && birth_day <= 76)
                        {
                            zodiacSign = "Aries";
                        } 

                    else if (birth_day >= 80 && birth_day <= 100) 
                        {
                            zodiacSign = "Taurus";

                        } 

                    else if (birth_day >= 105 && birth_day <= 120) 
                        {
                            zodiacSign = "Gemini";
                        } 

                    else if (birth_day >= 126 && birth_day <= 154) 
                        {
                            zodiacSign = "Cancer";
                        }

                    else if (birth_day >= 161 && birth_day <= 176)
                        {
                            zodiacSign = "Leo";
                        }
                        
                    else if (birth_day >= 184 && birth_day <= 198)
                        {
                            zodiacSign = "Virgo";
                        }

                    else if (birth_day >= 207 && birth_day <= 220)
                        {
                            zodiacSign = "Libra";
                        }

                        else if (birth_day >= 230 && birth_day <= 231)
                        {
                            zodiacSign = "Scorpio";
                        }
                        
                        else if (birth_day >= 242 && birth_day <= 252)
                        {
                            zodiacSign = "Sagittarius";
                        }

                        else if (birth_day >= 264 && birth_day <= 19)
                        {
                            zodiacSign = "Capricorn";
                        }

                        else if (birth_day >= 20 && birth_day <= 36)
                    
                        {
                            zodiacSign = "Aquarius";
                        } 
    
                        else if (birth_day >= 38 && birth_day <= 60)
                        {
                            zodiacSign = "Pisces";
                        }
                    
                    //Clear Terminal for fresh input
                    System.out.print(CLEAR_TERMINAL + BANNER);

                    //Zodiac Output for user
                    System.out.println("Your Zodiac sign based on your birthday (" + user_birthday + ") is: " + zodiacSign);
                }
            }
               
        //Closing Scanner and Exit Sequence
        System.out.print("\nPress [Enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }
}