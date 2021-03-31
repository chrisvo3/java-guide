# Day 06. Let's Review

## Objective
Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the Tutorial tab for learning materials and an instructional video.

## Task
Given a string, `S`, of length `N` that is indexed from `0` to `N - 1`, print its even-indexed and odd-indexed characters as `2` space-separated strings on a single line (see the Sample below for more detail).

**Note**: `0` is considered to be an even index.

**Example**

```
s = adbecf
```

Print `abc def`

## Input Format

The first line contains an integer, `T` (the number of test cases).
Each line `i` of the `T` subsequent lines contain a string, `S`.

**Constraints**

```
1 <= T <= 10

2 <= length of S <= 100
```

## Output Format

For each String `Sj` (where `0 <= j <= T - 1`), print `Sj`'s even-indexed characters, followed by a space, followed by `Sj`'s odd-indexed characters.

**Sample Input**

````
2
Hacker
Rank
````

**Sample Output**

```
Hce akr
Rn ak
```

## Explanation

Test Case 0: `S = "hacker"`

```
S[0] = "H"
S[1] = "a"
S[2] = "c"
S[3] = "k"
S[4] = "e"
S[5] = "r"
```

The even indices are `0`, `2`, and `4`, and the odd indices are `1`, `3`, and `5`. We then print a single line of `2` space-separated strings; the first string contains the ordered characters from `S`'s even indices (`Hce`), and the second string contains the ordered characters from `S`'s odd indices (`akr`).

Test Case 1: `S = "Rank"`

```
S[0] = "R"
S[1] = "a"
S[2] = "n"
S[3] = "k"
```

The even indices are `0` and `2`, and the odd indices are `1` and `3`. We then print a single line of `2` space-separated strings; the first string contains the ordered characters from `S`'s even indices (`Rn`), and the second string contains the ordered characters from `S`'s odd indices (`ak`).

----

# Lesson 06

## Strings and Characters
As we've mentioned previously, a String is a sequence of characters. In the same way that words inside double quotes signify a String, a single letter inside single quotes signifies a character. Each character has an ASCII value associated with it, which is essentially a numeric identifier. The code below creates a char variable with the value , and then prints its ASCII value.

```java
char myChar = 'c'; // create char c
System.out.println("The ASCII value of " + myChar + " is: " + (int) myChar);
```

**Output:**

```
The ASCII value of c is: 99
```

Observe the (int) before the variable name in the code above. This is called explicit casting, which is a method of representing one thing as another. Putting a data type inside parentheses right before a variable is essentially saying: "The next thing after this should be represented as this data type". [Casting](http://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1) only works for certain types of relationships, such as between [primitives or objects that inherit from another class](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html).


To break a String down into its component characters, you can use the [`String.toCharArray`](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#toCharArray()) method. For example, this code:

```java
String myString = "This is String example.";
char[] myCharArray = myString.toCharArray();
for(int i = 0; i < myString.length(); i++){
    // Print each sequential character on the same line
    System.out.print(myCharArray[i]); 
}
// Print a newline
System.out.println(); 
```

produces this output:

```
This is String example.
```

Notice that we were able to simulate printing myString by instead printing each individual character in the character array, myCharArray, created from myString.