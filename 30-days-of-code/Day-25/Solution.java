/*
Day-25: Running Time and Complexity


Objective 
Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

Task 
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
Given a number, n, determine and print whether it's Prime or Not Prime.

Note: If possible, try to come up with a (0√n ) primality algorithm, or see what sort of optimizations you come up with for an O(n) algorithm.
Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, T, the number of test cases. 
Each of the T subsequent lines contains an integer, n, to be tested for primality.

Constraints:
1<=T <=30
1 <= n <= 2*10 to thepower of 9


Output Format

For each test case, print whether n is Prime or Not Prime on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        scan.close();
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) { // account for even numbers, so that we can do i+=2 in loop below
            return true;
        } else if (n % 2 == 0) { // account for even numbers, so that we can do i+=2 in loop below
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) { // skips even numbers for faster results
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
