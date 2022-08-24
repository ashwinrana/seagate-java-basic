interface Printable{
    void a();
}
class Animal implements Printable{
    public void a(){
       System.out.println("A"); 
    }
}

class Dogo implements Printable{
    public void a(){}
}

abstract class A{
    abstract void showName();
    int add(int a, int b){
        return a + b;
    }
}

class Calculation extends A{
    void showName() {
        System.out.println("");
    }
}

class InstanceOf extends Animal{
    public static void main(String[] args) {
        InstanceOf io = (InstanceOf)new Animal();
        System.out.println(io instanceof Animal);
        Calculation c = new Calculation();
        c.showName();
    }
}
