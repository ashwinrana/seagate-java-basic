interface HumanInterface {
    void breath();
}

interface BoyInterface {
    void growBeard();
}

interface GirlInterface {
    void goToParlor();
}


class Boy implements HumanInterface, BoyInterface {
    public void breath(){
        System.out.println("Breathing by boy");
    }

    public void growBeard() {
        System.out.println("Okay");
    }
}

class Girl implements HumanInterface, GirlInterface {
    public void breath() {
        System.out.println("Breathing by girl");
    }

    public void goToParlor() {
        System.out.println("Okay going");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl();
        boy.breath();
        boy.growBeard();
        System.out.println("  ");
        girl.breath();
        girl.goToParlor();
    }   
}
