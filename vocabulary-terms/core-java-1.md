# Object-Oriented Programming

## Classes & Objects

> Java `objects` are built from a blueprint called a `class`. 


> A `class` defines the name of an `object`, what type of state the object has in the form of fields, and what kind of behavior object has in the form of methods.

When an object is instantiated with the `new` keyword, the class file and a
ll of its `superclasses` are loaded into the JVM by the system class loader. 
After the one-time intialization of the class, the object is initialized by invoking a special method called `constructor`. 

A `constructor` performs initialization logic after recursively invoking all of the `constructors` of its `superclasses`. `Supperclasses` must be intialized before the subclasses in case of a `child` object relies on functionality from a `parent`.


## Primitive Types

A primitive type is a fixed-size data type that is predeined and reserved as a keyword. Primitive types serves as the building blocks for the storing state in an object.

There are 8 primitive types: `boolean`, `byte`, `short`, `int`, `long`, `float`. `double` and `char`. 

Primitive types are not `objects`, but every primitive type has a corresponding wrapper `object`.

The compiler can automatically convert primitive tpyes into their wrapper objects in a process called `autoboxing`.

Conversely, the compilier can convert wrapper `objects` into their `primitive` types in a process called `unboxing`.

One common pitfall from `unboxing` occurs when a `null` object reference is unboxed into primitive types, resulting in a `NullPointerException`.


## Arrays

An array is an object that can hold afixed number of values of a single type.

The capacity of an array is defined when the array is initilized, and its elements can be accessed by a zero-based index.

Arrays are covariant, meaning that an array can be cast into an array of its superclass type.


__Example__

A `String[]` could be cast to an `Object[]`, because the `String` class extends the `Object` class.


## Strings

> String are unique objects taht are used to represent text.

String values can be assigned without the use of the `new` keyword, although the compiler is actually creating `String` objects internally.

Strings can be concatenated via the overloaded `+` operator, which the compiler converts into a chain of method calls on `StringBuilder` object.

A `StringBuilder` (and thread-safe alternative `StringBuffer`) improves performance by modifying a mutable `char[]` buffer before creating an immutable `String` instance.

The immutable property of strings allows the compiler to cache them in a process call _interning_


## Enums

Enums, short for enumerated types, are special classes that represent a set of isngle-instance constants. PRactical appplications include the days of the week, the status levels of a task, or the roles of a security group.

Enums were introduced to replace `String` and `Integer` constants and they are far more powerful because they can contain methods, implement interfaces, and provide type safety.

However, enumbs cannot be subclasses or extend my class besides the implicity extended `Enum` class.