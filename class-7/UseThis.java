class UseThisTest {
    int rollno = 1;
    String name;
    float fee;

    UseThisTest( int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void displayResult(){
        System.out.println(rollno + " " + name + " " + fee + " ");
    }
}

class UseThis {
    public static void main(String[] args) {
        UseThisTest s1 = new UseThisTest(1, "Bob", 15000f);
        s1.displayResult();
    }
}
