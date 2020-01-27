# Fundamental Programming Structures

## Data Type

In Java, every variable has a type.
Variables are declared by first stating the type of the variable, followed by the name of the variable.
Each declaration is considered a statement

Each statement is followed by a semi-colon `;`

```
double salary;
int vacationDays;
long earthPopulation;
boolean done;
int x;
```


## Primitive Data Type

> A __primitive data type__ is ...

There are 8 primitive data-types

`double` stores _fractional_ number values.
`float` stores _fractional_ number values.
`long` stores _non-fractional_ number values.
`int` stores _non-fractional_ number values.
`short` stores _non-fractional_ number values.
`byte` stores _non-fractional_ number values.
`boolean` stores _logical_ values (true, or false).


### Numeric Primitives

> short, int, long, float and double.

These primitive data types hold only numeric data.
Operations associated with such data types are those of simple arithmetic (addition, subtraction, etc.) or of comparisons (is greater than, is equal to, etc.)


### Textual Primitives

> byte and char.

These primitive data types hold characters (that can be Unicode alphabets or even numbers).
Operations associated with such types are those of textual manipulation (comparing two words, joining characters to make words, etc).
However, byte and char can also support arithmetic operations.


## Widening Primitive Conversions

> Conversions of primitive types which do not lose information are named widening primitive conversions.

A widening primitive conversion does not lose information about the overall magnitude of a numeric value.

```
int n = 123456789;
float f = n; // f is 1.23456792E8
```

### Specific Widening Primitive Conversions

`byte` to _short_, _int_, _long_, _float_, or _double_
`short` to _int_, _long_, _float_, or _double_
`char` to _int_, _long_, _float_, or _double_
`int` to _long_, _float_, or _double_
`long` to _float_ or _double_
`float` to _double_

## Narrowing Primitive Conversions

> Conversions of primitive types which lose information are named narrowing primitive conversions.

A widening primitive conversion may lose information about the overall magnitude of a numeric value.
Narrowing primitive conversions are done by means of casting.
```
double d = 9.997;
int n = (int) d; // n is 9
```

## Casting

> When two values are combined with a binary operator (such as `n + f` where `n` is an integer and `f` is a floating-point value), both operands are converted to a common type before the operation is carried out.


__Example__

If either of the operands is of type `double`, the other one will be converted to a `double`.
Otherwise, if either of the operands is of type `float`, the other one will be converted to a `float`.
Otherwise, if either of the operands is of type `long`, the other one will be converted to a `long`.
Otherwise, both operands will be converted to an `int`.

## Wrapper-Types

> Each primitive type has a respective non-primitive, wrapper-type, that is considered generally safer than its primitive counterpart.
__Wrapper-types__ also have additional operations that can be performed on them.

A list of the respective wrapper-types:
Primitive Type	Wrapper-Type
double			Double
float			Float
long			Long
int				Integer
short			Short
char			Character
byte			Byte
boolean			Boolean


## Null Object
> The null object denotes that an object does not currently exist, but has the potential to exist in the future.
All non-primitive values can be assigned to null.
