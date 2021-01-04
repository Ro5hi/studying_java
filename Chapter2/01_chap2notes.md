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