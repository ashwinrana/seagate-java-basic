class Animal {
    void sleep() {
        System.out.println("Sleep");
    }
    void eat() {
        System.out.println("Eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Braking");
    }

    void run() {
        System.out.println("Run");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}

class HouseAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.sleep();
        cat.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.eat();
        dog.run();
    }
}
