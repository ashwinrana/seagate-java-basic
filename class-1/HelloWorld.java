import java.util.Scanner;

public class HelloWorld {

    public static void main(String args[]) {
        
        // Setup Scanner
        Scanner input = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        System.out.print("Enter last name: ");
        lastName = input.nextLine();

        System.out.println("Your Full name is: " + firstName + " " + lastName);
    }
    
}