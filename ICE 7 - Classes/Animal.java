import java.util.Scanner;

public class Animal
{
    // Each Animal will have a different implementation of these 
    String name; // What they respond to
    String species; // The kind of animal
    String breed; // What breed
    String colour; // What fur/feather colour

    /*
     * Contructor: Creates a new object
     * It must be named exactly the same name as the class
     * @return a new pokemon object
     * 
     */

    Animal(String name, String species, String breed, String colour)
    {
        //This. means the class variables
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.colour = colour;

    }

   
    
}
