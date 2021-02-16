# Palindrome Permutation

Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

**EXAMPLE**

Input: `Tact Coa`

Output: `True` (permutation: "taco cat", "atco cta", etc).

## Hint

You donot have to - and should not - generate all permutations. This would be very inefficient.

What characteristics would a string that is a permutation of a palindrome have?

Have you tried a hash table? You should be able to get this down to `O(n)` time.

Can you reduce the space usage by using a bit vector?