class Add {
    int add() {
        return 0;
    }

    int add(int a) {
        return a;
    }

    double add(double a) {
        return a;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    boolean trueOrFalse( boolean a) {
        if( a ) {
            return true;
        }
        return false;
    }
}
class MethodOverLoading {
    public static void main(String[] args) {
        Add a1 = new Add();
        int result = a1.add(1);
        double result1 = a1.add(1.5);
        System.out.println(result);
        System.out.println(result1);
    }
}
