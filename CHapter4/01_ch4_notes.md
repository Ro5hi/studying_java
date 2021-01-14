**Remember: a class describes what an object knows and what an object does**
___________________________________

A class is the bluepint for an object. When you write a class, you're describing how the JVM should make
an object of that type. You already know that every object of that type can have different instance variable values.
But what about the methods?

**Can every object of that type have different method behaviour?**

Every instance of a particular class has the same methods but they can behave different based on the value of the
instance variables.

__________________________________

**A method uses parameters. A caller passes arguments.**
- *Arguments* are the things you pass into the methods ( a value like 2, "Foo", or a reference to Dog).
    
- *Parameter* is nothing more than a local variable with a type and a name that can be used inside the body of a method.

**If a method takes a parameter, you must pass it something, and that something must be a value of the appropriate type.** 

__________________________________

**You can get things back from a method**

Methods can return values. Every method is declared with a return type, but until now we've made all of our
methods with a void return type, which means they don't give anything back.

If you declare a method to return a value, you must return a value of the declared type! Or a alue that is compatible 
with the declared type.

