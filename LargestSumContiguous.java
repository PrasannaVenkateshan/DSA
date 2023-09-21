//find the largest continuous sum in an array

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int max = Integer.MIN_VALUE, max_at_index = 0;
        for(int i=0;i<n;i++)
        {
            max_at_index = max_at_index+arr[i];
            if(max < max_at_index)
            {
                max = max_at_index;
            }
            if(max_at_index<0)
            {
                max_at_index = 0;
            }
        }
    System.out.println(max);
        
    }
}
