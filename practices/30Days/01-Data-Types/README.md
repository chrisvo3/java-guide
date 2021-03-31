# Day 1: Data Types

## Objective
Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional video!

## Task
Complete the code in the editor below. The variables `i`, `d`, and `s` are already declared and initialized for you. You must:

1. Declare `3` variables: one of type `int`, one of type `double`, and one of type `String`.

2. Read `3` lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your `3` variables.

3. Use the `+` operator to perform the following operations:
    
    * Print the sum of `i` plus your `int` variable on a new line.

    * Print the sum of `d` plus your `double` variable to a scale of one decimal place on a new line.

    * Concatenate `s` with the string you read as input and print the result on a new line.

**Note**: If you are using a language that doesn't support using `+` for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

## Input Format

The first line contains an integer that you must sum with `i`.
The second line contains a double that you must sum with `d`.
The third line contains a string that you must concatenate with `s`.

## Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled to `1` decimal place) on the second line, and then the two concatenated strings on the third line.

*Sample Input*
```
12
4.0
is the best place to learn and practice coding!
```

*Sample Output*
```
16
8.0
HackerRank is the best place to learn and practice coding!
```

## Explanation

When we sum the integers `4` and `12`, we get the integer `16`.
When we sum the floating-point numbers `4.0` and `4.0`, we get `8.0`.
When we concatenate `HackerRank` with `is the best place to learn and practice coding!`, we get `HackerRank is the best place to learn and practice coding!`.

**You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.**

---

# Lesson 01

## Data Types
Data types define and restrict what type values can be stored in a variable, as well as set the rules for what types of operations can be performed on it.

## Primitive Data Types
**Java** has [8 primitive data types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html): `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, and `char`. For most challenges, you'll only need to concern yourselves with ints (e.g.: `1`, `2`, `3`, etc.) and doubles (e.g.: `1.0`, `2.5`, `3.9` etc.). Another important data type we mentioned yesterday is the String class, whose objects are immutable strings of characters.

## Scanner
Yesterday, we discussed Scanner's next, `nextLine`, `hasNext`, and `hasNextLine` methods. Scanner also has `readNext` and `hasNext` methods for different data types, which is very helpful when you know exactly what type of input you'll be reading. The next methods scan for tokens (you can think of this as a word), and the `nextLine` methods reads from the Scanner's current location until the beginning of the next line. For example, `nextInt()` will scan the next token of input as an `int`, and `nextDouble()` will scan the next token of input as a `double`. You should only ever use `1` scanner object for your entire program.

Each line of multi-line input contains an invisible separator indicating that the end of a line of input has been reached. When you use Scanner functions that read tokens (e.g.: `next()`, `nextInt()`, etc.), the Scanner reads and returns the next token. When you read an entire line (i.e.: `readLine()`), it reads from the current position until the beginning of the next line. Because of this, a call to `nextLine()` may return an empty string if there are no characters between the end of the last read and the beginning of the next line. For example, given the following input:

```
a b c
d e
f
g
```

The breakdown below shows how a certain sequence of calls to a Scanner object, , will read the above input:

1. A call to `scan.next();` returns the next token, `a`.

2. A call to `scan.next();` returns the next token, `b`.

3. A call to `scan.nextLine();` returns the next token, `c`. It's important to note that the scanner returns a space and a letter, because it's reading from the end of the last token until the beginning of the next line.

4. A call to `scan.nextLine();` returns the contents of the next line, `d e`.

5. A call to `scan.next();` returns the next token, `f`.

6. A call to `scan.nextLine();` returns everything after `f` until the beginning of the next line; because there are no characters there, it returns an empty String.

7. A call to `scan.nextLine();` returns `g`.

**Note**: You will struggle with this challenge if you did not review this section. You must understand what happens when you switch between reading a token (single word) of input and reading an entire line of input to successfully complete this challenge.

## Additive Operator
The `+` operator is used for mathematical addition and `String` concatenation (i.e.: combining two Strings into one new `String`). If you add the contents of two variables together (e.g.: `a + b`), you can assign their result to another variable using the assignment operator (`=`). You can also pass the result to a function instead of assigning it to a variable; for example, if `a=1` and `b=2`, `System.out.println(a + b);` will print `3` on a new line.


## C++
You may find this information helpful when completing this challenge in C++.

To consume the whitespace or newline between the end of a token and the beginning of the next line:

```c++
// eat whitespace
getline(cin >> ws, s2);
```

where s2 is a string. In addition, you can specify the scale of floating-point output with the following code:

```c++
#include <iostream>
#include <iomanip>

using namespace std;
int main(int argc, char *argv[]) {
    double pi = 3.14159;
	
    // Let's say we wanted to scale this to 2 decimal places:
    cout << fixed << setprecision(2) << pi << endl;
    printf("%.2f", pi);
}
```

which produces this output:

```
3.14
3.14
```

Still unclear? Take some time to review the documentation on these topics:

[ws](http://www.cplusplus.com/reference/istream/ws/)
[setprecision](http://www.cplusplus.com/reference/iomanip/setprecision/)
[fixed](http://www.cplusplus.com/reference/ios/fixed/)
[printf](http://www.cplusplus.com/reference/cstdio/printf/)