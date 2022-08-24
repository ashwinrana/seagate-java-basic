class A {
    A get(){
        return this;
    }

    void print() {
        System.out.println("Inside Class A");
    }
}

class B extends A {
    @Override
    A get() {
        return this;
    }

    void print() {
        System.out.println("Inside Class B");
    }
}
class Covariant extends B{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.print();
        b.print();
    }
}
