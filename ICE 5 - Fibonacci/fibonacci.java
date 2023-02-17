import java.util.Scanner;

/*
 * Author: Kuldeep Mohanta
 * Date: Feb 16th, 2023
 * App Name: Fibonacci Sequence
 * Description: 
 */

 public class fibonacci {

    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String BANNER = """ 
    =======================
    = Fibonacci Sequence =    
    =======================
    """;

    /*
     * Recreate the input("Hello") from python
     * @Param prompt the string to be printed
     * @return a whole line as a string
     */
    static String input (String prompt)
    {
        //Print without a new line
        System.out.print(prompt);

        //Read a line of input
        return scanner.nextLine() ;
    }

    /*
     * Recreate the print() from Python
     * Print a string ending with a new line
     * @param prompt the string that will be printed
     * 
     */
    static void print(String prompt)
    {
        System.out.println(prompt);
    }

    static void printBanner (String title)
    {
        //**Variables that are used here only exist within the method */
        String line = "=====";
        String banner = "";

        // Add one "=" for each letter in the title
        // Before the loop; condition to loop; after each iteration
        for (int count = 0; count < title.length(); count ++)

        {
            line += "=";
        }

        // Format the banner and assign to a variable
        banner = line + "\n" + title + "\n" + line;

        // Print the banner
        System.out.println(banner);
    }

     //User Input - initialize scanner
     static Scanner scanner = new Scanner(System.in);

    //User Greeting method
    static void greet()
    {
        System.out.println("Hello!");
    }

    /*
     * Ask for a max and validate recursively
     * @return number
     */

    static final int askforMax()
    {
        //Variables - Only exist within the method
        int max = 0;
        boolean numeric= false;

        // Prompt for a max
        System.out.print("Fibonacci sequence max index: ");

        // Can it be converted to a number
        try
        {
            max = Integer.parseInt(scanner.nextLine());

        } catch (Exception e)

        {
            
        }

        // Error in case max is not a num, or in case max is negative or max <= 40


        // In case max is valid
        return max;

    }

    // MAIN METHOD BEGINS *************************************************************
    public static void main(String[] args) {
        
        //Set Title
        System.out.printf(SET_TITLE, "Fibonacci - Kuldeep Mohanta");

        //Print banner
        printBanner("Fibonacci Sequence");

        //User Input
        Scanner scanner = new Scanner(System.in);

        // Variables
        boolean restart = true;

        // App Loop - repeat until the user 
        do
        {
            //Print banner
           System.out.println(CLEAR_TERMINAL + BANNER);

            System.out.print("Enter 'r' to restart");
             // Repeat until the user chooses to quit
            restart = scanner.nextLine().equals("r");


        }while(restart);

        // Always close the scanner before the closing the app
        scanner.close();

       

        //Exit prompts
        System.out.println("Press [Enter] to exit!");
        scanner.nextLine();
        scanner.close();
    }
 }