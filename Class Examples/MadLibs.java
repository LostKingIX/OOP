import java.util.Scanner;

public class MadLibs
{
    // Set the title
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033C";

    // Variable
    static Scanner scanner = new Scanner(System.in);

    /**
     * Print a formatted banner based on the title.
     * @param title That's the title in the banner.
     **/
    static void printBanner(String title)
    {
        // These variables only exist within the method!
        String line = "===="; // The lines at the top and bottom
        String banner = ""; // The whole banner

        // Add one "=" for each letter in the title
        // Before the loop
        for (int count = 0; count < title.length(); count++)
        {
            line += '=';
        }

        // Format the banner and assign to a variable.
        banner = line + "\n= " + title + " =\n" + line;

        // Print the banner
        System.out.println(banner);

    }
    /** 
     * Re-create the input("Hello") from Python! 
     * @param prompt The string to be printed.
     * @param return A whole line as a string.
     * **/
    static String input(String prompt)
    {
        System.out.print(prompt);
        // Get a line of input
        return scanner.nextLine();
    }
    /**
     * Re-create the print() from Python!
     * Print = string ending with a new line.
     * @param prompt the string to be printed
     **/
    static void print(String prompt)
    {
        System.out.println(prompt);
    }

    /** This is the starting point of the program. */
    public static void main(String[] args) 
    {
    // Using this title fixer code from first ICE because the title is consistently broken.
    try {
        new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
    } catch (Exception exception) {}

    // Set the title
    System.out.printf(SET_TITLE, "Mad Libs - Mateo Valles");

    // Print the banner
    printBanner("Mad Libs");

    // Variables - intialize the variables using our input
    String adjective1 = input("Please enter an adjective: ");
    String adjective2 = input("Please enter another adjective: ");
    String adjective3 = input("Please enter a comparison adjective: ");
    String noun       = input("Please enter a noun: ");
    String pluralNoun = input("Please enter a plural noun: ");
    String verb       = input("Please enter a verb: ");
    String quote      = input("Please enter a famous quote: ");
 
    // Output screen -------------------------------------------------------------
    // Clear the terminal and print the banner
    System.out.println();
    printBanner("Coding is "+adjective1+"!");

    // Print the story using our print()
    print("Programmers solve lots of " + adjective2 + " " + pluralNoun + ".\n");
    print("The " + adjective3 + " the " + pluralNoun + ", the more enjoyable they are to " + verb + ".\n");
    print("Some programmers solve those " + pluralNoun + " such as " + noun + " just for fun!\n");
    print("Programmers love it when other programmers look at their code and say: \"" + quote + "\"!\n");

    // Exit prompt
        input("Press [Enter] to exit: ");
        scanner.close();
    }
}
