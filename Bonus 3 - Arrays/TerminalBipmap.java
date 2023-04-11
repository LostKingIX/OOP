//Import Libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: April 10, 2023
 * App Name: TerminalBipmap.java
 * Description: This application takes user inputs for the dimensions of a terminal shape (e.g. a square is represented by x,y cords of '5,5') and takes binary
 * values for those dimensions to create coloured squares (bitmap).
 * 
 */

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
            boolean numeric;
            int sizeX = 0;
            int sizeY = 0;

            //Declare a new BitMap Object
            Bitmap bitmap;

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
                        } catch (Exception e) 
                        {
                            numeric = false; // Not numeric - validation fail
                        }

                    //Error in case input is not numeric 
                    if(!numeric) System.out.println("Error - XY must be numeric! ");

                    //Get rid of extra input
                    scanner.nextLine();

                //Repeat until a numeric input is given 
                } while (!numeric);

                //Create a new bitmap with the specificed value 
                bitmap = new Bitmap(sizeX, sizeY);

                // User will draw a bitmap
                bitmap.input(scanner);

                //Output screen 
                System.out.println(CLEAR_TERMINAL + BANNER);

                //Print the bitmap
                bitmap.print();


            //Exit prompt
            System.out.println("Press [Enter] to exit: ");
            scanner.nextLine();
            scanner.close();
        }
    }
