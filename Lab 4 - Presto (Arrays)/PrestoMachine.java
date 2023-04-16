//Import Libraries 
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name:
 * Date:
 * App Name:
 * Description:
 * 
 */
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
            
    \nProgram Description
    \nThis program is designed to simulate the storage of Presto Cards with associated User details.
    \nBelow you can see we have a number of cards!

            """;;
    



    public static void main(String[] args) 
    {
        
        // User input
        Scanner scanner = new Scanner (System.in);

        // Set the title - Print Banner and description
        System.out.printf(SET_TITLE, "Presto Card - Kuldeep Mohanta");
        System.out.println(BANNER + INSTRUCTIONS);

        //Create an Arraylist for the prestocards
        ArrayList<PrestoCard> cards = new ArrayList<PrestoCard>();
     
        //Predetermined Card information
        cards.add(new PrestoCard("Fred", 5.00));
        cards.add(new PrestoCard("Lilly", 5.00));


        //Variables
        String name;
        double balance;
        double funds = 0;
        boolean running = true;
        boolean cardExists = true;
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
            
            //Loop through the length of the cards arraylist
            for (int i = 0; i < cards.size(); i++) 
            {
                //Print card based on indexed position
                PrestoCard card = cards.get(i);
                
                //Print the next indexed card based on position
                System.out.println((i+1) + " - " + card.getName() + " - Balance: " + String.format("$%.2f", card.getBalance()));
            }

                //Prompt user for what they want to do with the presto card
                System.out.print("\nOptions for Presto Card: ");
                String input = scanner.nextLine().trim();

                //Exit Sequence
                if (input.equals("quit")) 
                {
                    System.out.println("Program is ending now...");
                    waitAsecond();
                    break;
                }

                else if (input.equals("add")) 
                {
                    //Receive input on the next word
                    name = scanner.next();
                    //Scan for next double value for balance parameter
                    balance = scanner.nextDouble();

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
                    if (!numeric)
                        { 
                            System.out.println("Error - Balance entry is not a numeric value.");
                        }

                    //Else add the new Card values assuming correct validation
                    else
                    {
                        cards.add(new PrestoCard(name, balance));
                        
                        //Printing confirmation message to the user that card was added succesfully
                        System.out.println(name + " has been added to your Presto card collection.");
                    }
                    
                }
                
                //User enters delete command
                else if (input.equals("del")) 
                {
                    //Ask user for which card they want to delete
                    System.out.println("Enter the name of the card to delete:");

                    //capture the name the user selects
                    name = scanner.next();

                    //Cycle through the arraylist of cards to find the name
                    for (int i = 0; i < cards.size(); i++) 
                        {
                            //Get the name of the card and ignore the case sensitivity
                            PrestoCard card = cards.get(i);
                            if (card.getName().equalsIgnoreCase(name)) 
                                {
                                    //remove the card from list according to located position in the array
                                    cards.remove(i);
                                    waitAsecond();
                                    
                                    //print success statement
                                    System.out.println("Machine has succesfully removed the card!");
                                    break;
                                }
                        }
                }

                //User enters tap command
                else if (input.equals("tap")) 
                {
                    //Prompt user to select which card they want to tap
                    System.out.println("Enter the name of the card to tap:");

                    //Scan input for next string (name of card)
                    name = scanner.next();

                    //checking if card is found
                    boolean found = false;

                    //Looping through cards arraylist to see if card exists
                    for (int i = 0; i < cards.size(); i++) 
                    {
                        //Get the name of the card and ignore the case sensitivity
                        PrestoCard card = cards.get(i);
                        if (card.getName().equalsIgnoreCase(name)) 
                        {
                            //Card has been found
                            found = true;

                            //pass to the tap() method
                            if (card.tap(2.50)) 
                            {
                                //If succesful, print confirmation statement
                                System.out.println("Card tapped. New balance: $" + card.getBalance());
                            }

                            break;
                        }
                    }

                    //If the card does not exist, alert user with error
                    if (!found) 
                    {
                        System.out.println("Error - A card with that name does not exist in the system, please enter a card name that is registered.");
                    }

                }

                //User enters top up command
                if (input.equalsIgnoreCase("topup")) 
                {
                    //Receiving user input and scanning name
                    name = scanner.next();
                    //Scanning double value to understand how much the user wants to add to the balance of the card
                    funds = scanner.nextDouble();

                    //Cycle through arraylist to find the card the user selected
                    for (int i = 0; i < cards.size(); i++) 
                    {
                        //Get the name of the card and ignore the case sensitivity
                        PrestoCard card = cards.get(i);

                        //if card name matches user input
                        if (card.getName().equalsIgnoreCase(name)) 
                        {
                            //use the topUp() method to add funds
                            card.topUp(funds);

                            //Print success statement
                            System.out.println("Successfully added funds to card " + card + ". New balance: $" + card.getBalance());
                            
                            //Card exists / success
                            cardExists = true;
                            break;
                        }
                    }

                    //Card does not exist, cannnot find the card
                    if (!cardExists) 
                    {
                        System.out.println("Error: Card " + name + " is not registered in the system, please enter a different card that is recorded!");
                    }
                }
          

    } while (running);
               
            //Ask user for a command
            System.out.print("\nPress [Enter] to exit: ");
            scanner.nextLine();
            scanner.close();
        
}
}
