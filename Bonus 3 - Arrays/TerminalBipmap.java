import java.util.Scanner;

public class TerminalBipmap 
    {
        //Constants
        static final String SET_TITLE = "\033]0;%s\007";
        
        // Clear terminal
        static final String CLEAR_TERMINAL = "\033c";

        //RAW String - multiline string
        static final String BANNER = """ 
        =======================
            = Terminal Bitmap =    
        =======================
        """;

        static final String INSTRUCTIONS = """
                Colour Codes:
                [0] Black
                [1] Green
                """;
                

        public static void main(String[] args) {
            
            //user Input
            Scanner scanner = new Scanner(System.in);

            // Variables
            boolean

            //Change the title
            System.out.printf(SET_TITLE, "Terminal Bitmap - Kuldeep Mohanta");

            //Print the banner and instructions
            System.out.println(BANNER + INSTRUCTIONS);

            // Ask for the size X and size Y
            do 
                {
                    System.out.println("Enter the bitmap size XY: ");

                    // Try to get 2 integers
                    try {
                        sizeX = scanner.nextInt();
                        sizeY = scanner.nextInt();
                        numeric = true; //Both inputs are numeric
                    } catch (Exception e) {
                        numeric = false; // Not numeric - validation fail
                    }
                } while ();




            //Exit prompt
            System.out.print("Press [Enter] to exit: ");
            scanner.nextLine();
            scanner.close();
        }
    }
