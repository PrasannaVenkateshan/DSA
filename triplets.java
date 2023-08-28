//Given an integer array, find triplets which add up to the number n.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.io.*;

// [5, -1, 2, -2, -4, 3, 8, 0] 
// Get the input in the function and then sort.
// Start a for loop iterating through the array.
// Declare a temp variable which is -1*(the element selected)
// Use two pointers - left and right to find the pair of elements
// whose sum is equal to the temp variable
// if the sum of the elements pointed by the left and right pointers is greater than the sum required, we move the right pointer to the left
// If it is lesser, we move the left pointer to the right. 
// Keep this inner loop running till we find the pair or till left is still to the left of right.


class Solution {
    
    public static List<List<Integer>> findTriplets(int[] input, int n) {
      List<List<Integer>> triplets = new ArrayList<List<Integer>>();
      Arrays.sort(input);
      int length = input.length;
      for(int i=0;i<length;i++) {
        // -4, -2, -1, 0, 2, 3, 5, 8
        int left = i+1, right = length-1;
        while(left < right) {
          if(input[left] + input[right] + input[i] == n) {
            triplets.add(List.of(input[i], input[left], input[right]));
            left++;
            right--;
          }
          else if(input[left] + input[right] + input[i] > n) {
            right--;
          }
          else {
            left++;
          }
        }
      }
      return triplets;
    }
    
    public static void main(String[] args) {
     List<List<Integer>> ans = new ArrayList<List<Integer>>();
     int[] arr = {5, -1, 2, -2, -4, 3, 8, 0};
     int[] sample = {};
     int[] sample1 = {0};
     int[] sample2 = {0,0,0};
     int[] sample3 = {-1,1,0};
     int n = 10;
     System.out.println(findTriplets(arr, n));
     System.out.println(findTriplets(sample, n));
     System.out.println(findTriplets(sample1, n));
     System.out.println(findTriplets(sample2, n));
     System.out.println(findTriplets(sample3, n));
    }
}
