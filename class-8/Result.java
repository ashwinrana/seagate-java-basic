import java.util.Scanner;

// Class defination
class ResultProcessor {
    // Allocating Variable
    private int id;
    private String name;
    private int sub1, sub2, sub3, sub4;

    //Mutator
    public void setId(int id) {
        this.id = id;
    }

    //Accessor
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub1() {
        return this.sub1;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub2() {
        return this.sub2;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public int getSub3() {
        return this.sub3;
    }

    public void setSub4(int sub4) {
        this.sub4 = sub4;
    }

    public int getSub4() {
        return this.sub4;
    }

    public void getUserDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Student Id: ");
        this.setId(input.nextInt());
        System.out.print("Student Name: ");
        this.setName(input.nextLine());
        System.out.print("Subject 1 mark: ");
        this.setSub1(input.nextInt());
        System.out.print("Subject 2 mark: ");
        this.setSub2(input.nextInt());
        System.out.print("Subject 3 mark: ");
        this.setSub3(input.nextInt());
        System.out.print("Subject 4 mark: ");
        this.setSub4(input.nextInt());
    }

    public String getRemark(int mark) {
        if( mark >= 40 && mark <= 100 ) {
            return " Pass";
        }
        return " Fail";
    }

    public String getTotalSubjectRemark(int mark1, int mark2, int mark3, int mark4) {
        if(mark1 >= 40 && mark1 <= 100 && mark2 >= 40 && mark2 <= 100 && mark3 >= 40 && mark3 <= 100 && mark4 >= 40 && mark4 <= 100) {
            return "Pass";
        }
        return "Fail";
    }

    public void showResult() {
        System.out.println("************Result************");
        System.out.println();
        System.out.println(" Student Id and Name: " + this.getId() + " " + this.getName());
        System.out.println("Subject 1: " + this.getSub1() + " REMARK " + this.getRemark(this.getSub1()));
        System.out.println("Subject 2: " + this.getSub2() + " REMARK " + this.getRemark(this.getSub2()));
        System.out.println("Subject 3: " + this.getSub3() + " REMARK " + this.getRemark(this.getSub3()));
        System.out.println("Subject 4: " + this.getSub4() + " REMARK " + this.getRemark(this.getSub4()));
        System.out.println("You have " + this.getTotalSubjectRemark(this.getSub1(), this.getSub2(), this.getSub3(), this.getSub4()));
    }

}

class Result {
    public static void main(String[] args) {
        ResultProcessor student1 = new ResultProcessor();
        student1.getUserDetails();
        student1.showResult();
    }
}
