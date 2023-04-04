public class IceCream
{
    //Private Variable - Only usable within the class
    private String name;
    private double price;

    /*
     * Constructor - called when creating an object
     * @return An IceCream Object
     *  
     */
    IceCream(String name, double price)
    {
        // Initialize the class variables
        this.name = name;
        this.price = price;

    }

    /* Getter methods
     * @return the flavour's name
    */
    String getName()
    {
        return name;
    }

    /* @return the flavour's price */
    double getPrice()
    {
        return price;
        
    }



}