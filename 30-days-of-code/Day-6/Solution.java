/*

Objective 
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases). 
Each line i of the T subsequent lines contain a String, S.

Constraints:


1<=T<=10
2<=length of S <=10000

Output Format

For each String  Sj(where 0<=j<=T-1), print Sj's even-indexed characters, followed by a space, followed by Sj's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            printEvensOdds(str);
        }
        scan.close();
    }
    
    public static void printEvensOdds(String str) {
        StringBuffer evens = new StringBuffer();
        StringBuffer odds  = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                evens.append(ch);
            } else {
                odds.append(ch);
            }
        }
        System.out.println(evens + " " + odds);
    }
}