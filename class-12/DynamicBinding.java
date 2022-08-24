class Dog{
    // Static Binding
    private void callName() {
        System.out.println("Bull dog");
    }
    final void piValue() {
        System.out.println(3.14);
    }
    static void eat() {
        System.out.println("Eating");
    }
}

class Animal{
    //Dynamic Binding
    void eat() {
        System.out.println("Animal eat.");
    }
    static void callName() {
        System.out.println("Bull dog");
    }
    final void piValue() {
        System.out.println(3.14);
    }
}

class DynamicBinding {
    public static void main(String[] args) {
        Dog.eat();
    }
}
