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

    An object reference is just another variable value. With reference variables, the value of the variable is bits representing a way to get to a
     specific object. It doesn't hold the object itself but it holds something like a pointer, or an address. Except in Java we don't really know what
      is inside a reference evariable. We do know that it represents one and only one object, and the JVM knows how to use the reference to get to the
       object.


    The 3 steps of object declaration, creation, and assignmet:

    1. Declare a reference variable
        - Tells the JVM to allocate space for a reference variable and names that variable. The reference variable is forever of that type. 

    2. Create an object
        - Tells the JVM to allocate space for a new object on the heap.

    3. Link the object and the reference
        - Assigns the new object to the reference variable.


__________________________________________

**Reserved List of Keywords**

- Java's keywords and other reserved words (in no useful order). If you use these for names the compiler will be very, very upset.

boolean , byte, char, double, float, int , long, short, public, private, protected, abstract, final, native, static, strictfp, synchronized, transient, volatile, if, else, do, while, switch, case, default, for, break, continue, assert, class, extends, implements, import, instanceof, interface, new, ackage, super, this, catch, finally, try, throw, throws, return, void, const, goto, enum

Reserved words are keywords (and other things) the compiler recognizes. 

__________________________________________

*An array is like a tray of cups*

1. Declare an int array variable. An array variable is a remote control to an array object.

    ``int[] nums;``

2. Create a new int array with a length of 7 and assign it to the previously declared int[] variable nums.

    ``nums = new int[7];``

3. Give each element in the array an int value. Remember, elements are just int variables in an int array.

      nums[0] = 6;
      nums[1] = 19;
      nums[2] = 44;
      nums[3] = 42;
      nums[4] = 10;
      nums[5] = 20;
      nums[6] = 1;

__________________________________________

**Arrays are objects too**

Every element in an array is a variable. Anything you would put in a vvariable of that type can be assigned to an array element of that type. So in an array of type int (int[]), each element can hold an int. In a Dog array, each element can hold a remote control to a Dog. Of course we will have to make the Dog objects. 

*The array is an object, even though it's an array of primitives*

Arrays are always objects, whether they're declared to hold object references or primitives. But you can have an array object that's declaredd to hold primitive values. In other words, the array object cann have elements which are primitives, but the array itself is never a primitive. Regardless of what the array holds the array itself is always an object. 

__________________________________________

*Make an array of Dogs*

1. Declare a Dog array variable

    ``Dog[] pets;``

2. Create a new Dog array with a length of 7, and assign it to the previously declared Dog[] variable pets.

    ``pets = new Dog[7];``

3. Create new Dog objects and assign them to the array elements. Remember, elements in a Dog array are just Dog reference variables. We still need Dogs!

    pets[0] = new Dog();
    pets[1] = new Dog();

*Java cares about type*

Control your Dog (with a reference variable)

        Dog fido = new Dog();
        fido.name = "Fido";

We created a Dog object and used the dot operator on the reference variable Fido to access the name variable. *

        We can use the *fido* reference to get the Dog to bark() or eat() or chaseCat().

        fido.bark();
        fido.chaseCat();

*What happens if the Dog is in a Dog array?*

We know we can access the Dog's instance variables and methods using the dot operator, but on what?
When the Dog is in an array we don't have an actual variable name (like fido). Instead we use array notation and push the remote control button (dot operator) on an object at a particular index (position) in the array:

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Fido";
        myDogs[0].bark();

*Yes we know we're not demonstrating encapsulation here but we're trying to keep it simple.*
