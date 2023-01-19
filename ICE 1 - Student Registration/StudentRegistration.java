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
    static final String SET_TITLE = "\033]0;%s\007  \t";
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
        String studentFirstName;
        String studentLastName;
        String studentFullName;

        //Initializing Scanner for system input
        Scanner scanner = new Scanner(System.in);

        //Variables Declaration
        String studentName;
        String courseName;
        int courseDuration;
        int currentSemester;
        int semestersLeft;


        //Set title
        System.out.printf(SET_TITLE, "Student Information - Kuldeep Mohanta");

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
        semestersLeft = courseDuration - currentSemester;

        //Output Screen 
        //Clear Screen
        System.out.print(CLEAR_TERMINAL + OUTPUT_BANNER);

        //Print the information
        System.out.println("Full Name: " + studentFullName);
        System.out.println("Course Name: " + courseName);

        //Formatted String
        System.out.printf("Course Duration: %d", courseDuration);
        System.out.printf("Current Semester: %d", currentSemester);
        System.out.printf("Student has %d semesters remaining!", semestersLeft);

        //Exit Prompt
        System.out.print("\nPress [Enter] to Exit application: ");
        scanner.nextLine();
        scanner.close();








        //Close Scanner
        scanner.close();
    }
    
}
