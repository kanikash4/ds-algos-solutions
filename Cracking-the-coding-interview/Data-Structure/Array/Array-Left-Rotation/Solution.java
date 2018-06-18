/*

Input Format

The first line contains two space-separated integers n and d, the size of a and the number of left rotations you must perform. 
The second line contains n space-separated integers a[i].

Output Format

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4


Explanation

When we perform  d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int numRotations = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        /* Rotating array (in place) using 3 reverse operations */
        numRotations %= size; // to account for numRotations > size
        int rotationSpot = size - 1 - numRotations;
        reverse(array, 0, size - 1);
        reverse(array, 0, rotationSpot);
        reverse(array, rotationSpot + 1, size - 1);
        
        /* Print the rotated array */
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /* Reverses the array from "start" to "end" inclusive */
    private static void reverse(int [] array, int start, int end) {
        if (array == null || start < 0 || start >= array.length || 
            end < 0 || end >= array.length || start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int offset = i - start;
            swap(array, start + offset, end - offset);
        }
    }
    

}