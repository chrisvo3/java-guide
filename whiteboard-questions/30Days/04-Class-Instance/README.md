# Day 04 - Class vs Instance

# Objective
In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept, it's only enabled in certain languages. Check out the Tutorial tab for learning materials and an instructional video!

# Task
Write a Person class with an instance variable, `age`, and a constructor that takes an integer, `initialAge`, as a parameter. The constructor must assign `initialAge` to `age` after confirming the argument passed as `initialAge` is not negative; if a negative argument is passed as `initialAge`, the constructor should set `age` to `0` and print `Age is not valid, setting age to 0..` In addition, you must write the following instance methods:

1. `yearPasses()` should increase the  instance variable by `1`.

2. `amIOld()` should perform the following conditional actions:

    * If `age < 13`, print `You are young..`

    * If `age >= 13` and `age < 18`, print `You are a teenager..`

    * Otherwise, print `You are old..`

To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

**Note**: Do not remove or alter the stub code in the editor.

## Input Format

Input is handled for you by the stub code in the editor.

The first line contains an integer, `T` (the number of test cases), and the `T` subsequent lines each contain an integer denoting the `age` of a Person instance.

## Constraints

```
1 <= T <= 4
-5 <= age <= 30
```

## Output Format

Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. If your methods are implemented correctly, each test case will print `2` or `3` lines (depending on whether or not a valid `initialAge` was passed to the constructor).

**Sample Input**

```
4
-1
10
16
18
```

**Sample Output**

```
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
```

## Explanation

*Test Case 0:* `initialAge = -1`
Because `initialAge < 0`, our code must set `age` to `0` and print the "`Age is not valid...`" message followed by the young message. Three years pass and `age = 3`, so we print the young message again.

*Test Case 1:* `initialAge = 10`
Because `initialAge < 13`, our code should print that the person is young. Three years pass and `age = 13`, so we print that the person is now a teenager.

*Test Case 2:* `initialAge = 16`
Because `13 <= initialAge < 18`, our code should print that the person is a teenager. Three years pass and `age = 19`, so we print that the person is old.

*Test Case 3:* `initialAge = 18`
Because `initialAge >= 18`, our code should print that the person is old. Three years pass and the person is still old at `age = 21`, so we print the old message again.

*The extra line at the end of the output is supposed to be there and is trimmed before being compared against the test case's expected output. If you're failing this challenge, check your logic and review your print statements for spelling errors.*

----

# Lesson 04. Class vs Instance

## Class

A blueprint defining the charactaristics and behaviors of an object of that class type. Class names should be written in CamelCase, starting with a capital letter.

```java
class MyClass{
    ...
}
```
Each class has two types of variables: [class variables](https://en.wikipedia.org/wiki/Class_variable) and [instance variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html); class variables point to the same (static) variable across all instances of a class, and instance variables have distinct values that vary from instance to instance.


## Class Constructor

Creates an instance of a class (i.e.: calling the Dog constructor creates an instance of Dog). A class can have one or more constructors that build different versions of the same type of object. A constructor with no parameters is called a [default constructor](https://en.wikipedia.org/wiki/Default_constructor); it creates an object with default initial values specified by the programmer. A constructor that takes one or more parameters (i.e.: values in parentheses) is called a parameterized constructor. Many languages allow you to have multiple constructors, provided that each constructor takes different types of parameters; these are called [overloaded constructors](https://en.wikipedia.org/wiki/Function_overloading).

```java
class Dog{ // class name
    static String unnamed = "I need a name!"; // class variable
    int weight; // instance variable
    String name; // instance variable
    String coatColor; // instance variable
    
    Dog(){ // default constructor
        this.weight = 0;
        this.name = unnamed;
        this.coatColor = "none";
    }
    Dog(int weight, String color){ // parameterized constructor
        // initialize instance variables
        this.weight = weight; // assign parameter's value to instance variable
        this.name = unnamed; 
        this.coatColor = color; 
    }
    Dog(String dogName, String color){ // overloaded parameterized constructor
        // initialize instance variables
        this.weight = 0;
        this.name = dogName; 
        this.coatColor = color; 
    }
}
```

## Method
A sort of named procedure associated with a class that performs a predefined action. In the sample code below, returnType will either be a data type or `void` if no value need be returned. Like a constructor, a method can have `0` or more parameters.

```java
returnType methodName(parameterOne, ..., parameterN){
    ...
    return variableOfReturnType; // no return statement if void
}
```

Most classes will have methods called getters and setters that get (return) or set the values of its instance variables. Standard getter/setter syntax:

```java
class MyClass{
    dataType instanceVariable;
    ...
    void setInstanceVariable(int value){
        this.instanceVariable = value;
    }
    dataType getInstanceVariable(){
        return instanceVariable;
    }
}
```

Structuring code this way is a means of managing how the instance variable is accessed and/or modified.


## Parameter
A parenthetical variable in a function or constructor declaration (e.g.: in int `methodOne(int x)`, the parameter is int `x`).


## Argument
The actual value of a parameter (e.g.: in `methodOne(5)`, the argument passed as variable `x` is `5`).

### Additional Language Resources
[Python Class and Instance Variables](https://docs.python.org/3.5/tutorial/classes.html?highlight=instance#class-and-instance-variables)