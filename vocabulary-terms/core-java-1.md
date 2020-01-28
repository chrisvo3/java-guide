# Object-Oriented Programming

## Class

> A `class` is a user defined blueprint or prototype from which objects are created.  
> A `class` defines the name of an `object`, what type of state the object has in the form of fields, and what kind of behavior object has in the form of methods.

__Example__
```
class Student {}
```


## Object

> It is a basic unit of Object Oriented Programming and represents the real life entities.

When an `object` is instantiated with the `new` keyword, the class file and all of its `superclasses` are loaded into the JVM by the system class loader. 

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

#### Arithmetic Operators
They are used to perform simple arithmetic operations on primitive data types.
```
a + b = 30
a - b = 10
x + y = ThankYou
a * b = 200
a / b = 2
a % b = 0
```

#### Unary Operators
Unary operators need only one operand. They are used to increment, decrement or negate a value.
```
++a
b++
--d
e--
!condition
```

#### Assignment Operator
`=` Assignment operator is used to assign a value to any variable. It has a right to left associativity, i.e value given on right hand side of operator is assigned to the variable on the left and therefore right hand side value must be declared before using it or should be a constant.
```
variable = literal;
```

In many cases assignment operator can be combined with other operators to build a shorter version of statement called Compound Statement.
```
a += 2
b -= 1
c *= 2
d /= 1
e %= 2
```

#### Relational Operator
These operators are used to check for relations like equality, greater than, less than. They return boolean result after the comparison and are extensively used in looping statements as well as conditional if else statements.
```
a == b
a < b
a <= b
a > b
a >= b
a != b
x == y
condition == true
```

#### Logical Operator
These operators are used to perform “logical AND” and “logical OR” operation, i.e. the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e. it has a short-circuiting effect. Used extensively to test for several conditions for making a decision.
```
&& is logical AND
|| is logical OR
```

#### Ternary Operator
Ternary operator is a shorthand version of if-else statement. It has three operands and hence the name ternary.
```
condition ? if true : if false
```

#### Bitwise Operators
These operators are used to perform manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of Binary indexed tree.
```
&, Bitwise AND operator: returns bit by bit AND of input values.
|, Bitwise OR operator: returns bit by bit OR of input values.
^, Bitwise XOR operator: returns bit by bit XOR of input values.
~, Bitwise Complement Operator: This is a unary operator which returns the one’s compliment representation of the input value, i.e. with all bits inversed.
```

#### Shift Operators
These operators are used to shift the bits of a number left or right thereby multiplying or dividing the number by two respectively. They can be used when we have to multiply or divide a number by two.
```
number shift_op number_of_places_to_shift;
<< or >>
```


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