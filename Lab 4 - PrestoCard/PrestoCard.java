/*
 * Name: Kuldeep Mohanta
 * Date: April 17, 2023
 * App Name: PrestoCard.java
 * Description: This class lays out the blue print for the Presto Card Machine, includes the constructor for the card object,
 * the accessors for name and balance, as well as two methods "tap" and "topup" which check the cards value and determine
 * if the balance is enough to 'tap' (subtract) 2.5 from the card and have the ability to add funds to a card's existing
 * balance.
 * 
 */

 public class PrestoCard {

    //Private variables for internal use
    private String name;
    private double balance;

    /*
     * Constructor - PrestoCard
     * @return a Card Object
     */
    PrestoCard(String name, double balance)
    {
        //Initialize the class variable
        this.name = name;
        this.balance = balance;
    }

    //Accessors
    String getName()
    {
        return name;
    }

    double getBalance()
    {
        return balance;
    }

    /*
     * Checks of the balance of the presto card is greater than the tap amount, if so then it subtracts 2.5
     * from the balance of the card
     * @oaram fare for the subtraction from the card's balance
     * @returns true/false depending on the balance amount
     */
    
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