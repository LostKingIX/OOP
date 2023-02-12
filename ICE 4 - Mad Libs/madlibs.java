//Import Libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: Feb 09, 2023
 * App Name: Mad Libs
 * Program Description: This program is designed to take in user input with prompts like "nouns, adjectives, etc." and 
 * use the prompts in a fun way to create a story! 
 */ 
public class madlibs {

    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String INPUT_BANNER = """ 
    ===============
    = Mad Libs =    
    ===============
    """;

     //User Input - initialize scanner
    static Scanner scanner = new Scanner(System.in);

    //User Greeting method
    static void greet()
    {
        System.out.println("Hello!");
    }


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

    /*
     * Print a formatted banner based on the title
     * @param title banner title
     */
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
    // Program code begins
    public static void main(String[] args) {

        //Set Title
        System.out.printf(SET_TITLE, "MadLibs! - Kuldeep Mohanta");

        //Print banner
        printBanner("Mad Libs");

        // Intialize the variables using input()
        String adjective1= input("Please Enter an adjective: ");
        String adjective2 = input("Please Enter an another adjective: ");
        String adjective3 = input("Please Enter an comparison adjective: ");
        String noun = input("Please Enter a noun: ");
        String pluralNoun = input("Please Enter a plural noun: ");
        String verb = input("Please Enter a verb: ");
        String quote = input("Please Enter a famous quote: ");

        //Output screen --------------------------------------------
        //Clear terminal and print banner
        System.out.print(CLEAR_TERMINAL);
        
        //Print Banner message
        printBanner("Coding is " + adjective1 + "!");

        //Print the story using our print()
        //Using strings stored in previously initialized variables, place strings within pre-defined sentences to create a story
        print("Programmers solve lots of " + adjective2 + " " + pluralNoun + "\n");
        print("The " + adjective3 + " the " + pluralNoun + " the more enjoyable they are to " + verb);
        print("Some programmers solve those " + pluralNoun + " such as " + noun + " \"just for fun\"");
        print("Programmers love it when other programmers look at their code and say: \"" + quote + "\"");

        //Exit prompts
        System.out.println("Press [Enter] to exit!");
        scanner.nextLine();
        scanner.close();   
    }

}
