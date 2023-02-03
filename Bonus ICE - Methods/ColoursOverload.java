//Importing Libraries
import java.util.Scanner;

/*
 * This is the bonus ICE 1
 * Name: Kuldeep Mohanta
 * Date: February 3rd, 2023
 * App Name: Colour Overload
 * Description: Practising overloading methods
 */


public class ColoursOverload {
    
    //Constants
    static final String SET_TITLE = "\033]0;%s\007";


    //RAW String - multiline string
    static final String INPUT_BANNER = """ 
    ==============================
    ~ Colours Overload ~          
    ==============================
    """;

    static final String SET_COLOUR = "\033[%sm]";

    //setting enum constants -> 
    enum Colour
    {
        // 0    1    2    3    4   5    6    7
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, GREY;
        
        //Dark versions of colour
        int dark()
        {
            return ordinal() + 30;
        }
        
        //bright versions of colour
        int bright()
        {
            return ordinal() + 90;
        }

    }

    public static void main(String[] args) {

        // Initialize Scanner
         Scanner scanner = new Scanner(System.in);

        //Setting Title for Window
         System.out.printf(SET_TITLE, "Colour Overload - Kuldeep Mohanta");

        // Print the banner
        System.out.println(INPUT_BANNER);

        System.out.printf(SET_COLOUR, Colour.BLUE.bright());
        


        //Exit prompt
        System.out.print("Press enter to exit: ");
        scanner.nextLine();
        scanner.close();


    }
}
