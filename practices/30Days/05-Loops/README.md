# Loops

## Objective

In this challenge, we will use loops to do some math. Check out the Tutorial tab to learn more.

## Task

Given an integer, `n`, print its first `10` multiples. Each multiple `n * 1` (where `1 <= i <= 10`) should be printed on a new line in the form: `n x i = result`.

**Example**

```
n = 3
```

The printout should look like this:

```
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
```

## Input Format

A single integer, `n`.

## Constraints

```
2 <= n <= 20
```

**Output Format**

Print `10` lines of output; each line `i` (where `i <= i <= 10`) contains the `result` of `n * i` in the form:
`n x i = result`.

*Sample Input*

```
2
```

*Sample Output*

```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

----

# Lesson 05. Loops

## For Loop
This is an iterative loop that is widely used. The basic syntax is as follows:

```java
for (initialization; termination; increment) {
   // ...
}
```

The initialization component is the starting point in your iteration, and your code for this section will typically be int i = 0. When we declare and initialize int i in the loop like this, we are creating a [temporary variable](https://en.wikipedia.org/wiki/Temporary_variable) that exists only inside this loop for the purposes of iterating through the loop; once we finish iterating and exit (or break) the loop, `i` is deleted and can be declared elsewhere in our program.


The termination component is the condition which, once met, you would like to exit (or break) the loop and proceed to the next line in your code. This is the ending point for your loop, and is typically written as `i < endValue`, where  is the variable from the initialization section and `endValue` is some variable holding the stopping point for your iteration.


The increment component is executed each time the end of the code inside the loop's brackets is reached, and should generally be some modification on the initialization variable that brings it closer to the termination variable. This will typically be i++. The ++ operator is also called the post-increment operator, and it will increment a variable by `1` after a line executes (for more detail and an example, see the While section).


To recap, this sample code:

```java
int endOfRange = 4;
for(int i = 0; i < endOfRange; i++){
    System.out.println(i);
}
```

produces this output:

```
0
1
2
3
```

## While Loop

This type of loop requires a single boolean condition and continues looping as long as that condition continues to be true. Each time the the end of the loop is reached, it loops back to the top and checks if the condition is still true. If it's true, the loop will run again; if it's false, then the program will skip over the loop and continue executing the rest of the code.


Much like in the For section, the code below prints the numbers `0` through `3`. Notice that we are using the post-increment operator on `min`:

```java
int min = 0;
int max = 4;
while(min < max){
    System.out.println(min++);
}
```

Once `min >= max`, the boolean condition (`min < max`) evaluates to false and the loop is broken. The line `System.out.println(min++);` is a compact way of writing:

```java
System.out.println(min);
min = min + 1;
```

## Do-While Loop

This is a variation on the While loop where the condition is checked at the end of the brackets. Because of this, the content between the brackets is guaranteed to always be executed at least once:

```java
do{
    // this will execute once
    // it will execute again each time while(condition) is true
} while(condition);
```

## Unlabeled Break
You may recall break; from our previous discussion of Switch Statements. It will break you out of a loop even if the loop's termination condition still holds true.


### Additional Language Resources

[C++ Loops](http://www.cplusplus.com/doc/tutorial/control/#loops)

[Python While Statement](https://docs.python.org/3.5/reference/compound_stmts.html#while)