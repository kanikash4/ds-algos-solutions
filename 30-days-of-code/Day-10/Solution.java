/*


Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a base- integer, 10, convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

Input Format

A single integer, n.

Constraints

1 <= n <= 10 to the power of 6

Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2

Explanation

Sample Case 1: 
The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2: 
The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


 public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	scanner.close();
        System.out.println(consecutive(n));
    }

    // Checking for consecutive 1's
    public static int consecutive(int n) {
        int count = 0;
        int max   = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                // max : max returns greatest value of 2 arguments
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            // Right Shift operator (shift 1 bit)
            n = n >> 1;
        }
        return max;
    }

}

