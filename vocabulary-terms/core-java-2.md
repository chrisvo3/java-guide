# Core Java 2

## Methods

> Methods contain the logic that provide an objcet with behavior.

A method is a collection of statements that perform some specific task and return the result to the caller.

```
public int max (imt x, int y) {
    if (x > y) 
        return x;
    else
        return y;
}
```

__modifier__ : public
__return type__ : int
__method name__ : max
__parameter list__ : int x, int y
the rest inside the method is the __body of the method__

## Access Modifier

> Defines access type of the method i.e. from where it can be accessed in your application

Access modifiers determine the visibility of classes, fields, and methods, so that information can be hidden in order to reduce complexity.

- __public:__ accessible in all class in your application.
- __private:__ accessible only within the class in which it is defined.
- __default__ (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
- __protected:__ accessible within the class in which it is defined and in its subclass(es) and package


## The '_final_' Keyword

> The _final_ keyword determines whether an object reference can be changed after being assigned.

_final_ is a non-access modifier applicable only to a variable, a method or a class

- `final variable` : to crate constant variables
- `final methods` : to prevent method overriding
- `final classes` : to prevent inheritance


## The '_static_' Keyword

> The `static` is a non-access modifier in Java which is applicable for the following: blocks, variables, methods, nested, classes

To create a `static` member(block,variable,method,nested class), precede its declaration with the keyword `static`. When a member is declared `static`, it can be accessed before any objects of its class are created, and without reference to any object.

```
static int a = 10;
static String str = "Hello";
public static void main(String[] args) {}
public static int getAge(int index) {}
```


## Strings

> String are unique objects taht are used to represent text.

Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created.

String values can be assigned without the use of the `new` keyword, although the compiler is actually creating `String` objects internally.

Strings can be concatenated via the overloaded `+` operator, which the compiler converts into a chain of method calls on `StringBuilder` object.

A `StringBuilder` (and thread-safe alternative `StringBuffer`) improves performance by modifying a mutable `char[]` buffer before creating an immutable `String` instance.

The immutable property of strings allows the compiler to cache them in a process call _interning_


## Enums

> Enums, short for enumerated types, are special classes that represent a set of single-instance constants. 

Enumerations serve the purpose of representing a group of named constants in a programming language.

Practical appplications include the days of the week, the status levels of a task, or the roles of a security group.

Enums were introduced to replace `String` and `Integer` constants and they are far more powerful because they can contain methods, implement interfaces, and provide type safety.

However, enumbs cannot be subclasses or extend my class besides the implicity extended `Enum` class.

```
public class Test 
{ 
    enum Color 
    { 
        RED, GREEN, BLUE; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}
```

Read more on [GeeksforGeeks](https://www.geeksforgeeks.org/enum-in-java/)



## Packages

is folderst with unique namespace that classes and other resources are organized into.

Packages are commonly organied by two competing methologies: `package-by-layer` and `package-by-feature`

__package-by-layer__ : strategy groups classes together according to their layer in application. It works for small applications, but it doesn't scale well due to the arge number of tightly couples classes that span a relatively small number.

_example_ : package structure include `model`, `controller`, `service`, `dao`, `utility` packages.

__package-by-feature__ : strategy groups classes together according to their cohesiveness in an application. It encourages high modularity and loose coupling and is preferable to `package-by-layer`

_example_ : package structure might include a `customer`, `order`, `product`, `review`, and `report` package.