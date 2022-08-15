/**
 * 
 * @author - Babin Rana
 * @version - 5
 * 
 * @param - firstName, lastName
 * 
 * @return void
 */
public class Continue {
    public static void main(String[] args) {
        /**
         * print
         * the 
         * odd
         * numbers
         * using
         * reverse
         * logic
         */
        for(var i = 1; i<=10; i++) {
            int a = i%2;
            if(a == 0) {
                continue;
            }
            System.out.println(i); // Print the odd number;
        }
    }
    
}
