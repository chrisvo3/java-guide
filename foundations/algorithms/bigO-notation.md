# Big O Notation

> Big O time is the language and metric we use to describe how long does it take for an algorithm takes to run.

> _"How quickly it grows relative to the input, as the input gets arbitrarily large."_
 
Big O notation is used to describe or calcuate time complexity (worst-case performance) of an algorithm.

To analyze an algorithm, we look for its performance and resouce usage. Faster performance does not always means that you have done it correctly, but the slower performance and correct answer can mean that you have complicated the code. When writing pseudocode, take these into consideration:

1. Input: is the input too complicated or wrong?

2. Input size: is the input becomes too large and would be difficult to process?

The processing will depend on the nature of the input and input size.

---

When analyze the algorithm, we also analyze how many times the principal acitivity of the algorithm is being performed. Then count the number of comparisons.

## 1. Worst Case:

During the worst case, we calculate the upper bound of a running time. In this case, the maximum number of operations to be executed over all inputs of size `n`. This can easily happen. 

## 2. Average Case:

Is the most usefull measure, yet typically a diffcult thing to measure. In this case, we take all possible inputs and calculate computing time for all of the inputs. Sum all the calculated values and divide the sum by a total number of inputs. The average will help us predict almost accurately the distribution throughout the data set.

## 3. Best Case:

This case is rarely used. In this case, the lower bound algorithm is ued. We must consider the minimum number of operations that can be executed for the input size `n`. This might help us to get the best behaviour of a specific algorithm.

---

## Time Complexity

> is a function describing the amount of time an algorithm takes in terms of the amount of input to the algorithm. 

"Time" can mean the number of memory accesses performed, the number of comparisons between integers, the number of times some inner loop is executed, or some other natural unit related to the amount of real time the algorithm will take. 

## Space Complexity

> is a function describing the amount of memory (space) an algorithm takes in terms of the amount of input to the algorithm. 

We often speak of "extra" memory needed, not counting the memory needed to store the input itself. Again, we use natural (but fixed-length) units to measure this. We can use bytes, but it's easier to use, say, number of integers used, number of fixed-sized structures, etc. In the end, the function we come up with will be independent of the actual number of bytes needed to represent the unit. Space complexity is sometimes ignored because the space used is minimal and/or obvious, but sometimes it becomes as important an issue as time.

---

The following 3 asymptotic notations are mostly used to represent time complexity of algorithms.
1) Θ Notation (Theta notation)
2) Big O Notation
3) Ω Notation (Omega notation)

--- 

## Big O and its Rate of Growth

`O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)`

The worst-case scenario is known as the `upper bound`. The best case scenario is known as `lower bound`.

![Big O graph](https://jarednielsen.com/static/9c24f10d0295ead7526e32d62fa2eac5/b9e4f/big-o-cheatsheet.png)

---

## O(1) - Constant Time

> an algorithm that will always execute in the same time (or space) regardless of the size of the input data set.

`O(1)` means that the algorithm takes the same number of steps to execute regardless of how much data is passed in. This is why it is called *constant time*.

![Big O(1) - Constant](img/BigO_1-constant.png "Big O(1) - Constant")

```java
function boolean IsFirstElementNull(IList<string> elements) {
	return elements[0] == null;
}
```

__Scenario :__ Student who hid my bag name is known to me

__Approach :__ Since I know `Joe` has my bag, I will directly ask him to give it to me


```java
// if I know the persons name, I have to take only one step to check
function boolean get_bag(String name) {
	return data[name];
}

data = {
	'Jane' : False,
	'James' : False,
	'Jon' : False,
	'Joe': True
}

System.out.println( "Is bag with Joe ? " + get_bag('Joe'));
// o/p: Is bag with Joe ? True
```

__Explaination :__

1. Here, give an input of size n, it only takes a one step for the algorithm to accomplish the task

2. An algorithm takes same time (constant time) to execute irrespective of the amount of data

3. This algorithm is not affected by the array size either

---

## O(n) - Linear Time

> an algorithm whose performance will grow linearly and in direct proportion to the size of the input data set.

`O(n)` describes the algorithm that will take as many steps as there are elements of data such as iterating through an array; as the array increase in `n` size, an `O(n)` algorithm will increase by `n` steps. This is why it is *linear*.
 
![Big O(n) - Linear](img/BigO_n-linear.png "Big O(n) - Linear")

```java
foreach (orange in oranges) {
	if (orange == seedless) return true;
}
```

__Scenario :__ One of `n` oranges in basket is seedless.

__Approach :__ Have to open each orange individually in the basket to check for seedless one.

__Worst-Case Scenario:__ have to ask `n` questions

```java
function string search_for_bag(data) {
	found = false;

	for i,name in enumerate(data){
		// have to go through each student to find who has my bag
			if (data[name] == true) {
				found = true;
				return name;
			}
	}
}

data = [
	'Jane' : false,
	'James' : false,
	'Jon' : false,
	'Joe': true
]

System.out.println(search_for_bag(data)); //Joe has my bag.
// o/p: The bag is with Joe
```

__Explaination:__
The example below also demonstrates how Big O favours the worst-case performance scenario; a matching string could be found during any iteration of the for loop and the function would return early, but Big O notation will always assume the upper limit where the algorithm will perform the maximum number of iterations.

1. Here, given an input of size n, the number of steps required is directly related to the amount of data it is processing.

2. Single for loops, linear search are examples of linear time.

3. In above example, an array size/input size increases, time to find desired value also increases.


## O(n^2) - Quadratic Time

> an algorithm whose performance is directly proportional to the square of the size of the input data set. 

`O(n^2)` means an algorithm whose performance is proportional to the square of the size of the input elements, such as comparing every element in an array to every other element in an array. This is why it is *quadratic*. 

It is generally quite slow: if input array has 1 element, it will do 1 operation; if it has 10 element, it will do 100 operations.

![Big O(n^2) - Quadratic](img/BigO_n_square-quadratic.png "Big O(n^2) - Quadratic")

```java
for (var outer = 0; outer < elements.Count; outer++) {
	for (var inner = 0; inner < elements.Count; inner++) {
		// Don't compare with self
		if (outer == inner) continue;

		if (elements[outer] == elements[inner]) return true;
	}
}
```

__Scenario:__ In the entire class, only one student knows on which student desk my bag is hidden.

__Approach:__ I will start questioning each student individually and ask him about all the others students too. If I don't get the answer from the first student, I will move on the next one.

__Worst-Cast Scenario:__ In the worst case scenario, I will have to ask n^2 questions, questioning each student about other as well.

```java
function string search_bag(data) {
	int n = data.length();

	for(int i = 0; i < n; i++) {
		System.out.println("Do you have my bag, " + data[i] + "?")
		Scanner answer = new Scanner(System.in);

		// each student individually if they have my bag
		if (answer == 'yes') {
			return "Ha! Found it "+ data[i] + "had my bag";
		} else {
			// if they don't have it, ask about all other students.
			for(int y = i + 1; y < n; y++ ) {
				System.out.println("You think my bag is with " + data[y]);
				Scanner new_answer = new Scanner(System.in);

				if (new_answer == 'yes') {
					return 'Your bag is with ' + data[y];
				}
			}
		}
	}
}

data = ['Jane','James','Jon', 'Joe']; // here Joe has the bag

System.out.println(search_bag(data));
```

__Explaination:__
This is common with algorithms that involve nested iterations over the data set. Deeper nested iterations will result in O(N3), O(N4) etc.

1. Given an input of size n, the number of steps it takes to accomplish a task is square of n.

2. Each pass to outer loop O(n) requires going through entire list through inner-loop.

3. Nested for-loops are example of quadratic time as we run a linear operation within other linear operation.

---

## O(2^n) - Exponential

> an algorithm whose growth doubles with each additon to the input data set.

`O(2^n)` is algorithm that takes twice as long for every new element added. 

__Scalability:__ poor.

The growth curve of an O(2N) function is exponential - starting off very shallow, then rising meteorically. An example of an O(2N) function is the recursive calculation of Fibonacci numbers:

```java
function int Fibonacci(int number) {
	if (number <= 1) return number;
	return Fibonacci(number - 2) + Fibonacci(number - 1);
}
```

---

## O(log n) - Logarithmic Time

> an algorithm that its number of operations increase by one each time the data is doubled (the number of steps barely increase as the input grows) by divide problems in half every time.
 
`O(log n)` means an algorithm whose complexity increase such as dividing an array in half until only one element remains. This is why it is logarithmic.

__Example__: Looking for people in phone book is `O(log n)` as you don't need to check every person in the phone book to find the right one. Instead, you can simply divide and look based on where their name is alphabetically, and in every section you only need to explore a subset of each section before eventually find someone;s phone number.

1. Open phone book in the middle and check the first word.

2. If our name is alphabetically more signifiticant, look in the right half, else look in the left half.

3. Divide the remainder in half again, repeat steps 2 and 3 until we find our name.

![Big O(log n) - Logarithmic](img/BigO_log_n-logarithmic.png "Big O(log n) - Logarithmic")

__Scenario:__ All students know who has my bag but will only tell me if I guessed the right name.

__Approach:__ I will divide the class in half, then ask: "Is my bag on the left side or the right side of the class?" Then I take that group and divide into two and ask again, and so on.

__Worst-case Scenario:__ In the worst case, I will have to ask `log n` questions.

```java
function boolean binary_bag_search(data, target, low = 0, high = null) {
	
	if (high == null) {
		high = data.length() - 1;
	}

	if (low > high) {
		return false;
	} else {
		mid = (low + high) // 2
		if (data[mid] == target) {
			return true;
		}
		else if(data[mid] > target) {
		   return binary_search(data, target, low, mid - 1)
		}
		else {
			return binary_search(data, target, mid + 1, high);
		}
	}
}

data = ['Jane','James','Jon', 'Joe']; // here Joe has the bag

found = binary_bag_search(data, 'Joe');

System.out.println("Bag Found ?" + found);
```

__Explaination:__

1. Given an input of size n, the number of steps it takes to accomplish the task are decreased bu roughly 50% each time through the algorithm.

2. `O(log n)` algorithms are very efficient because increasing amount of data has little effect at some point early on because the amount of data is halved on each run through.

3. Binary search is a perfect example of this.

---

## O(n log n) - Log linear

> an algorithm that is doing `log n` work `n` times, slightly worse than `O(n)`

`O(n log n)` describe an algorithm whose complexity increases linearithmic such as dividing array in half and iterating through each half. Many practical algorithms belong in this category from *sorting*, to *pathfinding*, to *compression*.

__Examples__: Merge sort - it divides the input arrays in two halves, calls itself for each one and then merges the two sorted halves.

__Scalability__: Average.

```java
```

__Scenario:__ 

__Approach:__

__Worst-case Scenario:__ 

---

# O(n!) - Factorial

> an algorithm has a run time proportional to the factorial of the input size:

`O(n!)` is an algorithm that has rate of groth slowest, or known to be teh worst of the worst. The problem with this algorithm is that it take too much memories to run.

An algorithm with factorial time complexity is used when calculating permnutations and combinations. However, not everyone want to write terrible algorithms, there are some problems for which there is no easy solution.

__Examples__: Merge sort - it divides the input arrays in two halves, calls itself for each one and then merges the two sorted halves.

__Scalability__: Average.

```java

```

__Scenario:__ 

__Approach:__

__Worst-case Scenario:__ 

---

__Source:__

- Book `Cracking Coding Interview`

- [dev.to](https://dev.to/jainroe/the-ultimate-guide-to-big-o-notation--learning-through-examples-5ecp)

- [toward data science](https://towardsdatascience.com/the-big-o-notation-d35d52f38134)

- [coding ninja](https://www.codingninjas.com/blog/2019/06/12/the-ultimate-beginners-guide-to-analysis-of-algorithm/)

- [codeburst.io](https://codeburst.io/the-ultimate-beginners-guide-to-analysis-of-algorithm-b8d32aa909c5)

- [jared nielsen](https://jarednielsen.com/big-o-factorial-time-complexity/)
