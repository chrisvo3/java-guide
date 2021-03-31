# Day 02 - Operators

## Objective
In this challenge, you will work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video.

## Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

*Example*

```
meal_cost = 100
tip_percent = 15
tax_percent = 8
```

A tip of `15% * 100 = 15`, and the taxes are `8% * 100 = 8`. Print the value `123` and return from the function.

## Function Description
Complete the solve function in the editor below.

solve has the following parameters:

* `int meal_cost`: the cost of food before tip and tax

* `int tip_percent`: the tip percentage

* `int tax_percent`: the tax percentage

Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

**Note**: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

## Input Format

There are `3` lines of numeric input:

The first line has a double, `meal_cost` (the cost of the meal before tax and tip).

The second line has an integer, `tip_percent` (the percentage of `meal_cost` being added as tip).

The third line has an integer, `tax_percent` (the percentage of `meal_cost` being added as tax).

**Sample Input**
```
12.00
20
8
```

**Sample Output**
```
15
```

## Explanation

Given:

```
meal_cost = 12
tip_percent = 20
tax_percent = 8
```

Calculations:

```
typ = 12 and 12/100 * 20 = 2.4

tax = 8 and 8/100 * 20 = 0.96

total_cost = meal_cost + tip + tax = 12 + 2.4 + 0.96 = 15.36

round(total_cost) = 15
```

We round `total_cost` to the nearest integer and print the result, `15`.

---

# Lesson 02

## Operators
These allow you to perform certain operations on your data. There are 3 basic types:

1. Unary: operates on 1 operand

2. Binary: operates on 2 operands

3. Ternary: operates on 3 operands


## Arithmetic Operators
The binary operators used for arithmetic are as follows:

* `+`: Additive

* `-`: Subtraction

* `*`: Multiplication

* `/`: Division

* `%`: Remainder (modulo)


## Additional Operators

* `+`: A binary operator used for String concatenation

* `++`: This unary operator is used to preincrement (increment by 1 before use) when prepended to a variable name or postincrement (increment by 1 after use) when appended to a variable.

* `--`: This unary operator is used to predecrement (decrement by 1 before use) when prepended to a variable name or postdecrement (decrement by 1 after use) when appended to a variable.

* `!`: This unary operator means not (negation). It's used before a variable or logical expression that evaluates to true or false.

* `==`: This binary operator is used to check the equality of 2 primitives.

* `!=`: This binary operator is used to check the inequality of 2 primitives.

* `<`, `>`, `<=`, `>=`: These are the respective binary operators for less than, greater than, less than or equal to, and greater than or equal to, and are used to compare two operands.

* `&&`, `||`: These are the respective binary operators used to perform logical AND and logical OR operations on two boolean (i.e.: true or false) statements.

* `?` : This ternary operator is used for simple conditional statements (i.e.: `if ? then : else`).