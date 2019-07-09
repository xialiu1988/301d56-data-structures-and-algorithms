# Hashtables
Hashtable contains items which has a pair of key and value. Such as dictionary, based on key find index and then find the page and get the value.

## Challenge
Implement a Hashtable with the following methods:

add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

get: takes in the key and returns the value from the table.

contains: takes in the key and returns a boolean, indicating if the key exists in the table already.

hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency

BigO:

Add: T->O(1) S->O(1)

Get: T->O(1) S->O(1)

Contains: T->O(1) S->O(1)

Hash: T->O(1) S->O(1);

### Approach:(hashtable contanis a linkedlist array)

Add: baseed on the input key, use Hash() to get the index in the hashtable.if nothing in there,create a new linkedlist,if already exists, add the item using linkedlist add() methods.

Hash: using gethashcode() module the size of the table get the index number.

Get: get index by Hash() and get the value by using linkedlist get() function

Contains: using hash get the index,if index not eauql to null, it exsits otherwise return false because it doesn't exist.