//Import Libraries
import java.util.Scanner;

/*
 * Name: Kuldeep Mohanta
 * Date: April 9th, 2023
 * Description: This application is designed to present the days of the week to the user
 * from which the user can choose a day to view if they have classes during the chosen day.
 * App Name: ClassSchedule
 * 
 */

 class ClassSchedule
 {

    //Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String OPTION_MENU = """
    ====================
    = Class Schedule =
    ====================

    This app will print the class schedule of a chosen week day!

    Choose a day (via. choosing a corresponding numeric value 'i.e. 1'):
        1. Sunday
        2. Monday
        3. Tuesday
        4. Wednesday
        5. Thursday
        6. Friday
        7. Saturday
    ->""";

    public static void main(String[] args) 
    {
        //Clear screen
        System.out.print(CLEAR_TERMINAL);


        //User Input
        Scanner scanner = new Scanner (System.in);

        //Variables
        int option = 0; // Allow input to choose a weekday
        boolean numeric; //Making sure that the inputted option is valid
        boolean haveLectures;

        //Array of lectures
        // int [] numbers = {1, 2, 3, 4, 5}; Example
        Lecture [] lectures =
            {
                new Lecture ("OOP1",11, Period.AM,WeekDay.THURSDAY),
                new Lecture ("OOP1",2, Period.PM,WeekDay.FRIDAY),
                new Lecture ("System Development",8, Period.AM,WeekDay.THURSDAY),
                new Lecture ("Business for I.T",5, Period.PM,WeekDay.THURSDAY),
                new Lecture ("Software Testing",3, Period.PM,WeekDay.MONDAY)

            };

        //Setting title
        System.out.printf(SET_TITLE, "Class Schedule - Kuldeep Mohanta");

        //Main CLI Loop
        do
        {
            System.out.println();
            //Display options menu via RAWSTRING
            System.out.print(OPTION_MENU);

            //Get an option and try to convert it to an int
            try
            {
                option = Integer.parseInt(scanner.nextLine());
                numeric = true;
            } catch (Exception exception)
            {
                numeric = false;
            }

            //Validate if the option is numeric and between SUnday and Saturday
        if(!numeric || option < WeekDay.SUNDAY.getOption() || option > WeekDay.SATURDAY.getOption())
            System.out.println("Error - Invalid Weekday!");


        //valid week day
        else
        {
            //Print all lectures on that day
            System.out.println("\nOn this day you have: ");

            //No Lectures yet
            haveLectures = false;

            //Print all lectures on that day
            //Go through all lectures and compare if the day matches the option
            for (Lecture lecture : lectures)
            {
                
                //Is there a lecture on that day?
                if(lecture.getDay().getOption() == option)
                {
                    //If they match, then print them
                    System.out.println(lecture.getName() + " at " + lecture.getTime() + lecture.getPeriod());
                    haveLectures = true; //Lecture does exist
                }

            }

            //In case we went through the array and found no lectures
            if(!haveLectures)
                System.out.println("No classes are found! ");
        }
            //Exit Prompt
            System.out.print("Choose another day (y/n)? ");
        }while(scanner.nextLine().equals("y"));

        //Application Ends
        scanner.close();


    }

    
 }