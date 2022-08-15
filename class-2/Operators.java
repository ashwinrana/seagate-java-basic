public class Operators {
    public static void main(String[] args) {
        int a = 2;
        a = a++;

        int b = 3;

        b = b % 2;

        boolean result;

        result = a <= 2;

        result = (a > 2) ?  true : false;//true  //false;

        a ^= 2; // a = a ^ 2;

    System.out.println(a);

    System.out.println(result);
    }
}