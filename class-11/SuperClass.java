class Animal {
    String color = "White";
}

class DaddyDog extends Animal {
    String color = "Black";

    DaddyDog() {
        System.out.println("Who's your daddy");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class ChildDog extends DaddyDog {
    String color = "Brown";

    ChildDog() {
        super();
        System.out.println("Child Dog");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
        super.bark();
    }
}

public class SuperClass {
    public static void main(String[] args) {
        ChildDog cd = new ChildDog();
        cd.printColor();
    }
}
