import java.util.*;
import java.io.*;

/*
  Searching
    Options:
      1. send in string with name
      Search(ArrayList<Character> A, "fred");
      
      2. send in an instance of class with name set
      Character c = new Character("fred");
      Search(ArrayList<Character> A, c);
 
   -loop through the ArrayList for the String (linear search)

   -if the list is already sorted, then we can do better than linear search.
   -can start looking from the middle.
   
   mid = low + high / 2
   if whatwewant = a[mid], then we're done
   if whatwewant < a[mid]
     h = mid - 1 (new high number)
   else
     l = mid + 1 (new low number)

   -this is called a BINARY SEARCH

HOMEWORK
-lsearch
-bsearch
-rbsearch (recursive binary search)
*/
