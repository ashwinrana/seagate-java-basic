public class Seagate {
    int roll;
    String name;
    static String currentInst;


    static void changeInst() {
        currentInst = "Seagate";
    }

    Seagate(int r, String n, String pI) {
        roll = r;
        name = n;
        currentInst = pI;
        System.out.println("Constructor");
    }
    
    static {
        System.out.println("Static block called.");
    }

    void displayStudent(){
        System.out.println("Name: " + name + " Roll: " + roll + " Current Institute: " + currentInst);
    }

    public static void main(String[] args) {
        Seagate s1 = new Seagate(1, "Bob", "MIT");
        s1.changeInst();
        s1.displayStudent();
    }
}
