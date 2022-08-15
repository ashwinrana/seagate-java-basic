class NonThisTest {
    int rollno = 1;
    String name;
    float fee;

    NonThisTest( int rollno, String name, float fee) {
        rollno = rollno;
        name = name;
        fee = fee;
    }

    void displayResult(){
        System.out.println(rollno + " " + name + " " + fee + " ");
    }
}

class NonThis {
    public static void main(String[] args) {
        NonThisTest s1 = new NonThisTest(1, "Bob", 15000f);
        s1.displayResult();
    }
}
