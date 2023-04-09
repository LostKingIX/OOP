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

    //Static - used directly from the class

    /*Define how to compare the names
     * @return negative number in case flavour 1 name is less than flavour 2 name
     * 
     */

     static int compareNames(IceCream flavour1, IceCream flavour2)
     {
        //CompareTo is used by comparing strings repeating (in this case the flavour list)
        // by viewing the strings in lexigraphical order (aka. alphabetical order)
        return flavour1.getName().compareTo(flavour2.getName());

     }

     //Static - used directly from the class

    /*Define how to compare the names
     * @return negative number in case flavour 1 name is less than flavour 2 name
     * 
     */

     static int comparePrices(IceCream flavour1, IceCream flavour2)
     {
        //CompareTo is used by comparing strings repeating (in this case the flavour list)
        // by viewing the strings in lexigraphical order (aka. alphabetical order)
        if (flavour1.getPrice() > flavour2.getPrice()) return -1;
        else return 1;
     }
}

