**What if I need global variables and methods? How do I do that if everthing has to go in a class?**

- There isn't a concept of 'global' variables and methods in a Java OO Program. In practical use, however, ther are times when you want a method (or a constant) to be available to any code running in any part of your program. Think of the random() method in the Phrase-O-Matic app; it's a method that should be callable from anywhere. Or what about a constant like pi? You'll learn in chapter 10 that marking a method as public and static makes it behave much like a 'global'. Any code in any class of your application, can access a public static method. And if you mark a vas a public, static, and final -- you have essentially made a globally-available constant.

**Then how is this object-oriented if you can still make global functions and global data?**

- First of all, everything in Java goes in a class. So the constant for pi and the method for random() , although both public and static are defined within the Math class. And you must keep in mind that theese static (global-like) things are the exception rather than the rule in Jaav. They represent a very special case, where you don't have multiple instances/objects.

**What is a Java program? What do you actually deliver?**

- A java program is a pile of classes (or at least one class). In a Java application, one of the classes must have a main method, used to start up the program. So as a programmer, ou write one or more classes and those classes are what you deliver. If the end-user doesn't have a JVM, then you'll also need to include that with your application's classes, so that they can run your program. There are a number of installer programs that let you bundle your classes with a variety or JVM's. Then the end-ser can install the correct version of JVM (assuming that they don't have it in their machine).

**What if I have a hundred classes? Or a thousand? Isn't that a big pain to deliver all those individual files? Can I bundle them into one Application thing?**

- Yes, it would be a big pain to deliver a huge bunch of individual files to your end-users but you won't have to. You can put all of your application files into a Java archive -- a .jar file -- that's based on the pkzip format. In the .jar file, you can include a simple text file formatted as something called a manifest, that defines which class in that jar holds the main() method that should run.

**Bullet Points**

- OOP lets you extend a program without having to touch previously tested, working code.
- All java code is defined in a class.
- A class describes how to make an object of that class type. A class is like a blueprit.
- An object can take care of itself; you don't have to know or care how the object does it.
- An object knows things and does things.
- Things an object does are called methods. They represent object behaviour.
- When you create a class, you may also want to create a separate test class which youll use to create objects of your new class type.
- A class can inherit instance variables and methods from a more abstract super class. 
- At run-time, a Java program is nothing more htan objects 'talking' to other objects.