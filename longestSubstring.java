// Write a function that takes in a string and returns the length of the longest substring without repeating characters. 
// For example, given the string ""abcabcbb"", the function should return 3, as the longest substring without repeating characters is ""abc"". "

import java.io.*;
import java.util.*;


class Solution {
//abcabcbb
  public static int longestSubstring(String var) {
    int start = 0, max = 0, cur = 0;
    int n = var.length();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int i=0;
    while(i<n && start<=i) {
      if(!map.containsKey(var.charAt(i))) {
        map.put(var.charAt(i),1);
        cur = cur+1;
        if(max<cur)
        {
          max = cur;
        }
        i++;
      }
      else
      {
        //int temp = start;
        //start = map.get(var.charAt(i)) + 1;
        map.remove(var.charAt(start));
        start = start + 1;
        cur = cur - 1;
      } 
    }
    return max;
  }

  public static void main(String[] args) {

    // String var = "dbacbecbb";
    System.out.println(longestSubstring(""));
    System.out.println(longestSubstring("a"));
    System.out.println(longestSubstring("aaaaaaaa"));
    System.out.println(longestSubstring("abcdf"));
    System.out.println(longestSubstring("dbacbecbb"));
    System.out.println(longestSubstring("db*abecbb"));    
  }
}
