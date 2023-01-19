import java.util.Scanner;


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

        // Set Title
        System.out.printf(SET_TITLE, "Hello World - Kuldeep Mohanta");
        
        //Ask for First Name
        System.out.print("Enter your first name: ");

        //Get input from user
        firstName = scanner.nextLine();

        //Ask for Last Name
        System.out.print("Enter your Last name: ");

        //Get input from user
        lastName = scanner.nextLine();

        //Print greeting message to the user
        System.out.printf("Hello, %s", firstName, lastName);
        

        // Display output message for user greeting
        System.out.println("Hello World!");

        //Exit Prompt
        System.out.print("Press Enter to exit application! ");
        scanner.nextLine();
        scanner.close();

    }
        
}