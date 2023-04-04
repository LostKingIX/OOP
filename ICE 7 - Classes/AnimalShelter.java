import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: March
 * App Name:
 * Description:
 */

public class AnimalShelter
{
    //Constants
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c";
    static final String BANNER = """
            
            """;

    //User input
    static Scanner scanner = new Scanner(System.in);

    /*
     * Prompts for user input 
     * @param text Print this text
     * @return a line of user input
     * 
     */

    static String input(String text)
    {
        System.out.print(text);
        return scanner.nextLine();
    }

    /*
     * Register a new animal into our shelter
     * Ask for all the animal's information
     * @return a new animal object
     * 
     */

     /*
     * Register a new animal into our shelter
     * Ask for all animal's information
     */

    static Animal registerAnimal()
    {
        //Ask for all the animal's information
        String name = input("Enter the animal's name:");
        String species = input("Enter " + name + " species: ");
        String breed = input("Enter "  + name + " breed: ");
        String colour = input("Enter "  + name + " colour: ");
    

        //Create a new Animal object
        // Done by calling the constructor Animal () and passing data
        Animal animal = new Animal(name, species, breed, colour);

        // return the new animal object
        return animal;

    }

    //Print this animal's information
    static void printAnimalData(Animal animal)
    {
        System.out.println("Name:  " + animal.name);
        System.out.println("Species:  " + animal.species);
        System.out.println("Breed:  " + animal.breed);
        System.out.println("Colour:  " + animal.colour);
        System.out.println("============================");
    }


    public static void main(String[] args) 
    {
        // Set Title
        System.out.printf(SET_TITLE, "Animal Shelter - Kuldeep Mohanta");
        


        //Input screen ~~~~~~~

        // Register 3 animals
        // Create 3 animal objects
        Animal animal1 = registerAnimal();

        //Display succesful registeration
        input("Registered " + animal1.name + " in the database!\nPress [enter] to continue: ");
        
        //Display succesful registeration
        Animal animal2 = registerAnimal();
        input("Registered " + animal2.name + " in the database!\nPress [enter] to continue: ");

        //Display succesful registeration
        Animal animal3 = registerAnimal();
        input("Registered " + animal3.name + " in the database!\nPress [enter] to continue: ");

        //Output screen ~~~~~~~

        // Clear Terminal and Print the banner
        System.out.print(CLEAR_TERMINAL + BANNER);
        
        //Printing animal information
        printAnimalData(animal1);
        printAnimalData(animal2);
        printAnimalData(animal3);

        
        //Exit Prompt
        input("Press [Enter] to exit: ");



    }
        }