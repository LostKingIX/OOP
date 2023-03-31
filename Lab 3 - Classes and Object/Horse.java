//Import Libraries
import java.util.Random;


/*
 * Name: Kuldeep Mohanta
 * Date: March 29, 2023
 * App Name: Horse.java
 * Description: This class file contains the private variables, constructor method (horse), getter methods (i.e. getName()), as well as the 
 * public method run(). All of which are utilized by the HorseRace class to perform actions like getting the name of a Horse, finding the 
 * distance covered by said horse, as well as determining a randomized running speed of the horse.
 */


//Public Horse Class - Contains private variables, constructor method, getter methods, as well as the public method 
//run()
public class Horse {

    //Private Variables
    // which will hold the horse's name, this variable is initialized as an empty variable
    private String name;

    // "distanceCovered" which will hold the total 
    // distance currently covered by the horse, the default value is "0"
    private double distanceCovered;

    //  "random" will initialize a new object of Java's built-in class 'Random'
    private Random random;

    // status of horse finished = true or false
    private boolean finished;
    
    // create a public constructor method (String parameter called "name")
    public Horse(String name) {
        this.name = name;
        
        //Default value assigned to distanceCovered
        this.distanceCovered = 0.0;

        this.random = new Random();
    }
    
    // create a public getter method called "getName" that returns a String
    public String getName() {

        // return the value 
        return this.name;
    }

    // create a public getter method called "getDistanceCovered" that returns a double
    public double getDistanceCovered() {
        
        // return the value 
        return this.distanceCovered; 
    }

    // public method called "run"
    public void run() {

        // generate a random number between 0 and 1 (inclusive) and add 1 to it to get a random speed for the horse
        double speed = random.nextDouble() + 1; 

        // add the random speed to the distance covered by the horse to aid with finding the winner later on
        distanceCovered += speed; 
    }
}