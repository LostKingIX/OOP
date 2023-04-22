//Importing libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: April 21, 2023
 * Application Name: LetterGrade.java
 * Description: This program is designed to take user input as a percentage value and display to the user
 * an appropriate letter grade with respective feedback. It utilizes two methods letterGrade(double percentage) and 
 * gradeFeedback(String letterGrade) to round the user input, return a letter grade, as well as pair the 
 * letter grade with an appropriate string output
 * 
 * ~~~ Bonus Completed - Static Methods implement in a seperate Grade.java Class file
*/


public class LetterGrade {

    // Constants
    static final String SET_TITLE = "\033]0;%s\007";

    // RAW String - multiline string
    static final String BANNER = """
            ==============================
            ~ Letter Grade Converter ~
            ==============================
            """;

    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    final static int maxPercentage = 100;
    final static int minPercentage = 0;


    /*
    * Takes a parameter of the user's inputted percentage to round to a whole number
    * and depending on the range that the number is within will return a letter grade
    * @return "X" letter grade according to rounded percentage value
    */

    public static void main(String[] args) 
        {
            //Creating object of Grade
            Grade grade = new Grade();

            //Declaring Variables
            String percentageGrade = "";
            double validGradeInput = 0;
            boolean validNumeric = false; //validate if input is numeric
            boolean restart = true; //restart the app

            
            // Prompt the user to enter a grade as a percentage
            Scanner scanner = new Scanner(System.in);

            // Setting Title for Window
            System.out.printf(SET_TITLE, "Letter Grade Converter - Kuldeep Mohanta");

            // Print the banner
            System.out.println(CLEAR_TERMINAL);
            System.out.println(BANNER);

        do
            {
                // Greet the user
                System.out.println("Please enter a grade as a percentage (0-100): ");
                    
                //Validate if input is numeric
                percentageGrade = scanner.nextLine();

                try
                    {
                        validGradeInput = Double.parseDouble(percentageGrade);
                        validNumeric = true;
                    }

                catch (Exception e)
                    {
                        System.out.println("Error - Grade percentage must be numeric!");
                        validNumeric = false;
                        scanner.nextLine();
                        scanner.close();
                        return;
                    }
                // Validate input for acceptable range
                if (validGradeInput < minPercentage || validGradeInput > maxPercentage) 
                    {
                        System.out.println("Error: The grade must be between 0 and 100.");
                        validNumeric = false;
                    } 

                else 
                    {
                        validNumeric = true;

                    }
                
                if (validNumeric == true)
                    {
                        // Calculate the equivalent letter grade and feedback
                        String letterGrade = Grade.letterGrade(validGradeInput);
                        String feedback = Grade.gradeFeedback(letterGrade);

                        // Display the result
                        System.out.println("A grade of " + validGradeInput + " is equivalent to " + letterGrade
                                + " which is considered " + feedback + "!");

                        //Prompt user to restart
                        System.out.print("\n\nEnter 'r' to restart: ");
                        restart = scanner.nextLine().equals("r");
                    }
                                
            } while(restart);
                
            // Closing Scanner and Exit Sequence
            System.out.print("\nPress [Enter] to exit: ");
            scanner.nextLine();
            scanner.close();
        }
}
