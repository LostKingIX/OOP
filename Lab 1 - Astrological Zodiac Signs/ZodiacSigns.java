
//Importing libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: Feb 2th, 2023
 * Date Modified: April 21, 2023
 * Application Name: astrology.java
 * Description: This application takes user input character by character and determines the type of arthematic calculation to perform based on a determined set of common math
 * symbols like (+) for addition and (/) for division. The program finally after validating user input, prints out the result in a readable format with decimal precision.
 * 
 */

public class ZodiacSigns {

    // Constants
    static final String SET_TITLE = "\033]0;%s\007";

    // RAW String - multiline string
    static final String BANNER = """
            ==============================
            ~ Astrological Zodiac Signs ~
            ==============================
            """;

    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //Constants for Birth Day and Month Range
    final static int minBirthMonth = 1;
    final static int maxBirthMonth = 12;

    final static int minBirthDate = 1;
    final static int maxBirthDate = 31;

    public static void main(String[] args) {
        // Declaring variables
        int userBirthMonth = 0;
        int userBirthDate = 0;

        // empty string to store user input for their birthday
        String userBirthday = "";

        // Creating an input validation checker (true, allows program to proceed)
        // (false, does not proceed until correct input is received)
        boolean validInput = false;

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Setting Title for Window
        System.out.printf(SET_TITLE, "Astrological Zodiac Signs - Kuldeep Mohanta");

        // Print the banner
        System.out.println(CLEAR_TERMINAL);
        System.out.println(BANNER);

        System.out.println(
                "\nHello, This program's purpose is to take your birthday (MM-DD) and tell you your Zodiac sign based on your birthday!");

        // Loop until the user enters a valid input
        while (!validInput) 
        {
            // Prompt user for their birthday MM DD
            System.out.print("Enter your birthday (MM DD): ");

            // Scan user input and store within empty string
            userBirthday = scanner.nextLine();

            // Splitting user input with string split function
            String[] formattedInput = userBirthday.split(" ");

            // If the split string is not equal to two index values (1 - MM and 2 - DD)
            // **Format required to validate
            if (formattedInput.length != 2) 
                {
                    System.out.println("Please enter your birthday in the format MM DD! ");
                }

            // Validate if birthday values are valid integers
            try 
                {
                    // Check the values of MM DD in the split up MM DD array using int parse
                    userBirthMonth = Integer.parseInt(formattedInput[0]);
                    userBirthDate = Integer.parseInt(formattedInput[1]);

                    // If the ranges for the birth month are outside of these ranges then validation
                    // is fail
                    if (userBirthMonth < minBirthMonth || userBirthMonth > maxBirthMonth) {
                        System.out.println("\nError - Birth Month is not within the range of 01 - 12! ");
                        System.out.println("\nPlease try again, press enter to refresh the app");
                        scanner.nextLine();

                        System.out.println(CLEAR_TERMINAL + BANNER);

                    }

                    // If the ranges for the birth day are outside of these ranges then validation
                    // is fail
                    else if (userBirthDate < minBirthDate || userBirthDate > maxBirthDate) {
                        System.out.println("\nError - Birth day is not within the range of 01 - 31! ");
                        System.out.println("\nPlease try again, press enter to refresh the app");

                        scanner.nextLine();

                        System.out.println(CLEAR_TERMINAL + BANNER);

                        validInput = false;
                    }
                    // Validation is true
                    else {
                        validInput = true;
                    }

                }

            // User did not enter numeric values
            catch (Exception e) 
                {
                    System.out.println("\nError, input is not valid/numeric! Please enter a valid birthday in the format MM DD: ");
                    System.out.println("\nPlease try again, press enter to refresh the app");

                    scanner.nextLine();
                    System.out.println(CLEAR_TERMINAL + BANNER);

                }

            // If input is valid, allow program to proceed and process the rest of the app
            // -> printing the zodiac sign
            if (validInput) 
                {
                    // Initialize an empty string to hold the zodiac sign
                    String zodiacSign = "";

                    // Calculate BirthDate value to see which zodiac range it falls under
                    int month = Integer.parseInt(formattedInput[0]);
                    int day = Integer.parseInt(formattedInput[1]);
                    int zodiacRange = (month * 100) + day;

                    // Pad the month and day values with leading zeros if they are single-digit (i.e. 01)
                    String monthStr = String.format("%02d", month);
                    String dayStr = String.format("%02d", day);

                    // Combine the month and day values into a string and parse it as an integer
                    zodiacRange = Integer.parseInt(monthStr + dayStr);

                    // Creating ranges to determine Zodiac sign based on Integer values
                    if ((zodiacRange >= 321 && zodiacRange <= 419) || (zodiacRange >= 320 && zodiacRange <= 420)) 
                        {
                            zodiacSign = "Aries";
                        } 
                    
                    else if ((zodiacRange >= 420 && zodiacRange <= 520) || (zodiacRange >= 419 && zodiacRange <= 521)) 
                        {
                            zodiacSign = "Taurus";
                        } 

                    else if ((zodiacRange >= 521 && zodiacRange <= 621) || (zodiacRange >= 520 && zodiacRange <= 622)) 
                        {
                            zodiacSign = "Gemini";
                        } 

                    else if ((zodiacRange >= 622 && zodiacRange <= 722) || (zodiacRange >= 621 && zodiacRange <= 723)) 
                        {
                            zodiacSign = "Cancer";
                        } 

                    else if ((zodiacRange >= 723 && zodiacRange <= 822) || (zodiacRange >= 722 && zodiacRange <= 823)) 
                        {
                            zodiacSign = "Leo";
                        } 

                    else if ((zodiacRange >= 823 && zodiacRange <= 922) || (zodiacRange >= 822 && zodiacRange <= 923)) 
                        {
                            zodiacSign = "Virgo";
                        } 

                    else if ((zodiacRange >= 923 && zodiacRange <= 1022) || (zodiacRange >= 922 && zodiacRange <= 1023)) 
                        {
                            zodiacSign = "Libra";
                        } 

                    else if ((zodiacRange >= 1023 && zodiacRange <= 1121)|| (zodiacRange >= 1022 && zodiacRange <= 1122)) 
                        {
                            zodiacSign = "Scorpio";
                        } 

                    else if ((zodiacRange >= 1122 && zodiacRange <= 1221) || (zodiacRange >= 1121 && zodiacRange <= 1222)) 
                        {
                            zodiacSign = "Sagittarius";
                        } 

                    else if ((zodiacRange >= 1222 && zodiacRange <= 1231) || (zodiacRange >= 101 && zodiacRange <= 119)) 
                        {
                            zodiacSign = "Capricorn";
                        } 

                    else if ((zodiacRange >= 120 && zodiacRange <= 218) || (zodiacRange >= 119 && zodiacRange <= 219)) 
                        {
                            zodiacSign = "Aquarius";
                        } 

                    else if ((zodiacRange >= 219 && zodiacRange <= 320) || (zodiacRange >= 218 && zodiacRange <= 321)) 
                        {
                                zodiacSign = "Pisces";
                        }

                    // Clear Terminal for fresh input
                    System.out.print(CLEAR_TERMINAL + BANNER);

                    // Zodiac Output for user
                    System.out.println("Your Zodiac sign based on your birthday (" + userBirthday + ") is: " + zodiacSign);
                }
        }

        // Closing Scanner and Exit Sequence
        System.out.print("\nPress [Enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }
}