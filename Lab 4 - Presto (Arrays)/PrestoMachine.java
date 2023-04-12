/*
 * Name:
 * Date:
 * App Name:
 * Description:
 * 
 */

//Import Libraries 
import java.util.ArrayList;
import java.util.Scanner;

public class PrestoMachine
{

    static final int ONE_SECOND = 1000;

        // Stops for a second
        static void waitAsecond()
        {
            try {
                Thread.sleep(ONE_SECOND);
            } catch (Exception e) {

            }
        }
    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String BANNER = """ 
    =======================
        = Presto Card  =    
    =======================
    """
        ;
    
    static final String INSTRUCTIONS = """
        \nProgram Description\nThis program is designed to simulate the storage of Presto Cards
        with associated User details.\nBelow you can see we have a number of cards!
        
        """;



    public static void main(String[] args) {
        
        // User input
        Scanner scanner = new Scanner (System.in);

        // Set the title - Print Banner and description
        System.out.printf(SET_TITLE, "Presto Card - Kuldeep Mohanta");
        System.out.println(BANNER + INSTRUCTIONS);

        //Create an Arraylist for the prestocards
        ArrayList<PrestoCard> cards = new ArrayList<PrestoCard>();
     


        //Predetermined Card information
        cards.add(new PrestoCard("Fred", 5.00));


        //Variables
        String name;
        double balance;
        boolean running = true;
        boolean numeric = true;

        //Loop for the Main application
        do
        {
            //Clear Terminal for fresh input
            System.out.print(CLEAR_TERMINAL);

            //Banner
            System.out.println(BANNER + INSTRUCTIONS);

            //Display Current Cards
            System.out.println("Current cards:\n");
            
            for (int i = 0; i < cards.size(); i++) 
            {
                PrestoCard card = cards.get(i);
                System.out.println((i+1) + " - " + PrestoCard.getName() + " - Balance: $" + PrestoCard.getBalance());
            }

        
        while (running) {
            System.out.print("\nOptions for Presto Card: ");
            String input = scanner.nextLine().trim();

            //Exit Sequence
            if (input.equals("quit")) {
                
                System.out.println("Program is ending now...");
                waitAsecond();
                break;
            }
            else if (input.equals("add")) 
            {
                name = scanner.next();

                try
                {
                    //Checking if balance value is numeric
                    balance = scanner.nextDouble();
                    numeric = true;
                } catch (Exception e)
                {
                    numeric = false;

                }

                    //If balance was not a numeric value
                    if (!numeric) System.out.println("Error - Balance entry is not a numeric value.");

                    //Else add the new Card values
                    else cards.add(new PrestoCard(name, balance));

                    cards.add(new PrestoCard(name, balance));
                    System.out.println(name + " has been added to your Presto card collection.");
                }
                else {
                    System.out.println("Error: Invalid input format. Expected format: add CardName InitialBalance");
                }
            }
           

        




        //Ask user for a command
        System.out.print("\nPress [Enter] to exit: ");
        scanner.nextLine();
        scanner.close();


    }
}