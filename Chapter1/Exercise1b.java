/* 

Exercise1b won't compile

public class Exercise1b {
    public static void main(String [] args) {
        int x = 1;
        while (x < 10 ) {
            if (x > 3) {
                System.out.println("big x");;
            }
        }
    }
}
*/ 

package Chapter1;

public class Exercise1b {
    public static void main(String [] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("3");
            }
            if (x > 2) {
                System.out.println("2");
            }
            if (x > 1) {
                System.out.println("1");
            }
            if (x == 1) {
                System.out.println("x is 1");
            }
            x = x + 9;
            System.out.println("Big x");
        }
    }
}

// javac Exercise1b
// java Exercise1b
// x is 1 
// Big x