# Array - Whiteboard Questions


### Question 1

Given an array of n String return an near-identical array with duplicate elements removed.

__Test__

f(["dog", "dog", "elephant"]) = ["elephant"]
f(["dog", "dog"]) = []
f(["dog", "elephant", "dog"]) = ["elephant"]
f(["dog", "dog", "elephant", "dog"]) = ["elephant"]
f(["dog", "elephant"]) = ["elephant"]


__Solve__

This is `O sqrt(log n)` performance, which will do poorly.
`log n` is when we go through all 

```
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