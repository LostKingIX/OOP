// Import libraries
import java.util.Scanner;

/*
 * Author: Kuldeep Mohanta
 * Date: Feb 16th, 2023
 * App Name: RockPaperScissors
 * Description: Thus 
 * 
 */

public class RockPaperScissors {

    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String BANNER = """ 
    =======================
    = Rock Paper Scissors =    
    =======================
    """;




    public static void main() {


        //Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Define Variables
        boolean restart;

        //Set title for program
        System.out.printf(SET_TITLE, "Rock Paper Scissors - Kuldeep Mohanta");

        //Game loop - repeat as player wants to repeat the game

        do
        {
            //Ask the user if they want to play again
            restart = Game.playAgain();
        } while (restart);

    //Exit prompts
    System.out.println("Press [Enter] to exit!");
    scanner.nextLine();
    scanner.close();
        
    }

    
}