/* 
    In Java, an if test is basically the same as the boolean test in a while loop - except instead of saying,
    "while there's still beer...", you'll say, "if there's still beer...".
*/

class IfTest {
    public static void main (String[] args) {
        int x = 3;
        if (x == 3) {
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
    }
}

// java ifTest
// x must be 3
// This runs no matter what

/* The code above executes the line that prints "x must be 3", only if the condition (x is equal to 3) is true.
    Regardless of whether it's true, though, the line that prints, "This runs no matter what" will run.
*/