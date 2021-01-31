# Oject Oriented Programming Four Pillars

> APIE : Abstraction, Polymorphism, Inheritance, and Encapsulation


## Abstraction

> Abstraction is the act of perceiving an entity from a narrow perspective. The goal of aabstraction is to reduce complexity in a software system

Is selecting data from a larger pool to show only the relevant details to the object. It helps to reduce programming complexity and effort. In Java, abstraction is accomplished using Abstract classes and interfaces.


__Example:__

In a context of education, person can be reduced to a student, an instructor.
In a context of employment, person can be reduced to an employee, owner.
Each abstraction reduces the attributes of a person to a subset of relevant information.

```
class Person {}
class Student implements 
```


## Polymorphism

> Refers to a programming language's ability to process objects differently depending on their data type or class. More specifically, it is the ability to redefine methods for derived classes.

Polymorphism is a technique that encourages abstraction by allowing an entity to assume multiple forms. 
Each application exposes a relevant interface to the user. 
In Java, an object can take on the form of any parent in its hierarchy or any interface in its hierarchy.

__Example__

In this example, we have an interface `Vegetarian` which is only eat grass. Then we have class `Animal` with ability to `eat` and `drink` and `sleep`. The class `Deer` that is extends from `Animal` implements `Vegetarian` is polymorphism


```
public interface Vegetarian {}
public class Animal {}
public class Deer extends Animal implement Vegetarian {}
``` 




## Inheritance 

> Is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.

Inheritance is a technique that prevents code duplication by inheriting functionality from parent objects. 


__Important terminology:__

* Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
* Sub Class: The class that inherits the other class is known as sub class(or aderived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.


__Example__

A `Party` class could extend an `Arraylist` to provide functionality for a guest list. This would allow `Party` obejct to be used in enhanced for loops or methods that accept a `List`. Multiple inheritance is not allowed in order to prevent the ambiguity that arise when multiple parents implement the same feature independently. This ambiguity is called `The Diamond Problem` due to the shape of the resulting object hierarchy.



## Encapsulation

> Encapsulation is a technique that encourages abstraction by purposefully hiding information. Java encourages encapsulation through the use of interfaces and by providing access modifiers that limit the visibilkity of classes, fields, and methods.

When the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared. Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.


__Example__

The mechanical details of a car engine are encapsulated behind a steering wheel and floor pedals. Anyone familiar with this interface could drive a car without knowing what type of engine was under the hood.

# Object Oriented Programming 4 Pillars
## Questions and Answers

### Questions

__1.__ What is the purpose of abstraction in software development?

__2.__ What is encapsulation? how does Java support it?

__3.__ What is polymorphism? How does Java support it?

__4.__ What is the difference between abstraction and polymorphism in Java?

__5.__ Can an interface extend more than one interface in Java?

__6.__ What is Abstraction?

__7.__ What is Encapsulation?

__8.__ What is the difference between Abstraction and Encapsulation?

__9.__ What is Polymorphism?

__10.__ What is Inheritance?


### Answers


__4.__ Abstraction generalizes the concept and Polymorphism allow you to use different implementation without changing your code.

__5.__ Yes, an interface can extend more than one interface in Java, it's perfectly valid.

__6.__  Abstraction is an OOPS concept to construct the structure of the real world objects. During this construction only the general states and behaviors are taken and more specific states and behaviors are left aside for the implementers.

__7.__ Encapsulation is an OOPS concept to create and define the permissions and restrictions of an object and its member variables and methods. A very simple example to explain the concept is to make the member variables of a class private and providing public getter and setter methods. Java provides four types of access level modifiers: public, protected, no modifier and private.

__8.__ “Program to interfaces, not implementations” is the principle for Abstraction and “Encapsulate what varies” is the OO principle for Encapsulation.
Abstraction provides a general structure of a class and leaves the details for the implementers. Encapsulation is to create and define the permissions and restrictions of an object and its member variables and methods.
Abstraction is implemented in Java using interface and abstract class while Encapsulation is implemented using four types of access level modifiers: public, protected, no modifier and private.

__9.__  Polymorphism is the occurrence of something in various forms. Java supports various forms of polymorphism like polymorphic reference variables, polymorphic method, polymorphic return types and polymorphic argument types.

__10.__ A subclass can inherit the states and behaviors of it’s super class is known as inheritance.