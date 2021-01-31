# Big O Notation

__Source:__ book `Cracking Coding Interview` and [dev.to](https://dev.to/jainroe/the-ultimate-guide-to-big-o-notation--learning-through-examples-5ecp)

> Big O time is the language and metric we use to describe how long does it take for an algorithm takes to run.
> _"How quickly it grows relative to the input, as the input gets arbitrarily large."_
 
Big O notation is used to describe or calcuate time complexity (worst-case performance) of an algorithm.

---

## Time Complexity

> is a function describing the amount of time an algorithm takes in terms of the amount of input to the algorithm. 

"Time" can mean the number of memory accesses performed, the number of comparisons between integers, the number of times some inner loop is executed, or some other natural unit related to the amount of real time the algorithm will take. 

## Space Complexity

> is a function describing the amount of memory (space) an algorithm takes in terms of the amount of input to the algorithm. 

We often speak of "extra" memory needed, not counting the memory needed to store the input itself. Again, we use natural (but fixed-length) units to measure this. We can use bytes, but it's easier to use, say, number of integers used, number of fixed-sized structures, etc. In the end, the function we come up with will be independent of the actual number of bytes needed to represent the unit. Space complexity is sometimes ignored because the space used is minimal and/or obvious, but sometimes it becomes as important an issue as time.

---

## O(1) - Constant Time

> an algorithm that will always execute in the same time (or space) regardless of the size of the input data set.

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

## O(2n)

> an algorithm whose growth doubles with each additon to the input data set.
 
The growth curve of an O(2N) function is exponential - starting off very shallow, then rising meteorically. An example of an O(2N) function is the recursive calculation of Fibonacci numbers:

```java
function int Fibonacci(int number) {
    if (number <= 1) return number;
    return Fibonacci(number - 2) + Fibonacci(number - 1);
}
```

---

## O(log n) - Logarithmic Time

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
