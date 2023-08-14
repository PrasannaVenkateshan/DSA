//Given an array of integers, find the subset of non-adjacent elements with the maximum sum. Calculate the sum of that subset.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        
        int max1 = arr[0], max2 = arr[1];
        int n = arr.length;
        for(int i=2; i<n; i++)
        {
            if(max1 < arr[i-2])
            {
                max1 = arr[i-2];
            }
            if(max2 < arr[i-1])
            {
                max2 = arr[i-1];
            }
            
            if(arr[i]+max1 > arr[i])
            {
                arr[i] = arr[i]+max1;
            }
        }
        
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }    
        }
    return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
