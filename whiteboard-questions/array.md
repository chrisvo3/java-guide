# Array - Whiteboard Questions



## Question 1

Given an array of n String return an near-identical array with duplicate elements removed.

#### Test
```
f(["dog", "dog", "elephant"]) = ["elephant"]
f(["dog", "dog"]) = []
f(["dog", "elephant", "dog"]) = ["elephant"]
f(["dog", "dog", "elephant", "dog"]) = ["elephant"]
f(["dog", "elephant"]) = ["dog", "elephant"]
```

#### Solution

This is `O (log n)^2` performance, which will do poorly.
`log n` is when we go through all items of the list

```java
String[] f(inputArray) {

	List list = [];

	for(String s : inputArray) {
		if(getNumberOfOccurrences(s, inputArray) == 1) {
			list.add(s);
		}
	}
	return list;
}


int getNumberOfOccurences(s, inputArray) {

	int counter = 0;

	for(String element : inputArray) {

		if(element == s) {
			counter++;
		}
	}
	return counter;
}
```



## Question 2

Print all the combination of letters with its uppercase and lower case.
Given [A, B, C]

#### Test

With only uppercase, 3 letters = 6 combinations
with only lowercase, 3 letters = 6 combinations

```
print:
ABC, ABc, AbC, Abc
aBC, aBc, abC, abc

ACB, ACb, AcB, Acb
aCB, aCb, acB, acb

BAC, BAc, BaC, Bac
bAC, bAc, baC, bac

BCA, BCa, BcA, Bca
bCA, bCa, bcA, bca

CAB, CAb, CaB, Cab
cAB, cAb, caB, cab

CBA, CBa, CbA, Cba
cBA, cBa, cbA, cba
```

#### Solution
```java
for (int i = 0; i < array.length; i++) {

}
```
