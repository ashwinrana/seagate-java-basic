class Subject {
    public String name;
    private int mark1, mark2;
    private int sum;

    public void setMark1(int a) {
        this.mark1 = a;
    }

    public void setMark2(int a) {
        if( this.getMark1() > a ){
            this.mark2 = a;
        }
    }

    public int getMark1() {
        return this.mark1;
    }

    public int getMark2() {
        return this.mark2;
    }

    public void sum() 
    {
        this.sum = this.getMark1() + this.getMark2();
    }

    public void displayResult() {
        System.out.println(this.name +" has scored " + this.sum);
    }
}

class ReturnType {
    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.setMark1(2);
        sub.setMark2(4);
        sub.name = "Bob";
        sub.displayResult();
    }    
}
