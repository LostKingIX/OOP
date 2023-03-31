import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: March 29, 2023
 * App Name: HorseRace.java
 * Description: This console application simulates a Horse Race with the main HorseRace class and the 
 * Horse class. The application creates 5 instances of a new Horse Object within an array and references them with an index value.
 * As the horse's cover distance based on a randomized speed (calculated from the Horse class), the distance is noted.
 * Once one (or more) Horses cover enough distance to finish the race, their names are recorded into a string
 * which finally displays to the user as the winners.
 * 
 */

public class HorseRace {

    // define a private static final int variable called "HALF_SECOND" and initialize it with a value of 500 (milliseconds)
    // HINT from document
    private static final int HALF_SECOND = 500; 
    
    // public static method called "waitHalfSecond" - obj: stop code execution for half a second
    public static void waitHalfSecond() { 
        //Try-catch to help with the sleep method from Thread class
        try {
            // pause the execution of the code for HALF_SECOND (500) milliseconds
            Thread.sleep(HALF_SECOND); 
        } catch (Exception exception) {

        }
    }
    
    
    /*
     * public static method called "drawDistanceLine" that takes a Horse object as a parameter
     * @horse param takes Horse object
     * @distanceLine declare distanceLine and pass it into the drawDistanceLine method
     * return the updated distanceLine value
     */
    public static String drawDistanceLine(Horse horse, String distanceLine) 
    {  
        boolean hasWon = false;

        // get the distance covered presently by the horse, but int is required to determine how many '.' to print
        // convert double to int with (int) cast for nearest whole number -> use that value to print '.' using sys print
        for (int i = 0; i < (int) horse.getDistanceCovered(); i++) 
        {     
            //print '.' to represent the distance covered by the horse
            distanceLine += ".";
        }

        // If a horses distance reaches 20 then change text colour and set hasWon to true
        if ((int) horse.getDistanceCovered() >= 20) 
            {
                System.out.println("\033[0;34m" + distanceLine + horse.getName() + " Wins!" + "\033[0m");
                hasWon = true;

            }
        else 
            {
                System.out.println(distanceLine + " " + horse.getName());    
            }

        return distanceLine;
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

    //Main Method
    public static void main(String[] args) {

        // Old Terminal Instructions
        try{
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
        } catch (Exception exception) {}

        //Set Title
        System.out.printf(SET_TITLE, "Horse Race - Kuldeep Mohanta");

        //Print banner
        System.out.println(CLEAR_TERMINAL + BANNER);

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Create an array that holds Horse objects within an index
        Horse[] horses = new Horse[5];
        
        // Initialize an array of Horse objects, with each index holding a new Horse object that is created with a predefined name (Bonus Mark)
        horses[0] = new Horse("Batman");
        horses[1] = new Horse("Iron Man");
        horses[2] = new Horse("RC");
        horses[3] = new Horse("Captain GMerica");
        horses[4] = new Horse("Mustang");
        
        // Create empty winners string to store one (or more) winner
        String winners = "";
        int numwinners = 0;

        String distanceline = "";
        boolean winnerFound = false;

        
        // While loop executes while there is no winner, and with each cycle, a for loop is used:
        while (true) 
        {
            //Print Racing Greeting Message
            System.out.println(CLEAR_TERMINAL+BANNER);


            // Printing Race perimeter
            System.out.println("====================");


            // Check the length of horses array and iterate through the length of the array starting from index [0]
            for (int i = 0; i < horses.length; i++) 
                {
                    // Setting index value to the first horse in the array [i]
                    Horse horse = horses[i];

                    //run() is called for the current (indexed) horse
                    horses[i].run();

                    // drawDistanceLine() is called with the current (indexed) Horse as its parameter
                    drawDistanceLine(horses[i], distanceline);
                    
                    //checks whether the ith horse in the array has covered a distance of at least 20 units using the getDistanceCovered() method
                    if (horses[i].getDistanceCovered() >= 20) 
                        {
                            //If Horse has covered 20, then check if winner's string is empty ("")
                            if (winners.equals("")) 
                            {
                                //If winner's string is empty, append first winning horse name to the string
                                winners += horses[i].getName();
                            } 
                            //If the winning string is not empty, then follow appropriate formatting to append another horse 
                            else 
                                {
                                    // append other winning horse(s) name to the string with corrected formatting
                                    winners += ", " + horses[i].getName();
                                }

                            // Add number of winners to winning count to end the race (break)
                            numwinners += 1;
                        }
                }
            
            // Printing Race perimeter
            System.out.println("====================");
            
            //Delay for Lab Requirement *FPS movement*
            waitHalfSecond();

            // If there is a winner (or more than one winner) then break (end) the race
            if (numwinners >= 1) 
                {
                    break;
                }
        }

        // print the winner(s) from winners using a toString and
        System.out.println("\n\nWinner(s): " + winners);
                    
        //Exit prompts
        System.out.println("\nPress [Enter] to exit!");
        scanner.nextLine();
        scanner.close();
        return;
                }
            }
    
                                
                     
                    
                            

        

