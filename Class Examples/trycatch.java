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

            
    }
    
}