/* 
 * Name: Kuldeep Mohanta
 * Date: March 22, 2023
 * App Name: Ice Cream Shop (Updated)
 * Description: Interactive Menu of an Ice Cream Shop
 * 
 */

//Import Libraries
import java.util.ArrayList;
import java.util.Scanner;

public class IceCreamShop
{
    //Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
        _
        ,' `,.
        >-.(__)
       (_,-' |
         `.  |
           `.| Ice Cream Shop PRIME
             `
        """;

        static final int ONE_SECOND = 1000;

        // Stops for a second
        static void waitAsecond()
        {
            try {
                Thread.sleep(ONE_SECOND);
            } catch (Exception e) {

            }
        }

    public static void main(String[] args)
    {
        // User input
        Scanner Scanner = new Scanner (System.in);

        //An Arraylist of IceCream flavours, start with zero elements
        ArrayList<IceCream> flavours = new ArrayList<IceCream>();

        //Add a few flavours
        flavours.add(new IceCream("Vanilla", 1.00));
        flavours.add(new IceCream("Chocolate", 1.50));
        flavours.add(new IceCream("Strawberry", 3.00));
        flavours.add(new IceCream("Maple", 3.50));
        flavours.add(new IceCream("Mint", 2.00));

        //Varible declaration
        boolean running = true;
        boolean numeric = true;
        String command;
        String name;
        double price = 0;


        //Set the title
        System.out.printf(SET_TITLE,"Ice Cream Shop V2 - Kuldeep Mohanta");

        // CLI Loop 
        do
        {
            //Clear terminal
            System.out.print(CLEAR_TERMINAL);
            
            //Tell me how many flavours there are
            System.out.println("We currently have " + flavours.size() + " flavours");

            //Print all of the flavours

            for(int index = 0; index < flavours.size(); index++)
            {
                System.out.printf("%s - %s - %s \n",
                index + 1, flavours.get(index).getName(), flavours.get(index).getPrice());
                
            }

            //Ask for user input
            System.out.print("Enter a command: ");
            command = Scanner.next();

            //Quit app with user input
            if(command.equals("quit"))
            {
                running = false;
                System.out.println("Application is now closing!");
            }

            //Add a flavour
            else if(command.equals("add"))
            {
                name = Scanner.next();

                //try to validate for double input
                try 
                    {
                        price = Scanner.nextDouble();
                        numeric = true;

                    } catch (Exception e)
                    {
                        numeric = false;
                    }

                    //In case the price is not valid input (!numeric)
                    if(!numeric) System.out.println("Error - Invalid Price entry!");

                    else flavours.add(new IceCream(name, price));
                
            }

            // Hold program for a second
            waitAsecond();

        // Runs while app is running
        } while (running);

    }
}