public class IceCream {

    //Private Variables - only useable within the class
    private String name;
    private double price;

    /*
     * Constructor -
     * @return an Ice Cream Object
     * 
     */

    IceCream(String name, double price)
    {
        //Initialize the class variable
        this.name = name;
        this.price = price;

    }

    // Getting Methods - aka accessors

    String getName()
    {
        return name;


    }

    double getPrice()
    {
        return price;
    }

    
}