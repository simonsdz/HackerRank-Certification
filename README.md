# HackerRank-Certification

Q1. String Anagrams: 
Given two arrays of strings, for every string in one list,
determine how many anagrams of it are in the other list.

Write a function that receives dictionary and query, two string arrays.
It should return an array of integers where each element i contains 
the number of anagrams of query[i] that exist in dictionary.

Example: 
dictionary= {'hack','a','rank','khac','ackh','kran','rankhacker','a','ab','ba','stairs','raits'}
query={'a','nark','bs','hack','stair'}

Output: [2,2,0,3,1]

Algorithm for Q1:
Create a function that checks whether the given two strings are anagram or not.
Create a for loop with index i of query and inner for loop with index j of dictionary and
iterate through the lists and for every ith and jth index check whether the given strings are anagram
and if they are, increment the count. 

Q2. Active Traders: 
Given a list of trades by customer name, determine which customers account for at least
5% of the total number of trades. Order the list alphabetically ascending by name.

Example: n-23. (customers)
customers= {'Bigcorp', 'Bigcorp', 'Acme', 'Bigcorp', 'Zork', 'Zork', 'Abc', 'Bigcorp', 'Acme', 'Bigcorp', 'Bigcorp',
            'Zork', 'Bigcorp', 'Zork', 'Zork', 'Bigcorp', 'Acme', 'BigcorpAcme', 
            'Bigcorp', 'Acme', 'LittleCorp', 'Nadircorp'}

Output: ['Acme','Bigcorp','Zork']

Algorithm for Q2:
Create a HashMap and insert all the customers.
Traverse through the HashMap and for every entry,
multiply the value by 100 and divide it by the given size
If it is >=5, consider it.
