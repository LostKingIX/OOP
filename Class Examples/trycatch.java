import java.util.Scanner;

public class trycatch {

    public static void main(String[] args) {

        //Intialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        int age;
        boolean numeric;

        // ask for the age
        System.out.print("Enter your age: ");
        
        //Try catch block
        try
        {
            // Only executed when the conversion is possible
            age = Integer.parseInt(scanner.nextLine());
            numeric = true;
        }
        catch (Exception exception)
        {
            //Conversion was not successful
            numeric = false;

        }

        //Error in case the input is not numeric
        if (!numeric)
            System.out.println("\nError - Input must be numeric!");

        // Success Messages
        else if (age >= 19)
            System.out.println("You can get a driver's license, vote, and purchase alcohol!");

        else if (age>=18)
            System.out.println("You can get a driver's license and vote!");

        else if (age >= 16)
            System.out.println("You can get a driver's license");
        
        //User is too young to drive, vote, or buy alcohol

        else 
            System.out.println("Unfortunately, you must age more young one.");

        //Closing Scanner
        scanner.close();
    }
    
}