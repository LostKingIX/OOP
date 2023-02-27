// Import Libraries
import java.util.Scanner;


/* Manages the game */
public class Game {

    //Initialize scanner
    static private Scanner scanner = new Scanner (System.in);


    /*
     * Ask the player if they want to play again 
     * @return true if they want to play again, otherwise false
     */

    static boolean playAgain()
    {
        //Ask the user if they want to play again
        System.out.print("Play again? Choose (y/n): ");
        scanner.nextLine().equals("y");

        
    }
}