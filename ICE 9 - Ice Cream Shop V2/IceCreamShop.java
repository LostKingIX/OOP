/* 
 * Name: Kuldeep Mohanta
 * Date: March 22, 2023
 * App Name: Ice Cream Shop (Updated)
 * Description: Interactive Menu of an Ice Cream Shop
 * 
 */

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

    public static void main(String[] args)
    {
        // User input
        Scanner Scanner = new Scanner (System.in);
        
        // An ArrayList of IceCream Flavours
        // Start with zero elements
        ArrayList<IceCream>flavours = new ArrayList<IceCream>();

      // Add at least 5 flavours
      flavours.add(new IceCream("Vanilla", 1.00));
      flavours.add(new IceCream("Chcolate", 1.50));
      flavours.add(new IceCream("Strawberry", 3.00));
      flavours.add(new IceCream("Maple", 3.50));
      flavours.add(new IceCream("Mint", 2.00));

      // Variables
      boolean running = true; // is the app running?


      // Tell me how many flavours
      System.out.println("We currently have " + flavours.size());

      // Set the title
      System.out.printf(SET_TITLE, "Ice Cream Shop V2 - Kuldeep Mohanta");

      // CLI Loop
      do {
        // Print how many flavours there are
        System.out.println("We currently have " + flavours.size() + " flavours!");


        // Print all the flavours
        // Go through all indices of the ArraysList
        for(int index = 0; index < flavours.size();index++)
        {
          //Print all flavour ID, Name, Price
          System.out.printf("%s - %s  - $%.2f \n", //Formatted as cash .2f
            index + 1, flavours.get(index).getName(), flavours.get(index).getPrice());

        }

        //Ask user for a command
        System.out.print("Enter a command: ");
        Scanner.next();
        // Repeats

      }while(running);
    }
}