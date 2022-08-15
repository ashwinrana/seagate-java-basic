public class Loop {
    public static void main(String[] args) {
        
        System.out.println("Using For loop");
        for(int a = 1; a <=10 ; a++) {
            System.out.println("2 X " + a + " = " + a * 2);
        }

        System.out.println("Using For while loop");

        int b = 1;
        while(b <= 10) {
            System.out.println("2 X " + b + " = " + b * 2);
            b++;
        }

        System.out.println("Using For do while loop");

        int a = 1;
        do {
            System.out.println("2 X " + a + " = " + a * 2);
            a++;
        } while(a <= 10);
        
    }
}
