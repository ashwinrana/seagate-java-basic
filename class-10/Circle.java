import java.util.Scanner;

class Operation {
    double square(double n) {
        return n * n;
    }
}

class Circle {
    double pi = 3.14;

    double area(double radius) {
        Operation op = new Operation();
        double rsquare = op.square(radius);
        return pi * rsquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = input.nextDouble();
        double result = c.area(r);
        System.out.println(result);
    }
}

