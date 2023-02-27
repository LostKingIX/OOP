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

    //Methods

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

    /*
     * Prints text ending with a new line
     * @param text the text to be printed
     * 
     */
    static void print (String text)
    {
        System.out.println(text);
    }

    /*
     * Prints colored text ending with a new line
     * @param text the text to be printed
     * 
     */
    static void print(String text, int foreground)
    {
        setColour(foreground);
        System.out.println(text);
        resetColours();
    }

    /*
     * Prints colored text ending with a new line
     * @param text - text the text to be printed
     * @param foreground - text colour
     * @param background - bg colour
     * 
     */
    static void print(String text, int foreground, int background)
    {
        setColour(foreground);
        setColour(background);
        System.out.println(text);
        resetColours();
    }

    /*
     * Change the foreground colour of the text (text colour)
     * @Param foreground font colour
     * @param background bg color
     */
    static void setColour(int foreground)
    {
        System.out.printf(SET_COLOUR, foreground);
    }


    /*
     * Change the foreground colour of the text (text colour)
     * @Param foreground font colour
     * @param background bg color
     */
    static void setColour(int foreground, int background)
    {
        background += 10; //Convert to bg color
        System.out.printf(SET_COLOUR, foreground);
        System.out.printf(SET_COLOUR, background);
    }
    

    //Resets the colours of the terminal
    static void resetColours()
    {
        System.out.printf(SET_COLOUR, 0);
    }


    public static void main(String[] args) {

        // Initialize Scanner
         Scanner scanner = new Scanner(System.in);

        //Setting Title for Window
         System.out.printf(SET_TITLE, "Colour Overload - Kuldeep Mohanta");

        // Print the banner in colour
        print(INPUT_BANNER, Colour.BLUE.bright(), Colour.CYAN.dark());


        //Printing all colours
        System.out.println("All 16 foreground colours: ");
        
        //Dark Colours
        for(int count = Colour.BLACK.dark(); count <= Colour.GREY.dark(); count++)
        {
            print("Colour code: " + count, count);

        }

        //Bright Colours
        for(int count = Colour.BLACK.bright(); count <= Colour.GREY.bright(); count++)
        {
            print("Colour code: " + count, count);
            
        }

        //Exit prompt
        System.out.print("Press enter to exit: ");
        scanner.nextLine();
        scanner.close();


    }
}
