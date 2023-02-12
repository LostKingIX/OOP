//Import Libraries
import java.util.Scanner;

public class madlibs {

    //Constants
    static final String SET_TITLE = "\033]0;%s\007";

    //RAW String - multiline string
    static final String INPUT_BANNER = """ 
    ===============
    = Mad Libs =    
    ===============
    """;

    //User Greeting method
    static void greet()
    {
        System.out.println("Hello!");
    }

    // Program code begins
    public static void main(String[] args) {
        
        //User Input - initialize scanner
        Scanner scanner = new Scanner(System.in);

        //Using greet method to present message
        greet();

        
    }

}
