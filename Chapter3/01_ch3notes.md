**There are two types of variables**

*Primitive*
    Primitives are like cups at a coffee house. They come in different sizes and each have a different name.
    You may see those cups displayed in order. In Java, Primitives come in different sizes and those sizes have names.
    When you declare a variable in Java, you must declare it with a specific type. 
    
    The sizes for the six numeric primitives:

    || long   (64 bits) -huge to huge
    ll int    (32 bits) -2147483648 to 2147483647 
    ii short  (16 bits) 32768 to 32767
    ,, byte   (8 bits)  -128 to 127

    Floating points:

    ll float (32 bits) varies
    || double (64 bits) varies

    Ex: float f = 32.5f;
    // Note the 'f'. Gotta have that with a float because Java thinks anything with a floating point is a double, unless you use 'f'.

    "I'd like an int please with the value of 2486, and name the variable height", each primitive variable has a fixed number of bits (cup size).

    The eight primitive types are:
    
    boolean, char, byte, short, int, long, float, double

    A nmemonic for remembering them:

    *Be Careful! Bears Shouldn't Ingest Large Furry Dogs."*

__________________________________________


*Object reference*

    An object reference is just another variable value. With reference variables, the value of the variable is bits representing a way to get to a specific object. It doesn't hold the object itself but it holds something like a pointer, or an address. Except in Java we don't really know what is inside a reference evariable. We do know that it represents one and only one object, and the JVM knows how to use the reference to get to the object. 

    The 3 steps of object declaration, creation, and assignmet:

    1. Declare a reference variable
        - Tells the JVM to allocate space for a reference variable and names that variable. The reference variable is forever of that type. 

    2. Create an object
        - Tells the JVM to allocate space for a new object on the heap.

    3. Link the object and the reference
        - Assigns the new object to the reference variable.



**Reserved List of Keywords**

- Java's keywords and other reserved words (in no useful order). If you use these for names the compiler will be very, very upset.

boolean , byte, char, double, float, int , long, short, public, private, protected, abstract, final, native, static, strictfp, synchronized, transient, volatile, if, else, do, while, switch, case, default, for, break, continue, assert, class, extends, implements, import, instanceof, interface, new, ackage, super, this, catch, finally, try, throw, throws, return, void, const, goto, enum

Reserved words are keywords (and other things) the compiler recognizes. 