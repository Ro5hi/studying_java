/* 
    Code Structure in Java
        A source code file holds one class definition. The class represents a piece of your program,
        although a ery tiny application might need just one single class. The class must go within a
        pair of curly braces.

*/
package Chapter1;

public class Dog {
    
/* 
    What goes in a class?
        A class has one or more methods.
        In the Dog class, a bark method will hold instructions for how the Dog should bark.
        Your methods must be declared inside a class (within the curly braces of the class)
*/

    void bark() {
        System.out.println("Bark!");
        System.out.println("Bork!");
        System.out.println("Boof!");
    }

/* 
    What goes in a method?
        Within the curly braces of a method, write your instructions for how that method should be performed.
        Method code is basically a set of statements and for now you can think of a method kind of like
        a function or procedure.

*/
    
}

/* Diagram A
_______________________________________
                                       |
            Source File                |
    _____________________________      |
                                       |
            class File                 |
    _____________________________      |
                                       |
        [ Method 1 Statement ]         |
                                       |
        [ Method 2 Statement ]         |
    _____________________________      |
                                       |
_______________________________________|

*/