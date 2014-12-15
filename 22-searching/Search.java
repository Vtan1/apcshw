import java.util.*;
import java.io.*;

/* 12/11/14
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

/* 12/15/14
  In computer science, lg is implied to be log base 2.
  For however many steps (n) it takes to linearly do something, binary does it
  in lg n steps.

  However, it only works if your list is sorted already. So when is it faster
  than the linear search, since you have to sort it as well?

  k*searches

  k*n vs n^2 + k lg n
  -n^2 is the sorting.
*/
