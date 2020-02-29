# Perscholas 28 February 2020

> Practice interviewd with a staff member from C****s.

## What is the different between `Array` and `ArrayList`?

## What is `IDE`?

## What is the `Injection Dependency` in Spring Boot?


## Is String immutable? If so, why?
Yes, String is immutatble because String objects are cached in String pool. So that once it is created a String object cannot be changed. Since String is immutatble it can safely be shared between many threads, which is considered very important for multithreaded programming.

Read more on [Baeldung](https://www.baeldung.com/java-string-immutable) and [JavaVisited](https://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html)


## Why is StringBuffer called mutable?
The String class is considered as immutatble, so that once it is created a String object cannot be changed. If there is a necessity to make a lot of modifications to String of characters then StringBuffer should be used.


## What is the difference between StringBuffer and StringBuilder class?
Use StringBuilder whenever possible because it is faster than StringBuffer. But, if thread safety is necessary then use StringBuffer object.


## What is synchronization?
Synchronization is the capability to control the access of multiple threads to shared resources.  Synchronized keyword in java provides locking with ensures mutual exclusive access of shared resource and prevent data race.


## What is the `Design Principle`?
Design Patterns are simple and elegant solutions of commonly occurin problems in software design. Design Patterns make it easier to reuse successful designs and architectures of experienced and Professional Designers. There are 3 types of patterns:

* __Creational__ - concerned with creation ob objects

* __Structural__ - concerned with composition of classes or objects

* __Behavioral__ - characterize the ways in which classes and objects interact and distribute responsibility.


## What is the best `REST API` for logging?
The `SLF4J API` specification. There are different, and interchangeable, implementations of `SLF4J`. This makes it a great selection for `logging`, because a team can decide to provide a different implementation without altering the correctness of the application. Logging; the messages and reporting that comes from your application.`JPA` works the same way. There are different “flavors” of `JPA`.

## What is `hash code`?

## What is `Singleton` class?
Singleton class control object creation, limiting the number to one but allowing the flexibility to create more objects if the situation changes.


## What are the advantages of `ArrayList` over `Arrays`?
ArrayList can grow dynamically and provides more powerful insertion and search mechanisms than arrays.


## How do you decide when to use ArrayList and LinkedList?
If you need to frequently add and remove elements from the middle of list and only access the list elements sequentially, then LinkedList should be used. If you need to support randoom access, without inserting or removing elements from any place other than the end, then ArrayList should be used.