# Arrays and Strings

## Hash Tables

> A hash table is a data structure that maps keys to values for highly efficient lookup.

In a hash table, data is stored in an array format, where each data value has its own unique index value. Access of data becomes very fast if we know the index of the desired data.

![Hash Table](https://www.tutorialspoint.com/data_structures_algorithms/images/hash_function.jpg)

Common implementations by use array of linked lists and a hash code function. To insert a key, (might be a string or essentially any other data type) and value:

1. First, compute the key's hash code, usually be `int` or `long`. Two different keys could have same hash code, there may be an infinite number of keys and finite number of ints.

2. Second, map the hash code to an index in the array. Could be done with something like `hash(key) % array_length`. Two different hash codes could map to the same index. 

3. At this index, there is a linked list of keys and values. Store the key and value in this index. Use linked list because of collisions: have two different keys with same hash code, or two different hash codes that map to the same index.

Define a hashing method to compute the hash code of the key of the data item.

```java
int hashCode(int key){
   return key % SIZE;
}
```

**Following are the basic primary operations of a hash table.**

**Search** − Searches an element in a hash table.

**Insert** − inserts an element in a hash table.

**delete** − Deletes an element from a hash table.

Define a data item having some data and key, based on which the search is to be conducted in a hash table.

```java
construct DataItem {
   int data;
   int key;
};
```

## ArrayList & Resizable Arrays

