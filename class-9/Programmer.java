class Office {
    String name = "Random";

    void showName() {
        System.out.println(name);
    }
}

class Employee  extends Office{
 float salary = 15000;
}

class Intern extends Employee {
    float paisa = 10000;
}


class Programmer extends Intern {
    float bonus = 10000;
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        System.out.println(p1.salary);
        p1.showName();
        // System.out.println(p1.name);
        System.out.println(p1.paisa);
        System.out.println(p1.bonus);
    }
}
