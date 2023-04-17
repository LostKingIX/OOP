//Import Libraries 
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: April 17th, 2023
 * App Name: PrestoMachine.java
 * Description: This application is designed present the user with existing cards in the system that they can perform actions
 * like 'tapping' or adding funds that are similar to real transit transactions. User's are able to add new card details. remove 
 * exisiting cards, tap recorded cards, as well as topup existing cards with more funds.
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
        System.out.println(CLEAR_TERMINAL);
        System.out.println(BANNER + INSTRUCTIONS);

        //Create an Arraylist for the prestocards
        ArrayList<PrestoCard> cards = new ArrayList<PrestoCard>();
     
        //Predetermined Card information
        cards.add(new PrestoCard("Bob", 5.00));
        cards.add(new PrestoCard("Lilly", 5.00));
        cards.add(new PrestoCard("Fred", 2.50));


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
                System.out.println((i) + " - " + card.getName() + " - Balance: " + String.format("$%.2f", card.getBalance()));
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
                    //Prompt user to select which card they want to tap
                    System.out.println("Enter the name and balance of a new card to register:");

                    input = scanner.nextLine();

                    //Splitting the entered input into two index's to make locating the balance and name easier
                    String[] inputs = input.split(" ");
                    name = inputs[0];

                    //Initializing balance parameter
                    balance = 0.0;
                    try
                    {
                        //Checking if balance value is numeric
                        balance = Double.parseDouble(inputs[1]);
                        
                        //Capitalize name's first char for formatting
                        String formatted_name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

                        //Adding the new Card values assuming correct validation
                        cards.add(new PrestoCard(formatted_name, balance));

                        //Printing confirmation message to the user that card was added succesfully
                        System.out.println(formatted_name + " has been added to the machine's record with a balance of " + String.format("$%.2f", balance));
                        waitAsecond();
                        scanner.nextLine();

                    } catch (Exception e)
                    {
                        System.out.println("Error - Balance entry is not a numeric value.");
                    }
                    
                }
                
                //User enters delete command
                else if (input.equals("del")) 
                {
                    //Ask user for which card they want to delete
                    System.out.println("Enter the name of the card to delete:");

                    //capture the name the user selects
                    name = scanner.nextLine();

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
                                    System.out.println("Machine has succesfully removed " + name + "'s card!");
                                    scanner.nextLine();
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
                    name = scanner.nextLine();

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
                                System.out.println("Card tapped! ~~  New balance: " + String.format("$%.2f", card.getBalance()));
                                
                                //Hold System to let the user read the confirmation message
                                waitAsecond();
                                scanner.nextLine();
                            }
                        else
                            {
                                //Allow the tap function to display error message regarding insufficient funds
                                waitAsecond();
                                
                                scanner.nextLine();
                            }
                    

                            break;
                        }
                    }

                    //If the card does not exist, alert user with error
                    if (!found) 
                    {
                        //Allow the tap function to display error message regarding insufficient funds
                        waitAsecond();

                        System.out.println("Error - A card with that name does not exist in the system, please enter a card name that is registered.");
                        scanner.nextLine();
                    }

                }

                //User enters top up command
                if (input.equalsIgnoreCase("topup")) 
                {
                    //Prompt user for which user they want to add funds to
                    System.out.println("Please enter the name of the card you wish to add funds to and how much money you would like to top up the card for: ");

                    input = scanner.nextLine();

                    //Splitting the entered input into two index's to make locating the balance and name easier
                    String[] inputs = input.split(" ");
                    name = inputs[0];

                    // //Scanning double value to understand how much the user wants to add to the balance of the card
                    // funds = scanner.nextDouble();
                    try
                    {

                        //Checking if funds value is numeric
                        funds = Double.parseDouble(inputs[1]);

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
                                System.out.println("Successfully added funds to " + card.getName() + "'s Card! \n~~ New balance: " + String.format("$%.2f", card.getBalance()));

                                waitAsecond();
                                scanner.nextLine();
                                
                                //Card exists / success
                                cardExists = true;
                                break;
                            }
                        }
                    //Else if User has not entered numeric values for their funds
                    }catch (Exception e)
                        {
                            //Error message if Funds value is not numeric
                            System.out.println("Error -  Funds entry is not a numeric value.");
                            waitAsecond();
                            scanner.nextLine();
                        }

                    //Card does not exist, cannnot find the card
                    if (!cardExists) 
                    {
                        System.out.println("Error: Card " + name + " is not registered in the system, please enter a different card that is recorded!");
                        waitAsecond();
                        scanner.nextLine();
                    }
                }
          

    } while (running);
               
            //Ask user for a command
            System.out.print("\nPress [Enter] to exit: ");
            scanner.nextLine();
            scanner.close();
        
}
}
