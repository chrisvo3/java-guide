# Big O Notation

> Big O time is the language and metric we use to describe how long does it take for an algorithm takes to run.
> _"How quickly it grows relative to the input, as the input gets arbitrarily large."_

## Time Complexity

> is a function describing the amount of time an algorithm takes in terms of the amount of input to the algorithm. 

"Time" can mean the number of memory accesses performed, the number of comparisons between integers, the number of times some inner loop is executed, or some other natural unit related to the amount of real time the algorithm will take. 

## Space Complexity

> is a function describing the amount of memory (space) an algorithm takes in terms of the amount of input to the algorithm. 

We often speak of "extra" memory needed, not counting the memory needed to store the input itself. Again, we use natural (but fixed-length) units to measure this. We can use bytes, but it's easier to use, say, number of integers used, number of fixed-sized structures, etc. In the end, the function we come up with will be independent of the actual number of bytes needed to represent the unit. Space complexity is sometimes ignored because the space used is minimal and/or obvious, but sometimes it becomes as important an issue as time.

## O(1)

> an algorithm that will always execute in the same time (or space) regardless of the size of the input data set.

```
bool IsFirstElementNull(IList<string> elements) {
    return elements[0] == null;
}
```

## O(N)

> an algorithm whose performance will grow linearly and in direct proportion to the size of the input data set. 

The example below also demonstrates how Big O favours the worst-case performance scenario; a matching string could be found during any iteration of the for loop and the function would return early, but Big O notation will always assume the upper limit where the algorithm will perform the maximum number of iterations.

```
foreach (var element in elements) {
    if (element == value) return true;
}
```

## O(N2)

> an algorithm whose performance is directly proportional to the square of the size of the input data set. 

This is common with algorithms that involve nested iterations over the data set. Deeper nested iterations will result in O(N3), O(N4) etc.

```
for (var outer = 0; outer < elements.Count; outer++) {
    for (var inner = 0; inner < elements.Count; inner++) {
        // Don't compare with self
        if (outer == inner) continue;

        if (elements[outer] == elements[inner]) return true;
    }
}
```

## O(2N)

> an algorithm whose growth doubles with each additon to the input data set.
 
The growth curve of an O(2N) function is exponential - starting off very shallow, then rising meteorically. An example of an O(2N) function is the recursive calculation of Fibonacci numbers:

```
int Fibonacci(int number) {
    if (number <= 1) return number;
    return Fibonacci(number - 2) + Fibonacci(number - 1);
}
```