**What's the difference between a class and an object?**

- A class is not an object (but it's used to construct them.) It is the blueprint for an object that tells the JVM how to make an object of that particular type. Each object made from that class can have its own values for the instance variables of that class.

**Things an object knows about itself are called:**

- Instance variables. (another way of saying an object)

**Things an object can do are called:**

- Methods, when you design a class you think about the data an object will need to know about itself, and you also design the methods that operate on that data. 

**The two uses of main**
- to test your real class
- to launch your Java application

As long as you're in main(), you're not really in OOP. It's fine for a test program to run within the main method, but in a true OO application, you need objects talking to each other, as opposed to a static main() method crating and testing objects. A real Java application is nothing but objects talking to other objects, talking means objects callig methods on one another. 

Each time an object is created in Java, it goes into an area called The Heap.

**Garbage-Collectible Heap**

All objects no matter where, when, or how they're created live on the heap. The Java heap is actually called Garbage-Collectible Heap. When you create an object, Java allocates memory space on the heap according to how much that particular object needs. An object with 15 instance variables will probably need more space than an object with only two instance variables. 

What happens when you need to reclaim that space? 
How do you get an object out of the heap when you're done with it? 

- Java manages that memory for you! When the JVM can 'see' that an object can never be used again, that object becomes eligible for garbage collection. And if you're running low on memory, the Garbage Collecctor will run, throw out the unreachable objects, and free up the space, so that the space can be reused. 