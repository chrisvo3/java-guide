# Object Oriented Programming (OOP) Principles

> SOLID : Singple Responsibility, Open-Closed, Liskov, Interface Segragation


## Single Responsibility Principle (SPR)

> A class, module or function should only have one sole responsibility


It is important to keep every software entitiy (module, class, or function) focused on a single concern or functionality.


__Example:__

Each function should only have one goal: 

* one function find item in array

* one function can only do comparasion

* one function can only print


In this example, class `Student` has many functions that have their own to do. Each `Student` has its own `name` and `age`.
You can do many thing with `Student` beside `get` and `set` their `name` and `age`.

```
public class Student {
	private String name;
	private Integer age;

	public String getName() { return this.name; }
	public void setName(String newName) { this.name = newName; }

	public Integer getAge() { return this.age; }
	public void setAge(Integer newAge) { this.age = newAge; }
}
```

Each method has its own goal, that doesn't affect other methods within the class. But this is only `Student` class to get student's information.
In order to do more with `Student`, we can create other classes such as `Login` or `ExportLog`


## Open-Closed Principle (OCP)
 
> You can expand a module, but you cannot modify within the module (open for extension by closed for modification)

Software entities (modules, classes, functions) should be open for extension, but closed for modificaiton.
One should be able to add new functionality without changing the existing code.
Which means if a new functionality is required in a stable system then your tried and tested code should not be touched and new functionality should be provided by adding new classes only.

__Eample__

I have class A, but I want to have modification of class A, I will create another class, class B that is exstended from class A.

In this example, we have a class vehicle that can only drive but not brake. But what if you have a `Bike`, you would need to have a brake to add in.

```
class vehicle {
	public drive() {}
}

class bike extends vehicle {
	public brake() {}
}
```


## Liskov's Substitution (LSP)

> In a program, each object of the Child class can be replace Parent class without changing its class of the program.
> If a method accepts object of Parent class then it sould work as expected if you pass an object of the Child class 

Functions that use pointeres or references to base classes must be able to use object of derived classes without knowing it. Way of ensuring that inheritance is used correctly. Liskov substitution principle asserts that every subtype should be able to work as the proxy for parent type. Any class which cannot stand in place of its parent violate LSP.


__Example__

In this example, we will describe bird that can fly: eagle, duck can fly, but not penguin.

Because `Penguin` is also a `Bird` so we cannot leave them out. 
However, because it cannot fly, we will call its fly ability as `NoFlyException`

```
public class Bird {
	public void fly() { System.out.println('Flies'); }
}

public class Eagle extends Bird {
	@Override
	public void fly() { System.out.println('Eagle flies'); }
}

public class Duck extends Bird {
	@Override
	public void fly() { System.out.println('Eagle flies'); }
}

public class Penguin extends Bird {
	@Override
	public void fly() { throw new NoFlyException(); }
}
```

`Bird` : superclass

`Penguin` : subclass object

When running the program, class `Penguin` will runs `Error` because it cannot replace its Parent class `Bird`.
So it violated LSP.


## Interface Segregation Principle (ISP)

> Instead of using 1 big interface, we should seperate it into small interface with each goal and purpose

No client should be forced to depend on methods that aren't used. Large interfaces should be split into smaller and more specific ones so that clients will only have to know about the methods that are interests to them.

__Example__

We have `Animal` interface that can `eat`, `drink`, and `sleep`.

When we want to add few more animals with ability to `swim`, `fly`, and `hunt`. Our interface would be expand bigger.
Therefore, it wouldn't be a good idea. Instead, we will have `AnotherAnimal` that will `implement` the interface. 

```
interface Animal {
	void eat();
	void drink();
	void sleep();
}

interface Bird {
	void fly();
}

class Eagle implements Animal, {
	public void eat() {}
	public void drink () {}
	public void sleep() {}
	public void fly() {}
}
```


## Dependency Inversion Principle (DIP)

> 1. High level modules shouldn't depend on lower level modules. Both modules should depend on abstraction.
> 2. Interface (abstraction) should not depend on details, but the opposite. Classes should interact with one another through interface, not through implementation.

High level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, which provide utility features. To achieve this, introduce abstraction that decouples the high level and low level modules from each other.

__Example__

This is an example from __toidicodedao__ The code below is designed to use DIP:


Interface

```
public interface Datbase { void save(int orderId); }
public interface Logger { void logInfo(String info); }
public interface EmailSender { void sendEmail(int userId); }
```


Modules implement Interfaces


```
public class Logger implement Logger {
	public void logInfo(String info) {}
}

public class Database inplement Database {
	public void save(int orderId) {}
}

public class EmailSender implement EmailSender {
	public void sendEmail(int userId) {}
}
```


Check out:

```
public class Cart {
	public void checkOut(Integer orderId, Integer userId) {

		// Database, Logger, EmailSender is lower module
		Database db = new Database();
		db.save(orderId);

		Logger log = new Logger();
		log.logInfo("Order ha sbeen check out");

		EmailSender es = new EmailSender();
		es.sendEmail(userId);
	}
}
```

# Object Oriented Programming Principle
## Questions & Answer


### Questions

__1.__ What is OOPS?

__2.__ What is the 5 objects oriented design principle from SOLID?

__3.__ Is Java a pure object oriented language? if not why?



### Answers

__1.__ OOPS is abbreviated as Object Oriented Programming system in which programs are considered as a collection of objects. Each object is nothing but an instance of a class.

__2.__ SOLID is the term given by Uncle Bob in his classic book, the Clean Code, one of the must-read books for programmers. In SOLID each character stands for one design principle:
> S for Single Responsibility Principle
> O for Open closed design principle
> L for Liskov substitution principle
> I for Interface segregation principle
> D for Dependency inversion principle

__3.__ Java is not a pure object-oriented programming language e.g. there are many things you can do without objects e.g. static methods. Also, primitive variables are not objects in Java. See the answer for a more detailed explanation.
