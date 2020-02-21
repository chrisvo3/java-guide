# Per Scholas 06 Feb 2020

> This is the mock questions to practice for a technical interview on 07 Feb 2020

## What is _Java_?
Java is high level object oriented programming language that utilize compile code known as bytecode

JRE : Java Runtime Environment (1.5, 1.8)
JVM: Java Virtual Machine (actualy virtual machine that run when boost up)
JDK: Java Development Kits (Have JRE and JVM)

## What are the _features_ of Java?
- Object Oriented
- Platform independence
- High secure (come in part with virtual machine) because it is strongly type
- Portable
- Class-based

## How does Java _enable_ high performance?
- JIT : Just in time compiler - as soon as you need it, it will run it.
just write one and it compile anywhere

## What is the Java _IDE_'s?
Intergrate Development Environtment to help us build the code faster, provide the visual tool for coding with enable tool for debugging

eg: NetBeans, Eclipse, IntelliJ

## What is `Constructor`?
Constructor is construct the new objects
Use `new` key word
It has same name as the class, but return nothing.

## What is meant by local variable and instance variable?
__local variable :__ inside the method, constructor or code block, destroy when method is completed

__instance variable :__ inside the class, outside any method

## What is a `Class`?
A blueprint for an object that define `data type` and `method`

## What is an `object`?
An instance of a class, represent entity, with identity, state, behavior.

## What are the OOPS _concepts_?
APIE (Abstraction, Polymorphism, Inheritance, Encapsulation)

## What is `Inheritance`?
Is the mechanism in java by which one class is allowed to inherit the features (properties and behaviors) of another class, apply hierchy with one way direction

## What is `Encapsulation`?
Wrapping the data and the code that work on the data or method as single unit with purpose of hiding the data.

## What is `Polymorphism`?
Is the technique that encourage abstraction by allow an entity to assume multiple forms. That is reflect with overloading and overriding.

## What is meant by `Method Overriding`?
allows a subclass to take specific implementation of a method that is already provided by its superclasses

## Whta is meant by `Overloading`?
Is when two or more methods in a class have the same name with different method signatures.

## What is meant by `Interface`?
- blueprint of a class
- it has static constant and abstract method
- allow abstractions and multiple inheritant
- all fields are public static and final
- have no method body

## What is meant by `Abstract` class?
- restricted class that cannot be instantiate an object 
- to access it, has to be inherit it from another class
- can have both abstract and regular methods
- must have abstract keyword and cannot be instantiated

## Difference between `Array` and `ArrayList`.
__Array:__ fixed size, can take primative type and object type 

__ArrayList:__ resizeable, collection class, only object type

## Different between `String`, `StringBuilder`, and `StringBuffer`.

All are none primative

__String:__ immutable, can't be change

__StringBuilder:__ mutable, can be change easily, faster than StringBuffer

__StringBuffer:__ all methods are syncronize provide thread-safe,

## Explain about `public` and `private` access modifier.
**public:** low restrictive, accesible in all class

**private:** most restrictive, accessible only within the class it is defined

## Difference between `default` and `protected` access modifier.
**default:** accessible within same class and package within which its class is defined

**protected:** accessible only by the subclass in other packages or any class within the package of the protected member class`