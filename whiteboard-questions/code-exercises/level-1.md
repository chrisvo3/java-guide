# Level 1

This is level 1 short exercise questions with random topics, range from Arrays to Strings and Intergers


## Remove First and Last Character

> FUNDAMENTALS, BASIC LANGUAGE FEATURES, STRINGS

It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

#### Solution

__Best Practice (My Solution)__
```java
public static String remove(String str) {
	return str.substring(1, str.length() - 1);
}
```

__Clever__
```java
public static String remove(String str) {
	 return str.replaceAll("^.|.$", "");
}
```

---

## Convert a Number to a String

> FUNDAMENTALS, TYPE CASTING, NUMBERS, STRINGS

We need a function that can transform a number into a string.

What ways of achieving this do you know?

Examples:
```java
ConvertNumbString.numberToString(123); // returns "123";   
ConvertNumbString.numberToString(999); // returns "999";
```

#### Solution

__Best Practice__
Top 1:
```java
public static String numberToString(int num) {
	return String.valueOf(num);
}
```

Top 2 (My Solution):
```java
public static String numberToString(int num) {
	return Integer.toString(num);
}
```

__Clever__
```java
public static String numberToString(int num) {
	return ""+num;
}
```

---

## Jenny's secret message

> BUGS, CONDITIONAL STATEMENTS, CONTROL FLOW, BASIC LANGUAGE FEATURES, FUNDAMENTALS

Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different. She added a special case to her function, but she made a mistake.

Can you help her?

Test Example:
```
if user is "Johhny": "Hello, my love!"
if user is not: "Hello" that person name
```

#### Solution

__My Solution__
```java
public static String greet(String name) {
	if(name.equals("Johnny")){
		return "Hello, my love!";
	} //end if
	
	else {    
		return String.format("Hello, %s!", name);
	} //end else
}
```

__Best Practices__
```java
public static String greet(String name) {
	if (!name.isEmpty()) {
		if (name.equals("Johnny"))
			return "Hello, my love!";
		else
			return String.format("Hello, %s!", name);
	}
	return "name is null";
}
```

__Clever__
```java
public static String greet(String name) {
	return "Hello, " + (name == "Johnny" ?  "my love" : name) + "!";
}
```

---

## Opposite number

> FUNDAMENTALS

Very simple, given a number, find its opposite.

Test Examples:
```
1: -1
14: -14
-34: 34
```

#### Solution

__Best Practices (My Solution)__

```java
public static int opposite(int number){
	return number * -1;
}
```

__Clever__
Top 1:
```java
public static int opposite(int number) {
	return -number;
}
```

Top 2:
```java
public static int opposite(int number) {
	return Math.negateExact(number);
}
```

---

## Even or Odd

> FUNDAMENTALS, MATHEMATICS, ALGORITHMS, NUMBERS

Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

#### Solution

__My Solution__
```java
public static String even_or_odd(int number) {
	//Place code here
	String answer = "";

	if (number % 2 == 0) {
		return answer = "Even";
	} else {
		return answer = "Odd";
	}
}
```

__Best Practices__
```java
public static String even_or_odd(int number) {
	return (number%2 == 0) ? "Even" : "Odd";
}
```

__Clever__
```java
public static String even_or_odd(int number) {
	return (number & 1) == 0 ? "Even" : "Odd";
}
```

---

## Multiply

> BUGS

Write a method that calculate two doubles.

__Example__
```java
return multiply(3.0, 2.0); // 6.2
return multiply(2.0, 5.0) // 10.0
```

#### Solution

__Best Practices__
```java
public static Double multiply(Double a, Double b) {
	return a * b;
}
```

__Clever__
```java
public static Double multiply(Double a, Double b) {
	return (a == null || b == null) ? null : a * b;
}
```

---

## DNA to RNA Conversion

> FUNDAMENTALS, STRINGS, DATA 

Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine `'G'`, Cytosine `'C'`, Adenine `'A'`, and Thymine `'T'`.

Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil `'U'`.

Create a function which translates a given DNA string into RNA.

For example:

```
"GCAT"  =>  "GCAU"
```

The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. each input string will only ever consist of `'G'`, `'C'`, `'A'` and/or `'T'`.

#### Code

```java
public String dnaToRna(String dna) {
	// your code here
	return dna;
}
```

#### Solution

__My Solution__
```java
public String dnaToRna(String dna) {
	StringBuilder rna = new StringBuilder();
	String dnaString = new String(dna);

	for(char nuc : dnaString.toCharArray()) {
		if (nuc == 'T') {
			rna.append('U');
		} else {
			rna.append(nuc);
		}
	}

	return rna.toString();
}
```

__Best Practices__

```java
public String dnaToRna(String dna){
	return dna.replaceAll("T", "U");
}
```

and

```java
public String dnaToRna(String dna) {
	return dna.replace("T", "U");
}
```

---

## How good are you really?

> FUNDAMENTALS

There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return `True` if you're better, else `False`!

*Note: Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!*

#### The Code

```java
public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
	// Your code here
}
```

#### Solution

__My Solution__
```java
public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
	int total = 0;
	for (int each : classPoints) {
		total += each;
	}
	int avg = total / classPoints.length;
	return yourPoints > avg ? true : false;
}
```

__Best Practice__
```java
import java.util.Arrays;

class ComparePoints {
	static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
		return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
	}
}
```

and

```java
import java.util.stream.*;

public class ComparePoints {
		public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
			return IntStream.of(classPoints).sum()/classPoints.length < yourPoints;
		}
}
```

---

## Beginner - Reduce but Grow

> FUNDAMENTALS, ARRAYS, NUMBERS

Given a non-empty array of integers, return the result of multiplying the values together in order.

Example:

```
[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
```

#### The Code

```java
public static int grow(int[] x){
	// your code
	return 0;
}
```

#### The Solution

__My Solution__ :

```java
public static int grow(int[] x){
	int multiply = 1;
	for (int each : x) {
		multiply *= each;
	}
	return multiply;  
}
```

__Best Practices__ :

```java
public static int grow(int[] x){
	int result = 1;
	for (int a : x) {
		result *= a;
	}
	return result;
}
```

__Clever__:

```java
public static int grow(int[] x){
	return IntStream.of(x).reduce(1, (a, b) -> a * b);
}
```

or

```java
public static int grow(int[] x){
	return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);
}
```

---

## Century From Year

> FUNDAMENTALS, NUMBERS, MATHEMATICS, ALGORITHMS, BASIC LANGUAGE FEATURES, DATES/TIME

The first century spans from the __year 1__ up to and __including the year 100__, __The second__ - from the year 101 up to and including the year 200, etc.

Task: Given a year, return the century it is in.

Example:

```java
centuryFromYear(1705)  // returns (18)
centuryFromYear(1900)  // returns (19)
centuryFromYear(1601)  // returns (17)
centuryFromYear(2000)  // returns (20)
```

#### The Code

```java
public static int century(int number) {
	// your code goes here
}
```

#### Solution

__Best Practice (My Solution)__

```java
public static int century(int number) {
	return (number % 100) == 0 ? number/100 : number/100 + 1;
}
```

__Clever__

```java
public static int century(int number) {
	return (number + 99) / 100;
}
```

---

## Sum of Positive

> FUNDAMENTALS, ARRAYS, NUMBERS

You get an array of numbers, return the sum of all of the positives ones.

Example:
```
[1,-4,7,12] => 1 + 7 + 12 = 20
```

Note: if there is nothing to sum, the sum is default to 0.

#### The Code

```java
public static int sum(int[] arr) {
	// your code here
}
```

#### Solution

__Best Practice (My Code)__

```java
public static int sum(int[] arr) {
	int sum = 0;
	for(int each : arr) {
		if (each >= 0) {
			sum += each;
		}
	}
	return sum;
}
```

__Clever__

```java
import java.util.Arrays;

public static int sum(int[] arr) {
	return Arrays.stream(arr).filter(v -> v > 0).sum();
}
```

or

```java
import java.util.stream.IntStream;

public static int sum(int[] arr) {
	// your code here
	return IntStream.of(arr).filter(x -> x > 0).sum();
}
```

---

## Return Negative

> FUNDAMENTALS, NUMBERS

In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Example:

```java
Kata.makeNegative(1); // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0); // return 0
```

*Notes:*

- The number can be negative already, in which case no change is required.

- Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

#### The Code

```java
public static int makeNegative(final int x) {
	// your code go here
}
```

#### Solution

__My Code__
```java
public static int makeNegative(final int x) {
	return x > 0 ? x * -1 : x;
}
```

__Best Practice__

```java
public static int makeNegative(final int x) {
	return (x < 0) ? x : -x;
}
```

or 

```java
public static int makeNegative(final int x) {
	return x > 0 ? -x : x;
}
```

__Clever__

```java
public static int makeNegative(final int x) {
	return -abs(x);
}
```
