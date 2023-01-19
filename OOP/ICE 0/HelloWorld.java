import java.lang.annotation.Inherited;
import java.util.Scanner;

// Author: Kuldeep Mohanta
// Date: 18-01-2023
// Description: Introduction program for Java to test if it compiles, runs,
// and executes as it should while using a simple program "Hello World".
// This program prompts and stores user input, and displays a greeting message
// back to the user showing that it is working!

// Notes: Class must have the same name as the filename
// Class is a "container for code"
public class HelloWorld
{
    // Constants
    static final String SET_TITLE = "\033]0;%s\007  \t";


    public static void main(String[] args) {

        //Declaring Variables
        String firstName;
        String lastName;

        //Initializing Scanner for system input
        Scanner scanner = new Scanner(System.in);

        // Old Terminal Instructions
        try{
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
        } catch (Exception exception) {}
        
        // Set Title
        System.out.printf(SET_TITLE, "Hello World - ICE 0");
        
        //Ask for First Name
        System.out.print("\nEnter your first name: ");

        //Get input from user
        firstName = scanner.nextLine();

        //Ask for Last Name
        System.out.print("\nEnter your Last name: ");

        //Get input from user
        lastName = scanner.nextLine();

        //Print greeting message to the user
        System.out.printf("\nHello, %s!", firstName, lastName);

        //Exit Prompt
        System.out.print("\nPress Enter to exit application! ");
        scanner.nextLine();
        scanner.close();

    }
        
}