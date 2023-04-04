/* 
 * Name: Kuldeep Mohanta
 * Date: March 22, 2023
 * App Name: Ice Cream Shop (Updated)
 * Description: Interactive Menu of an Ice Cream Shop
 * 
 */

//Import Libraries
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
        
      
        //Create a pre-defined array of IceCream Flavours
        IceCream[] flavours = 
        {

          // Adding 5 pre-defined flavours
          new IceCream("Vanilla", 0.50),            //Index 0
          new IceCream("Rocky Road", 2.00),            //Index 1
          new IceCream("Cookies and Cream", 2.50),            //Index 2
          new IceCream("Cookie Dough", 1.50),            //Index 3
          new IceCream("Chocolate", 1.00),            //Index 3
        };

      // Set the title
      System.out.printf(SET_TITLE, "Ice Cream Shop V2 - Kuldeep Mohanta");

      // Tell me how many flavours
      System.out.println(BANNER);


      // Print how many flavours there are
      System.out.println("We currently have " + flavours.length + " flavours!");


        // Print all the flavours
        for(int index = 0; index < flavours.length;index++)
        {
          //Print all flavour ID, Name, Price
          System.out.printf("%s - %s  - $%.2f \n", //Formatted as cash .2f

          //Increase value of index by one as loop cycles for the next indexed value (next ice cream)
            index + 1, flavours[index].getName(), flavours[index].getPrice());
        }

        //Ask user for a command
        System.out.print("\nPress [Enter] to exit: ");
        Scanner.nextLine();
        Scanner.close();
        // Repeats

      }
    }
     