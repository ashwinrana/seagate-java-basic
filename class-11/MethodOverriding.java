class Parent {
    int a = 10;

    void showA() {
        System.out.println(a);
    }
}

class FirstChild extends Parent{
    int a = 0;
    void showA() {
        System.out.println(a);
    }
}

class MethodOverriding  extends FirstChild{
    int a = 10;
    void showA() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        MethodOverriding fc = new MethodOverriding();
        fc.showA();
    }
}
