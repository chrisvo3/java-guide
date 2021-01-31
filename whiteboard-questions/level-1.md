# Level 1

This is level 1 white boarding questions with random topics, range from Arrays to Strings and Intergers


## Remove First and Last Character

> FUNDAMENTALS, BASIC LANGUAGE FEATURES, STRINGS

It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

__Best Practice (My Solution)__
```java
public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
```

__Clever__
```java
public class RemoveChars {
    public static String remove(String str) {
       return str.replaceAll("^.|.$", "");
    }
}
```


## Convert a Number to a String

> FUNDAMENTALS, TYPE CASTING, NUMBERS, STRINGS

We need a function that can transform a number into a string.

What ways of achieving this do you know?

Examples:
```java
ConvertNumbString.numberToString(123); // returns "123";   
ConvertNumbString.numberToString(999); // returns "999";
```

__Best Practice__
Top 1:
```java
class ConvertNumbString {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}
```

Top 2 (My Solution):
```java
class ConvertNumbString {
  public static String numberToString(int num) {
  
    return Integer.toString(num);


  }
}
```

__Clever__
```java
class ConvertNumbString {
  public static String numberToString(int num) {
    return ""+num;
  }
}
```


## Jenny's secret message

> BUGS, CONDITIONAL STATEMENTS, CONTROL FLOW, BASIC LANGUAGE FEATURES, FUNDAMENTALS

Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different. She added a special case to her function, but she made a mistake.

Can you help her?

Test Example:
```
if user is "Johhny": "Hello, my love!"
if user is not: "Hello" that person name
```

__My Solution__
```java
public class Greeter {
  public static String greet(String name) {
    
    if(name.equals("Johnny")){
      return "Hello, my love!";
    } //end if
    
   else {    
    return String.format("Hello, %s!", name);
   } //end else
    
  }
}
```

__Best Practices__
```java
public class Greeter {
  public static String greet(String name) {
    if (!name.isEmpty()) {
      if (name.equals("Johnny"))
        return "Hello, my love!";
      else
        return String.format("Hello, %s!", name);
    }
    return "name is null";
  }
}
```

__Clever__
```java
public class Greeter {
  public static String greet(String name) {
    return "Hello, " + (name == "Johnny" ?  "my love" : name) + "!";
  }
}
```


## Opposite number

> FUNDAMENTALS

Very simple, given a number, find its opposite.

Test Examples:
```
1: -1
14: -14
-34: 34
```

__Best Practices (My Solution)__

```java
public class Opposite{
  public static int opposite(int number){
    return number * -1;
  }
}
```

__Clever__
Top 1:
```java
public class Opposite {
    public static int opposite(int number) {
        return -number;
    }
}
```

Top 2:
```java
public class Opposite {
    public static int opposite(int number) {
        return Math.negateExact(number);
    }
}
```


## Even or Odd

> FUNDAMENTALS, MATHEMATICS, ALGORITHMS, NUMBERS

Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

__My Solution__
```java
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        String answer = "";
        
        if (number % 2 == 0) {
          return answer = "Even";
        }
        
        else {
          return answer = "Odd";
        }
    }
}
```

__Best Practices__
```java
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }
}
```

__Clever__
```java
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
```


## Multiply

> BUGS

Write a method that calculate two doubles.

__Best Practices__
```java
public class Multiply {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}
```

__Clever__
```java
public class Multiply {
    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }
}
```