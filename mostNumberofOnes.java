//Given a 2d array with 0s and 1s, find the rows with max number of 1s. The 0s are to the left and 1s are to the right

import java.io.*;
import java.util.*;

/*
Given a 2d array with 0s and 1s, find the rows with max number of 1s. The 0s are to the left and 1s are to the right

eg: 
0 0 0 0 1 1 1
0 0 0 0 0 1 1
0 0 0 0 1 1 1
0 0 1 1 1 1 1
0 0 0 0 0 0 0 
0 0 0 0 0 0 1

returns 3,5 since row 1 has the max number of 1s
*/

// Get the 2d array and implement binary search on each row
// If you hit 0, pass the right side till it hits findMaxOnes
// If you hit 1, make sure it is the first instance.


class Solution {

public static int BinarySearch(int left, int right, int[] search)
{
  if(left==right)
  {
    if(search[left]==1) {
      return left;
    }
    return -1;
  }
  int mid = (left+right)/2;
  if(search[mid]==1 && mid>0)
  {
    if(search[mid-1]==0)
    {
      return mid;
    }
    else
    {
      return BinarySearch(left, mid-1, search);
    }
  }
  else if(search[mid]==1 && mid==0)
  {
    return 0;
  }
  else if(search[mid]==0)
  {
    return BinarySearch(mid+1, right, search);
  }
  return -1;
}

  public static String findMaxOnes(int[][] input) {
  int rows = input.length;
  int col = input[0].length;
  int max=0, rowno = 0;
  for(int i=0;i<rows;i++)
  {
    int temp = (col - BinarySearch(0, col-1, input[i]));
    if(temp>col)
    {
      continue;
    }
    if(max<temp) {
      max = temp;
      rowno = i;
    }
  }
  if(max==0)
  {
    return ("-1, 0");
  }
  return (rowno+", "+max);
}

  public static void betterSolution(int[][] input)
  {
    int rowsize = input.length;
    int colsize = input[0].length;
    int row=0, col=colsize-1;
    int max=0, rowno=0;
    while(row<rowsize && row>=0 && col<colsize && col>=0)
    {
      if(input[row][col]==1)
      {
        col--;
        if(col==-1)
        {
        if(max<(colsize-col-1))
        {
          max=(colsize-col-1);
          rowno=row;
        }
        }
      }
      else if(input[row][col]==0)
      {
        if(max<(colsize-col-1))
        {
          max=(colsize-col-1);
          rowno=row;
        }
        row++;
      }
    }
    if(max==0)
    {
      System.out.println("-1, 0");
    }
    else
    {
      System.out.println(rowno+", "+max);
    }
  }
  
  public static void main(String[] args) {
    int[][] input = {{0, 0, 1}, {0, 1, 1}, {0, 0, 0}};
    int[][] input1 = {{1,1,1,1}, {0,0,0,0}, {0,0,1,1}};
    int[][] input2 = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
    int[][] input3 = {{1,1}, {1,1}, {1,1}, {1,1}};
    int[][] input4 = {{1}, {1},{0}};
    System.out.println(findMaxOnes(input));
    System.out.println(findMaxOnes(input1));
    System.out.println(findMaxOnes(input2));
    System.out.println(findMaxOnes(input3));
    System.out.println(findMaxOnes(input4));
    betterSolution(input);
    betterSolution(input1);
    betterSolution(input2);
    betterSolution(input3);
    betterSolution(input4);
  }
}
