**How big is a reference variable?**

- You don't know. Unless you're cozy with someone on the JVM's devv team, you don't know how a reference is represented. There are pointers in there somewhere but you can't access them. You won't need to. But when you're talking about memory allocation issues, your Big Concern should be about how many objects (as opposed to object references) you're creating and how big they are (the objects).

**So, does that mean that all object references are the same size, regardless of the size of the actual objects to which they refer?**

- Yep, all references for a given JVM will be the same size regardless of the objects they reference, but each JVM might have a different way of representing references, so references on one JVM may be smaller or larger than references on another JVM.

**Can I do arithmetic on a refernece variable, increment it, you know - C stuff?**

- No, "Java is not C".