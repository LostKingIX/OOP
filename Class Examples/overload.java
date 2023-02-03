//Import Libraries
import java.util.Scanner;

public class overload {

    //Overloaded Methods

    /*
     * Add 2 integers
     * @param number1 First Integer
     * @param number2 Second Integer
     * @return the integer result
     * 
     */

    static int add(int number1, int number2)
    {
        //Function could show error since the return value needs to be defined as the functions input is 
        return number1 + number2;
    }

    /*
     * Add 2 integers
     * @param number1 First Integer
     * @param number2 Second Integer
     * @return the integer result
     * 
     */

    static float add(float number1, float number2)
    {
        //Function could show error since the return value needs to be defined as the functions input is 
        return number1 + number2;
    }

    public static void main(String[] args) 
    {
        //User Input
        Scanner scanner = new Scanner (System.in);

        // Addition
        System.out.println("Adding 2 integers: " + add(2, 4));

        // Overloaded Method
        System.out.println("Adding 2 floats: " + add(1.5f, 2.9f));

        //Exit prompt
        System.out.print("Press enter to exit: ");
        scanner.nextLine();


        
    }
    
}
