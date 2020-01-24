# Object Oriented Programming (OOP) Principles

> SOLID : Singple Responsibility, Open-Closed, Liskov, Interface Segragation


## Single Responsibility Principle (SPR)

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


## Open-Closed Principle
 
> 

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