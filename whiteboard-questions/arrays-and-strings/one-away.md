# One Away

There are three types of edits taht can be performed on strings: insert a character, remove a character, or replace a chracter. Given two strings, write a function to check if they are one edit (or zero edits) away.

**EXAMPLE**

```
pale, ple   -> true
pales, pale -> true
pale, bale  -> true
pale, bake  -> false
```

## Hint

It's often easiest to modify strings by going from the end of the string to the beginning.

You might find you neewd to know the number of spaces. Can you just count them?
