// Output has to be 
// a-b c-d


package Chapter1;

public class Shuffle1 {
    public static void main(String [] args) {
        int x = 3;
        while (x > 0) {
            if (x == 2) {
                System.out.print("b c");
            }
            if (x > 2) {
                System.out.print("a");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            x = x - 1;
            System.out.print("-");
        }
    }
}

// javac Shuffle1 

// java Shuffle1
// a-b c-d
