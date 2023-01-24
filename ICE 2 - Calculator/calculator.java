import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: January 20th, 2023
 * Application Name: calculator.java
 * Description: Application that performs simple mathematical calculations
 * 
 */
public class calculator {
    
    //Constants
    static final String SET_TITLE = "\033]0;%s\007";

    //RAW String - multiline string
    static final String INPUT_BANNER = """ 
    ****************
    ~ Calculator ~          
    ****************
    """;

    static final String OUTPUT_BANNER = """
    ****************
    ~ Calculator ~          
    ****************            
    """;

    public static void main(String[] args) {
        
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaring variables
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        char operator = ' '; //Use '' for chars (remember to have spaces for default value)
        boolean valid = false;



        //Setting Title for Window
        System.out.printf(SET_TITLE, "Calculator - Kuldeep Mohanta");

        // Print the banner
        System.out.println(INPUT_BANNER);

        //Prompt user for calculator
        System.out.println("Please enter a calculation (e.g. 1 + 2):");

        try
        {
            //Get a number, an operator, and another number
            number1 = scanner.nextFloat();
            operator = scanner.next().charAt(0);
            number2 = scanner.nextFloat();
            //Data is valid, processing is successful
            valid = true;
        }

        catch (Exception exception)

        {
            valid = false; // Did not receive correct data for prompts
        }
        
        //Trim excess input
        scanner.nextLine();

        //Switch case

        switch(operator)
        {
            //Addition
            case '+':
                result = number1 + number2;
                break;
            //Subtraction
            case '-':
                result = number1 - number2;
                break;
            //Multiplication
            case '*':
                result = number1 * number2;
                break;
            
            //Division
            case '/':
                //Error catch - cannot divide by zero
                if (number2 ==0)
                {
                    System.out.println("Error - Cannot divide by 0!");
                    valid = false;
                }
                else
                    result = number1 / number2;
                break;
            default:
                System.out.println("Error - Invalid Operator");
                valid = false; // Not a valid calculation
                break;
        }

        if(valid)
        {
            //Print the calulations
            System.out.printf("%s %s %s = %s \n",number1, operator, number2, result);

        }

        //Exit prompt
        System.out.print("Press [Enter] to exit! ");
        scanner.nextLine();
        scanner.close();


    }
}
