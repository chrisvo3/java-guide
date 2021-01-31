# Object-Oriented Programming

## Class

> A `class` is a user defined blueprint or prototype from which objects are created.  

A `class` defines the name of an `object`, what type of state the object has in the form of fields, and what kind of behavior object has in the form of methods.

__Example__
```
class Student {}
```


## Object

> It is a basic unit of Object Oriented Programming and represents the real life entities.

When an `object` is instantiated with the `new` keyword, the class file and all of its `superclasses` are loaded into the JVM by the system class loader. Every `object` in a computer program is self-contained. Three things that describe objects are identity, attributes, and behaviors.

__Example__
```
Student chris = new Student();
```


## Constructors 

> They are used for initializing new objects. 

Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.

After the one-time intialization of the `class`, the object is initialized by invoking a special method called `constructor`. 

A `constructor` performs initialization logic after recursively invoking all of the `constructors` of its `superclasses`. `Supperclasses` must be intialized before the subclasses in case of a `child` object relies on functionality from a `parent`.

__Example__

The class in here is `Student` with constructor `Student(name, age)` that is taking `name` and `age`
```
class Student {
	String name;
	int age;

	public Student(name, age) {
		this.name = name;
		this.age = age;
	}
}
```

The object `chris` is a `Student` with `name` is chris and `age` is 20
```
Student chris = Student("chris", 20);
```


## Primitive Types

A primitive type is a fixed-size data type that is predeined and reserved as a keyword. Primitive types serves as the building blocks for the storing state in an object.

There are 8 primitive types: `boolean`, `byte`, `short`, `int`, `long`, `float`. `double` and `char`. 

Primitive types are not `objects`, but every primitive type has a corresponding wrapper `object`.

The compiler can automatically convert primitive tpyes into their wrapper objects in a process called `autoboxing`.

Conversely, the compilier can convert wrapper `objects` into their `primitive` types in a process called `unboxing`.

One common pitfall from `unboxing` occurs when a `null` object reference is unboxed into primitive types, resulting in a `NullPointerException`.

__Example__

Primitive Type are `double`, `int`
Wrapper-Type are `Double`, `Interger`

```
double score = 9.5;
int age = 18;

Double pie = 3.14;
Integer apple = 20;
```


## Variable
> A placeholder in memory for a literal value

A `variable` is a name given to a memory location. It is the basic unit of storage in a program.
- The value stored in a variable can be changed during program execution.
- A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
- In Java, all the variables must be declared before use.

__Example__

In here, `variable` are _age_, _name_, _initial_
```
Integer age;
String name;
char initial;
```

## Literal
> The value to be stored by a variable

Any constant value which can be assigned to the variable is called as literal/constant.

__Example__

In here, `literal` are 18, _nguyen_, _N_
```
Integer age = 18;
String name = "nguyen";
char initial = 'n';
```


## Operator
> Symbol that denotes an operation to be done

Java provides many types of operators which can be used according to the need. They are classified based on the functionality they provide. 


#### instance of operator
Instance of operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass or an interface.
```
object instance of class/subclass/interface
```


## Function
> Series of instructions to be done

In programming, a function is a block of code that performs a specific task.

In object-oriented programming, method is a jargon used for function. Methods are bound to a class and they define the behavior of a class.


## Arrays

An array is an object that can hold a fixed number of values of a single type.

- In Java all arrays are dynamically allocated.
- Since arrays are objects in Java, we can find their length using member length.
- The size of an array must be specified by an int value and not long or short.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces Cloneable and java.io.Serializable.

The capacity of an array is defined when the array is initilized, and its elements can be accessed by a zero-based index.

Arrays are covariant, meaning that an array can be cast into an array of its superclass type.

__Example__

A `String[]` could be cast to an `Object[]`, because the `String` class extends the `Object` class.

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

# Core Java Questions and Answers

## What is the difference between a class and an object?

## What happens when an object is instantiated for the first time?

## What is the difference between a primitive type and an object?

