import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Enter A2: ");
        a = input.nextInt();

        System.out.print("Enter B2: ");
        b = input.nextInt();

        if(a == 2 ) {
            System.out.println("Typed 2");  
        } else if(a == 3) {
            System.out.println("Typed 3");
        } else {
            System.out.println("Kna na halya 2 or 3");
        }

        switch(b) {
            case 2:
                System.out.println("Typed 2");
                System.out.print("Hello");
            break;

            case 3:
                System.out.println("Typed 3");
            break;

            default:
                System.out.println("Typed " + a);
        }
    }
}
