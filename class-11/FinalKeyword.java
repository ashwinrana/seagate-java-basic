final class Bike {
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("Not working");
    }
}

class FinalKeyword {
    final int speedLimit;

    FinalKeyword() {
        speedLimit = 100;
    }

    void run() {
        speedLimit = 60;
    }

    public static void main(String[] args) {
        FinalKeyword bike = new FinalKeyword();
        bike.run();
    }
}
