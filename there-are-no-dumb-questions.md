1. Why does everything have to be in a class?
A.  Java is an object-oriented language. A class is a blueprint for an object and that
    nearly everything in Java is an object.

2. Do I have to put a main in every class I write?
A.  Nope. A Java program might use dozens of classes but you might only have one method
    with a main method-- the one that starts the program running. You might write test 
    classes, though, that have omain methods for testing your other classes.

3. In my other languages I can do a boolean test on an integer. In Java, can I say:
    
    ```int x =1; 
        while (x) { }```

A.  No, a boolean and an integer are not compatible types in Java. Since the result of
    a conditional test must be a boolean, the only variable you can directly test (without
    using a comparision operator) is a boolean. For example, you can say:
    
    ```boolean isHot = true;
        while(isHot) { }```

4.