**Remember: a class describes what an object knows and what an object does**
___________________________________

A class is the bluepint for an object. When you write a class, you're describing how the JVM should make
an object of that type. You already know that every object of that type can have different instance variable values.
But what about the methods?

**Can every object of that type have different method behaviour?**

Every instance of a particular class has the same methods but they can behave different based on the value of the
instance variables.

___________________________________

**A method uses parameters. A caller passes arguments.**
- *Arguments* are the things you pass into the methods ( a value like 2, "Foo", or a reference to Dog).
    
- *Parameter* is nothing more than a local variable with a type and a name that can be used inside the body of a method.

**If a method takes a parameter, you must pass it something, and that something must be a value of the appropriate type.** 

___________________________________

**You can get things back from a method**

Methods can return values. Every method is declared with a return type, but until now we've made all of our
methods with a void return type, which means they don't give anything back.

If you declare a method to return a value, you must return a value of the declared type! Or a alue that is compatible 
with the declared type.

___________________________________

**You can send more than one thing to a method**

Methods can have multiple parameters. Separate them with commas when you declare them, and separate the arguments with 
commas when you pass them. Most importantly, if a method has parameters: you must pass arguments of th right type and order.

**Calling a two-parameter method, and sending it two arguments**

```
void go() {
  TestStuff t = new TestStuff();
  t.takeTwo(12, 34);
}

// The arguments you pass land in the same order you passed them. First > First, Second > Second

void takeTwo(int x, int y) {
  int z = x + y;
  System.out.println("Total is " + z);
}
```

**You can pass variables into a method as long as the variable type matches the parameter type**

```
void go() {
  int foo = 7;
  int bar = 3;
  t.takeTwo(foo, bar);
}
  /* The values of foo and bar land in the x & y parameters. So now the bits in x are identitical
  to the bits in foo (the bit pattern for the integer '7') and the bits in y are identical to bits in bar. */
  
  void takeTwo(int x, int y) {
    int z = x + y;
    System.out.println("Total is " + z);
  }
  
  /* What's the value of z? It's the same result you'd get if you added foo + bar at the time you passed them
  into the takeTwo method. */
```

