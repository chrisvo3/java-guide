# String Compression

Implement a method to perform basic string compression using the counts of repeated characters. 

**EXAMPLE**

The string `aabcccccaaa` would become `a2b1c5a3`.

If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z).

## Hint

Do the easy thing first. Compress the string, then compare the lengths.

Be careful that you aren't repeatdly concatenating strings together. This can be very inefficient.

