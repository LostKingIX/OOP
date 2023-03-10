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
    static final String INPUT_BANNER = """ 
    ==============================
    ~ Astrological Zodiac Signs ~          
    ==============================
    """;

    static final String OUTPUT_BANNER = """
    ==============================
    ~ Astrological Zodiac Signs ~          
    ==============================         
    """;

    public static void main(String[] args) {
        
        //Declaring variables
        int birth_month = 0;
        int birth_day = 0;
        String user_name = "";

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Setting Title for Window
        System.out.printf(SET_TITLE, "Astrological Zodiac Signs - Kuldeep Mohanta");

        // Print the banner
        System.out.println(INPUT_BANNER);

        System.out.println("\n\nHello, This program is made tell you your Zodiac sign based on your birthday!");

        System.out.println("Enter your birthday (month): ");

        try{
            //Process user input for the birth month as a numeric value
            birth_month = scanner.nextInt();
                
            //Validate User input if it is within annual month range
            if (0<= birth_month <=12)

        }
        // Declaring variables
        

    }
}