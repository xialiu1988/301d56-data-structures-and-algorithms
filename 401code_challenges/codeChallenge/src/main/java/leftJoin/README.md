## Hashmap LEFT JOIN
Bring in two tables and use leftjoin tables to print out all the values. If only left table has the key, print out the value from left table and add "null" for the right table.

Challenge
Write a function that LEFT JOINs two hashmaps into a single data structure.

The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.

The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.

Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.

LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.

Avoid utilizing any of the library methods available to your language.

Approach & Efficiency
## Approach

-create a new list to hold the values later

-use foreach to traversal the left table -if right table has the same key, add both of the values to the list -else only add value of left table,and plus "null" to show that right table doesn't have the key so no value.

## Effuciency BigO T-> O(n) it has to go through every single key from left table S-> O(1) create a list

Solution

![leftjoin](../../../../../Assets/76.jpeg)