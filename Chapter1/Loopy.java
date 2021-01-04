public class Loopy  {
    public static void main (String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while ( x < 4 ) { 
            System.out.println("In the loop");
            System.out.println("Value os x is " + x );
                x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}

// java Loopy
// Before the loop
// In the loop 
// Value of x is 1
// Value of x = 2
// In the loop
// Value of x is 3
// This is after the loop