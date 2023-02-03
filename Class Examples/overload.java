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


    /*
     * Calculate the square of a number
     * @param number The number you want to square 
     * @return the return value 
     */

    static int power(int number)
    {
        return number * number;
    }

    /*
     * Calculate the number raised by a power
     * @param number - The number that an operation will be performed on
     * @param power - the power that will the number will be raised to
     * @return The result
     * 
     */

    static int power(int number, int power)
    {
        int result = 1;

        //Before execution, condition to loop, after each iteration
        for (int count = 0; count < power; count++)
        {
            result *= number; // 
        }

        return result;
    }

    public static void main(String[] args) 
    {
        //User Input
        Scanner scanner = new Scanner (System.in);

        // Addition
        System.out.println("Adding 2 integers: " + add(2, 4));

        // Overloaded Method
        System.out.println("Adding 2 floats: " + add(1.5f, 2.9f));

        System.out.println("Squaring a number: " + power(4));
        System.out.println("2 raised by the power of 8: " + power(2, 4));

        //Exit prompt
        System.out.print("Press enter to exit: ");
        scanner.nextLine();
        scanner.close();


        
    }
    
}
