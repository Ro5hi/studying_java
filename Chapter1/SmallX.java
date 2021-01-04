/* public static void main(String [] args) {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}

Needs to compile and print "Small x"

*/

package Chapter1;

public class SmallX {
    public static void main (String [] args) {
        int x = 5;
        while ( x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Small X");
            }
        }
    }
}


// javac SmallX
// java SmallX
// "Small X"