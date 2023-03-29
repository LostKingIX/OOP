//Import Libraries
import java.util.Scanner;
import java.util.Random;


/*
 * Name
 * Date
 * App Name
 * Description
 * 
 */

public class HorseRace {

    //Private Variables
    // which will hold the horse's name, this variable is initialized as an empty variable
    private String name;

    // "distanceCovered" which will hold the total 
    // distance currently covered by the horse, the default value is "0"
    private int distanceCovered;

    //  "random" will initialize a new object of Java's built-in class 'Random'
    private Random random;

    //Public Horse Class
    public void Horse(String name) 
    {
        this.name = name;
        this.distanceCovered = 0;
        this.random = new Random();
    }

    public String getName() {
        return this.name;
    }

    // Getter Methods
    // getName() which will be called to access the horse's name

    
    // getDistanceCovered() which will be called to access the distanced covered by the horse
    public int getDistanceCovered() {
        return this.distanceCovered;
    }

    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String BANNER = """ 
    =======================
    = Horse Race =    
    =======================
    """;

    public static void main(String[] args) {

        //Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Set title for program
        System.out.printf(SET_TITLE, "Rock Paper Scissors - Kuldeep Mohanta");




        //Exit prompts
        System.out.println("Press [Enter] to exit!");
        scanner.nextLine();
        scanner.close();
        
        
    }
}

/*Write a java application that has two static methods named:
 "waitHalfSecond()" - The purpose of this method will be to stop code execution for half a second. It will use a constant named "HALF_SECOND" with a value of "500" and call a method called "sleep" from the class 'Thread'. This can be placed inside a try-catch statement like ('Thread.sleep(HALF_SECOND)')

"drawDistanceLine()" - The purpose of this method will be to receive a Horse as a parameter and draws a line of "." characters to represent distance covered by the horse. The "." line can be drawn with a for-loop.

There will be a "Horse" class as well which should include:
Private Variables
1. "name" which will hold the horse's name, this variable is initialized as an empty variable.
2. "distanceCovered" which will hold the total distance currently covered by the horse, the default value is "0".
3. "random" will initialize a new object of Java's built-in class 'Random'

A Constructor Method should also be created which will do the following:
- Initialize a new Horse object by receiving its name as a parameter
- Store the new horse's name in the 'private' variable "name" as defined previously

There will also be two Getter (accessor) methods that will do the following:
1. getName() which will be called to access the horse's name
2. getDistanceCovered() which will be called to access the distanced covered by the horse

Lastly, there should be a 'public' Method which will do the following:
- Pick a random speed for the Horse to run
- Add a random number from '0 to 1' (inclusive) to the variable stored within the 'private' variable "distanceCovered" */