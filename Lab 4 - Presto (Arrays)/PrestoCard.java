public class PrestoCard {

    //Private variables for internal use
    private static String name;
    private static double balance;

    //Constructor
    PrestoCard(String name, double balance)
    {
        //Initialize the class variable
        this.name = name;
        this.balance = balance;

    }

    //Accessors
    static String getName()
    {
        return name;
    }

    static double getBalance()
    {
        return balance;
    }

    //Used for the tap() function
    public boolean tap(double fare) 
    {
        //Check if the balance amount is greater than the fare amount
        if (balance >= fare) 
            {
                balance -= fare;
                return true;
            }
        //If there is not enough balance to complete the transaction then print error statement
        else 
            {
                System.out.println("Error: Insufficient balance, Please top up more funds to use this card!");
                return false;
            }
    }
   
    //Add value to the balance based on passed through parameter
    public void topUp(double funds) 
    {
        balance += funds;
    }

}