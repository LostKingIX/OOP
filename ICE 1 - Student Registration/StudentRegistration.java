/*
 * Author: Kuldeep Mohanta
 * Date: January 19th, 2023
 * App Name: ICE 1 - Student Registration 
 * Description: This application prompts user for student information, stores information within variables, and outputs
 * the information in a readable format to the user.
 * 
 */




// Import Libraries
import java.util.Scanner;

public class StudentRegistration {

    // Constants
    static final String SET_TITLE = "\033]0;%s\007";
    static final String CLEAR_TERMINAL = "\033c";

    //RAW String - multiline string
    static final String INPUT_BANNER = """ 
    *******************************
    ~ Welcome to Durham College! ~
                
    *******************************
    """;

    static final String OUTPUT_BANNER = """
    *******************************
    ~ Student Information ~
                
    *******************************
            
            """;

    public static void main(String[] args) {
        
        //Declaring Variables
        String studentFullName = " ";
        String courseName = " ";
        int courseDuration = 0;
        int currentSemester = 0;

        //Initializing Scanner for system input
        Scanner scanner = new Scanner(System.in);

        //Set title
        System.out.printf(SET_TITLE, "Hello User - Kuldeep Mohanta");

        // Print the Banner
        System.out.println(INPUT_BANNER);

        //Input for Application
        //Prompt for Student Name
        System.out.print("Enter your full name: ");
        studentFullName = scanner.nextLine(); // Remember to use next line to pull the full name / line

        //Prompt for Course name
        System.out.print("Enter your Course Name: ");
        courseName = scanner.nextLine();

        //Prompt for Course Duration
        System.out.print("Enter your Course Duration in Semesters: ");
        courseDuration = Integer.parseInt(scanner.nextLine());

        //Prompt for Course Duration
        System.out.print("Enter your current Semester: ");
        currentSemester = Integer.parseInt(scanner.nextLine());

        //Calculations
        int semestersLeft = 0;
        semestersLeft = courseDuration - currentSemester;

        //Output Screen 
        //Clear Screen
        System.out.println(CLEAR_TERMINAL + OUTPUT_BANNER);

        //Print the information
        System.out.printf("Full Name: %s\n", studentFullName);
        System.out.printf("Course Name: %s\n", courseName);

        //Formatted String
        System.out.printf("Course Duration: %d\n", courseDuration);
        System.out.printf("Current Semester: %d\n", currentSemester);
        System.out.printf("Student has %d semesters remaining!\n", semestersLeft);

        //Exit Prompt
        System.out.print("\nPress [Enter] to Exit application: ");
        scanner.nextLine();
        scanner.close();

    }
    
}
