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
        Scanner scanner = new Scanner (System.in);

        //An Arraylist of IceCream flavours, start with zero elements
        ArrayList<IceCream> flavours = new ArrayList<IceCream>();

        //Add a few flavours
        flavours.add(new IceCream("Vanilla", 1.00));
        flavours.add(new IceCream("Chocolate", 1.50));
        flavours.add(new IceCream("Strawberry", 3.00));
        flavours.add(new IceCream("Maple", 3.50));
        flavours.add(new IceCream("Mint", 2.00));

        //Varible declaration
        boolean running = true; //is the app running?
        boolean numeric = true;
        String command; // allows the app to enable quit, add, del, sort functionality
        String name; // allows the input of a flavour name
        double price = 0; // allows the input of a flavour price
        int index = 0; // specifies the value (location) of a flavour on the list
        String sortBy; //stores how the user wants to sort the flavour list


        //Set the title
        System.out.printf(SET_TITLE,"Ice Cream Shop V2 - Kuldeep Mohanta");

        // CLI Loop 
        do
        {
            //Clear terminal
            System.out.print(CLEAR_TERMINAL);

            //Banner Output
            System.out.println(BANNER);

            //Tell me how many flavours there are
            System.out.println("We currently have " + flavours.size() + " flavours");

            //Print all of the flavours

            for(int count = 0; count < flavours.size(); count++)
            {
                System.out.printf("%s - %s - $%.2f \n",
                count + 1, flavours.get(count).getName(), flavours.get(count).getPrice());
                
            }

            //Ask for user input
            System.out.print("Enter a command: ");

            //Scan for one word
            command = scanner.next(); 

            //Quit app with user input
            if(command.equals("quit"))
            {
                running = false;
                System.out.println("Application is now closing!");
            }

            //Add a flavour
            else if(command.equals("add"))
            {
                name = scanner.next();

                //try to validate for double
                try 
                    {
                        price = scanner.nextDouble();
                        numeric = true;

                    } catch (Exception e)
                    {
                        numeric = false;
                    }

                    //In case the price is not valid input (!numeric)
                    if(!numeric)
                    {
                        System.out.println("Error - Invalid Price entry!");
                    }

                    else flavours.add(new IceCream(name, price));
                
            }

            //Removing a flavour
            else if (command.equalsIgnoreCase("del"))
            {
                //Try to get an index value to identify the flavour to remove
                try
                {
                    index = scanner.nextInt();
                    numeric = true;
                } catch (Exception e) {
                    numeric = false;
                }

                //Convert from ID to index
                index--;

                //Error in case index is not numeric OR out of bounds
                if(!numeric || index < 0 || index >= flavours.size())
                {
                    System.out.println("Error - Index value is out of bounds! ");
                }

                else
                {
                    //Remove flavour from flavour list
                    flavours.remove(index);
                }

               
            }

            //Sorting Flavours
            else if (command.equals("sort"))
            {
                //sort by name
                sortBy = scanner.next();

                //if user enters that they would like to sort by name
                if(sortBy.equals("name"))
                    {
                        flavours.sort(IceCream::compareNames);
                    }

                //if user enters that they would like to sort by price
                else if(sortBy.equals("price"))
                    {
                        flavours.sort(IceCream::compareNames);
                    }
                
                //Invalid sorting method inputted
                else
                    {
                        System.out.println("Error - Invalid Sorting!");
                    }
            }

            //Invalid command inputted
            else
                {
                    System.out.println("Error - Invalid Command");
                }

            //Remove extra input
            scanner.nextLine();

            // Hold program for a second
            waitAsecond();

        // Runs while app is running
        } while (running);

    }
}