/**
* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*
* Input Format:-  A single line of five space-separated integers.
*
*
* Constraints:-  Each integer is in the inclusive range [1,10^9].
* Output Format:- Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than the 32-bit integer.)
*
* Sample Input:-  1 2 3 4 5
* Sample Output:- 10 14
*
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
		long sum=0;
		long max = 0;
		long min = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		sum += arr[i];
    		if(min > arr[i]) {min = arr[i];}
    		if(max < arr[i]) {max = arr[i];}
    	}
    	long minSum= sum-max;
    	long maxSum = sum - min;
    	System.out.println(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        

        miniMaxSum(arr);
		scanner.close();
    }
}
