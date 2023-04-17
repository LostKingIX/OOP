/*
 * Name: Kuldeep Mohanta
 * Date: April 10, 2023
 * App Name: Bitmap.java
 * Description: This class file initializes the 2d array that will be used for the bitmap using x, y values. It also contains two void 
 * functions that prompt user for input to create the bitmap with and then print the bitmap with the corresponding binary input values
 * 
 */


public class Bitmap {

    //Constants
    private final String GREEN = "\033[102m";
    private final String RESET_COLOUR = "\033[0m";

   
    //Class Variables
    //Private means only this class can access 
    private char [][] bitmap; // 2D Array of chars
    private int sizeX; // Width - horizontal size
    private int sizeY; // Height - vertical size
    
    /*
     * Constructor - Must match the class name
     * @return a BitMap object
     * 
     */
    Bitmap(int sizeX, int sizeY)
    {
        //Initialize the class variables
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        //Initialie the 2D Array with the given dimensions
        bitmap = new char[sizeX][sizeY];
    }
        /*
         * Ask for each pixel colour code, line by line
         * @param scanner For the user input
         * 
         */

         void input (Scanner scanner)
         {
            //For each line of colour codes
            for(int countY = 0; countY < sizeY; countY++)
                {
                    //Input 1 line of colour codes
                    System.out.print("Enter " + sizeX + " codes for line " + countY + ": ");
                    
                    for (int countX=0; countX < sizeX; countX++)
                        {
                            // "Use  to access the letters of a string if it was a string array"
                            // Fred
                            // 0123
                            bitmap[countX][countY] = scanner.next().charAt(0); // index 0
                            
                        }

                    // Finished getting one line
                    scanner.nextLine(); //Discard input
                }

        }

        /* Draws the bitmap */
        void print ()
        {
            //Go through each line
            for(int countY = 0; countY < sizeY; countY++)
                {
                    //Go through each code
                    for(int countX = 0; countX < sizeX; countX++)
                        {
                            if(bitmap[countX][countY] == '0')
                                System.out.print("  "); // 2 spaces so it's square
                            
                            else if (bitmap[countX][countY] == '1')
                                System.out.print(GREEN + "  " + RESET_COLOUR);
                        }

                    //Go to the next line
                    System.out.println();
                }
        }
}
