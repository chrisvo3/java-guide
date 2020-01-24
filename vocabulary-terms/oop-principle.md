# Object Oriented Programming (OOP) Principles

> SOLID : Singple Responsibility, Open-Closed, Liskov, Interface Segragation


## Single Responsibility Principle (SPR)

It is important to keep every software entitiy (module, class, or function) focused on a single concern or functionality.


__Situation:__

Each function should only have one goal: 

* one function find item in array

* one function can only do comparasion

* one function can only print


__Example:__

```


```


## Open-Closed Principle
 
Software entities (modules, classes, functions) should be open for extension, but closed for modificaiton.
One should be able to add new functionality without changing the existing code.
Which means if a new functionality is required in a stable system then your tried and tested code should not be touched and new functionality should be provided by adding new classes only.


__Situtation__

I have class A, but I want to have modification of class A, I will create another class, class B that is exstended from class A.


__Eample__
```
class vehicle {
	public eat() {}
}

class bike extends vehicle {
	public brake() {}
}
```


## Liskov's Substitution (LSP)

Functions that use pointeres or references to base classes must be able to use object of derived classes without knowing it.


__Situation__

In a program, each object of the Child class can be replace Parent class without changing its class of the program.

If a method accepts object of Parent class then it sould work as expected if you pass an object of the Child class 


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

