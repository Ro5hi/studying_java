package Chapter1;

class IfTest2 {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is NOT 3");
        }
        System.out.println("This ruuns no matter what");
    }
}

// java IfTest2
// x is NOT 3
// This runs no matter what

/* 
    We can add an else to the condition so that we can say something like, "If there's still beer,
    keep coding, else (otherwise) get more beer, and then continue on..." .
*/