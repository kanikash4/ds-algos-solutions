/**
 * Use the  operator to perform the following operations: 
 * Print the sum of  plus your int variable on a new line.
 * Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 * Concatenate  with the string you read as input and print the result on a new line.
 *
 * Input Format
 *
 * The first line contains an integer that you must sum with . 
 * The second line contains a double that you must sum with . 
 * The third line contains a string that you must concatenate with .
 *
 * Output Format
 * 
 * Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.
 *
 * Sample Input: 
 *
 * 12
 * 4.0
 * is the best place to learn and practice coding! 
 * 
 * Sample Output: 
 * 
 * 16
 * 8.0
 * HackerRank is the best place to learn and practice coding!
 * 
 * Explanation:  
 * When we sum the integers 4 and 12, we get the integer 16.
 * When we sum the floating-point numbers 4.0 and 4.0, we get 8.0. 
 * When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!. 
 *
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int ii;
        double dd;
        String ss = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        ii = scan.nextInt();
        dd = scan.nextDouble();
        scan.nextLine(); // to get rid of newline at end of line 2 of input
        ss = scan.nextLine(); 

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + ii);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + dd);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+ss);
       scan.close();
    }
}