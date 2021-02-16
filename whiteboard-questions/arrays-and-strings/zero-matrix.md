# Zero Matrix

Write an algorithm such that if an elemnt in an `MxN` matrix is `0`, its entire row and column are set to `0`.

## Hint

If you just cleared the rows and columns as you found `0`s, you'd likely wind up clearing the whole matrix. Try finding the cells with zeros first before making any changes to the matrix.

Can you use `O(n^2)`? What information do you really need from the list of cells that are zero?

You probably need some data storage to maintain a list of the rows and columns that need to be zeroed. Can youreduce the additional space usage to `O(1)` by using the matrix itself for data storage?

