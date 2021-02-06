# Algorithm Exercise

> Practice your understanding with the algorithm

## Brief Review

These are not jsut example and exercise, but will explain how algorithm works.

### Question 1 - Drop Constants

Which one of these below is faster?

__Code A:__

```java
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for (int x : array) {
	if (x < min) min = x;
	if (x > max) max = x;
}
```

or

__Code B:__

```java
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for (int x : array) {
	if (x < min) min = x;
}
for (int x : array) {
	if (x > max) max = x;
}
```

#### Solution

Both of these code are the same.

#### Explaination

The different between the two codes are the for loop. The Code A has 1 for loop, but the Code B has 2 for loops. But Code A has two lines of conditions within that loop rather than one. Code A is consider as `O(n)` and Code B is a `O(2n)`. But in analyze an algorithm, we drop the constants. Therefore, both of the Code A and Code B are `O(n)`.

---

### Question 2 - Drop the Non Dominant Terms

What expression is the code below?

```java
int muliple_sum(int array) {
	for (int i = 0; i < array.length(); i++) {
		for (int j = i; j < array.length(); j++) {
			print(array[i]);
		}
	}

	for (int i = i, i < array.length(); i++) {
		print(i);
	}
}
```

#### Solution

`O(n^2)`

#### Explaination

The expression is `O(n^2 + n)`. The second `n` isn't exactly a constant, but it is not especially important, so we drop the non dominant terms. Examples:

`O(n^2 + n^2)` ---> `O(n^2)`

`O(n + log n)` ---> `O(n)`

`O(5*2^n + 1000n^100)` ---> `O(2^n)`

---

### Question 3 - Multi-Part Algorithms: Add vs. Multiply

Suppose you have an algorithm that has two steps. Which do you have multiple the runtimes `O(A * B)`, and which do you have add runtime `O(A + B)`?

__Code A__

```java
for (int a : arrayA) {
	print(a);
}

for (in b : arrayB) {
	print(b);
}
```

and

__Code B__

```java
for (int a : arrayA) {
	for (int b : arrayB) {
		print(a + " " + b);
	}
}
```

#### Solution

Code A is `O(A + B)` while Code B is `O(A * B)`

#### Explaination

In Code A, we have one chunk of code loop array A, and another chunk of code that run loop through array B. Therefore, the total amount of work is `O(A + B)`.

In Code B, we have a chunk of code that loop through array B for each of element in array A. Therefore, the total amount of work is `O(A * B)`.

In other words:

- If your algorithm in the form: `do this, then, when you're all done, do that` then you add the runtimes.

- If you algorithm is in the form: `do this for each time you do that` then you multiply the runtimes.

---

## Exercise

Below are exercises to go over, with solution and explaination right after.

### Question 1

What is the runtime for this code below?

```java
void numOfProduct(int[] array) {
	int sum = 0;
	int product = 1;

	for (int i = 0; i < array.length; i++) {
		sum += array[i];
	}

	for (int i = 0; i < array.length; i++) {
		product *= array[i];
	}

	System.out.println(sum +  ", " + product);
}
```

#### Solution

This takes `O(n)` time.

#### Explaination

The fact that we iterate through the array twice doesn't matter.

---

### Question 2

What is the runtime of code below?

```java
void printPairs(int[] array) {
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[i] + ", " + array[j]);
		}
	}
}
```

#### Solution

This takes `O(n^2)`.

#### Explaination

The inner for loop has `O(n)` iterations, and it is called `n` times on the outter loops. Therefore, it is `O(n^2)`.

By looking at the meaning of the code, it printing all pairs (two-element sequences). Therefore, it is `O(n^2)`.

---

### Question 3

What is the runtime for this code below? Noticed that this code is similar to the one on *question 2*, with a little bit different that the loop starts at `i + 1`.

> This pattern of for loop is very common. It's important that you know and deeply understand the runtime. *Deep comprehension is important*.

```java
void unorderedPairs(int[] array) {
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			System.out.print(array[i] + ", " + array[j]);
		}
	}
}
```

#### Solution

This code takes `O(n^2)`.

#### Explaination

The outer loop is a `O(n)` as it iterate through each elements of an array. While the second one is different. The second loops will counting the iteration. Below is the step of how the second loops works:

- First time loop through, `j` runs for `n - 1` steps. The second time, it will be `n - 2` steps. Then the third time, it will be `n - 3` steps. Etc... So the number of steps total is 

```
  (n - 1) + (n - 2) + (n - 3) + ... + 3 + 2 + 1
=    1    +    2    +    3    + ... (n - 1)
= sum of 1 through (n - 1)
```

The `sum of 1 through (n - 1)` is `( n(n -1) )/ 2`. To understand more about this check out [Big O Notation](bigO-notation.md). To do that math:

```
  ( n(n - 1) ) / 2
= ( n^2 - n ) / 2
= ( n^2 ) 

with all constant and non-dorminate term removed
```

**Visualizing how works**

Let's say the array has `n` length is 4. So the code iterates throught `(i, j)` pairs when `n = 4`. 

```
(0, 1)  (0, 2)  (0, 3)
		(1, 2)  (1, 3)
				(2, 3)
```

This look like half of an `n x n` matrix, which has size of `(n^2) / 2`. Therefore, it takes `O(n^2)` time.

---

### Question 4

What is the runtime of the code below? Noticed how this code is similar to the code on *question 2* also, but now it has two different arrays.

```java
void unorderedPairs(int[] arrayA, int[] arrayB) {\
	for (int i = 0; i < arrayA.length; i++) {
		for (int j = 0; j < arrayB.length; j++) {
			if (arrayA[i] < arrayB[j]) {
				System.out.println(arrayA[i] + ", " + arrayB[j]);
			}
		}
	}
}
```

#### Solution

This is `O(A * B)` runtime.

#### Explaination

The `if` statement within the second loop of `j` is `O(1)` time since it's just a sequence of constant-time statements.

So by remove the `if` statement below to easier time to analyze:

```java
void unorderedPairs(int[] arrayA, int[] arrayB) {\
	for (int i = 0; i < arrayA.length; i++) {
		for (int j = 0; j < arrayB.length; j++) {
			// O(1)
		}
	}
}
```

For each element of arrayA, the inner loop go through arrayB iteration. So for `A = arrayA.length`, and `B = arrayB.length`; then the runtime is `O(A * B)`.

_Why is this not `O(n^2)`?_

Because let's say `arrayA.length = 2` and `arrayB.length = 5`, then by going through the two loops, it will takes `10` time slots.

Whereas if `N = arrayN.length` and `arrayN.length = 5`, then by logic of `O(n^2)`, the run time will be `n * n`, which is `5 * 5` is `25` time slots.

> `O(AB)` expresses that you have _two parameters_ that determine complexity. `O(n^2)` expresses that your complexity _only depends on one parameter_.

---

### Question 5

What is the runtime for this strange code below?

```java
void unorderedPairs(int[] arrayA, int[] arrayB) {
	for (int i = 0; i < arrayA.length; i++) {
		for (int j = 0; j < arrayB.lenth; j++) {
			for (int k = 0; k < 1000; k++) {
				System.out.println(arrayA[i] + ';' )
			}
		}
	}
}
```

#### Solution

There is `O(ab)`.

### Explaination

Because nothing is change compare the last question, and the loop through `1000` is a constant. Therefore, this code is a `O(ab)`.

---

### Question 6

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 7

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 8

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 9

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 10

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 11

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 12

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 13

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 14

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 15

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 16

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 17

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 18

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 19

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 20

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 21

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 22

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 23

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 24

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 25

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 26

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 27

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---

### Question 28

What is the runtime for this strange code below?

```java
```

#### Solution

### Explaination

---