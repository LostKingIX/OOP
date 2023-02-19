import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: January 20th, 2023
 * Application Name: calculator.java
 * Description: This application takes user input character by character and determines the type of arthematic calculation to perform based on a determined set of common math
 * symbols like (+) for addition and (/) for division. The program finally after validating user input, prints out the result in a readable format with decimal precision.
 * 
 */

 public class lightning_strike{

        //Constants
        static final String SET_TITLE = "\033]0;%s\007";

        //RAW String - multiline string
        static final String INPUT_BANNER = """ 
        =====================
        ~ Lightning Strike ~          
        =====================
        """;

    static double distance_ft (double seconds)
    {

        double distance_from_strike_ft = 1100 * (seconds / 60);
        
        //Return calculated data
        return distance_from_strike_ft;
    }

    static double distance (double seconds)
    {

        //Speed of sound - 335 M/s
        double distance_from_strike = 335.28 * (seconds / 60);
        
        //Return calculated data
        return distance_from_strike;
    }

    public static void main(String[] args) {

         // Initialize Scanner
         Scanner scanner = new Scanner(System.in);

        //Declaring Variables
        double seconds = 0.0;
        boolean restart = true;
        boolean valid = false;
        boolean numeric = false;

        //Setting Title for Window
        System.out.printf(SET_TITLE, "Lightning Strike - Kuldeep Mohanta");

        //Execute The program 
        do{

            // Print the banner
            System.out.println(INPUT_BANNER);

            //Prompt user for calculator
            System.out.print("Instructions:\nCount the seconds between when you see the Lighining strike and you hear the thunderclap!\n\n");

            do
            {
                
                System.out.print("Enter seconds: ");
                String user_input = scanner.next();

                try
                {
                    //Get number input
                    seconds = Integer.parseInt(scanner.nextLine());
                    
                    //Continue processing if data is true
                    numeric = true;

                    //Check if seconds is less than zero - i.e. number is negative or 0
                    if (seconds <= 0)
                    {
                        System.out.println("Error - Invalid Input!\n");

                    }

                }

                catch (Exception exception)

                {
                    //Validation was not succesful
                    valid = false;
                    System.out.println("Error - Invalid Input!\n");
                }

                if(valid)
                {
                    //Create variable to store calculated distance data
                    double distance = Math.round(distance_ft(seconds));
                    double distance_ft = Math.round(distance(seconds));

                    //Calculate the distance using function
                    System.out.printf("The lightning struck %.2f km / %.2f miles away from you", distance, distance_ft);
                }
            }
        }

            
        //Exit prompt
        System.out.print("\n\nEnter 'r' to restart! ");
        scanner.nextLine().equals("r");

        } while(restart);

          scanner.close();
  
    }
 }