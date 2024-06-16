# Array & String problems from CCI

## Techniques
* Sort the array/string
* Use a hash map (O(1) lookup)
* Use a balanced binary search tree (O(logn) lookup)
* Use StringBuilder to avoid copying strings when appending to them (string = string + s),
* Arrays and Strings are interchangeable (can convert to the other)
* May be easier to modify Strings from the end instead of the beginning

## Helpful Data Structures 
[uses hash-based indexing for O(1) lookup and insertion]
* HashMap implements the Map interface to store key-value pairs, O(1) for get() lookup & put() insertion
* HashSet implements the Set interface, ignores duplicate elements, uses internal HashMap to store elements (null values, key is the element), O(1) add() & contains()
* HashTable implements the Map interface to store key-value pairs, does not allow null keys/values, synchronized (thread-safe) but slower than HashMap due to synchronization overhead, O(1) get() and put() like HashMap
* ASCII int array to keep track of char frequencies

## Common Mistakes
* Forgetting null input special cases
*
*
