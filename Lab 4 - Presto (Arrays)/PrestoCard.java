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

    public boolean tap(double fare) {
        if (balance >= fare) {
            balance -= fare;
            return true;
        }
        else {
            System.out.println("Error: Insufficient balance, Please top up more funds to use this card!");
            return false;
        }
    }
   

    public void topUp(double funds) 
    {
        balance += funds;
    }

}