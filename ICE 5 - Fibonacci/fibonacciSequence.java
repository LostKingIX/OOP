import java.util.Scanner;

/*
 * Author: Kuldeep Mohanta
 * Date: Feb 16th, 2023
 * App Name: Fibonacci Sequence
 * Description: This application is designed to prompt the user to input a number that will be used to determine
 * a index range to calculate the fibonacci sequence until. This sequence is used within this application through the 
 * implentation of recursion - within the askforMax() function. Recursion here functions by calling a method
 * within itself, which in this case if the user does not enter a number that passes validation then the method
 * will call itself recursively until the input is valid.
 * 
 */

 public class fibonacciSequence {

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
            numeric = true; // Able to convert

        } catch (Exception e)

        {
            numeric = false; // unable to convert
        }

        // Error in case max is not a num, or in case max is negative or max <= 40
        if (!numeric || max < 0 || max > 40)
        {
            System.out.println("Error - Max must be a positive number up to 40!");
            askforMax();
        }

        // In case max is valid
        return max;

    }

    /*
     * Get the Fibonacci Number at a specific index
     * @param index Index of the number
     * @return Fibonacci number at that index
     * 
     */

    static int fibonacci(int index)
    {
        //Base Case
        if(index < 2) return index;

        //Calculate Fibonacci 
        // fn = fn - 1 + fn - 2
        return fibonacci(index-1) + fibonacci(index -2);
    }

    // MAIN METHOD BEGINS *************************************************************
    public static void main(String[] args) {

         // Old Terminal Instructions
         try{
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
        } catch (Exception exception) {}

        //Set Title
        System.out.printf(SET_TITLE, "Fibonacci - Kuldeep Mohanta");

        //User Input
        Scanner scanner = new Scanner(System.in);

        // Variables
        int max = 0; // Hold the valid max value for the recursion fx - askformax()
        boolean restart = true;

        // App Loop - repeat until the user 
        do
        {
            //Print banner
           System.out.println(CLEAR_TERMINAL + BANNER);

           //Ask for max
            max = askforMax(); 

            // output screen ~~~~~~~~~~~~~~
            System.out.println(CLEAR_TERMINAL + BANNER);

            //Print all indicies from 0 up to a max
            System.out.printf("Fibonacci Sequence from index 0 up to %s: ", max);
            for(int count = 0; count <= max; count ++)
                System.out.print( (fibonacci(count) + " " ));


            System.out.print("\nEnter 'r' to restart: ");
             // Repeat until the user chooses to quit
            restart = scanner.nextLine().equals("r");


        }while(restart);

        //Exit prompts
        System.out.println("Press [Enter] to exit!");
        scanner.nextLine();
        scanner.close();
    }
 }