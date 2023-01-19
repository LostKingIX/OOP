import java.text.Format;
import java.util.Scanner;

public class ExampleIO {
    public static void main(String[] args) {
        
        //Initializing Scanner for system input
        Scanner scanner = new Scanner(System.in);

        String firstName, lastName, fullName;

        System.out.print("Enter your Full name: ");
        fullName = scanner.next();

        scanner.nextLine();

        System.out.printf("Hello Mr. %s, nice to meet you!\n", firstName);

        System.out.print("Press [Enter] to exit: ");

        scanner.close();
    }
}