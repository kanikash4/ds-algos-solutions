/*
Day 26: Nested Logic


Objective 
Today's challenge puts your understanding of nested conditional statements to the test. You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing!

Task 
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:


Sample Input

9 6 2015
6 6 2015
Sample Output

45
*/


import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Solution {

        public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        /* Read and save input as LocalDates */
        Scanner scan = new Scanner(System.in);
        LocalDate returnDate = readDate(scan);
        LocalDate expectDate = readDate(scan);
        scan.close();
        
        /* Calculate the fine */
        int fine;
        if (returnDate.isEqual(expectDate) || returnDate.isBefore(expectDate)) {
            fine = 0;
        } else if (returnDate.getMonth() == expectDate.getMonth() && returnDate.getYear() == expectDate.getYear()) {
            fine = 15 * (returnDate.getDayOfMonth() - expectDate.getDayOfMonth());
        } else if (returnDate.getYear() == expectDate.getYear()) {
            fine = 500 * (returnDate.getMonthValue() - expectDate.getMonthValue());
        } else {
            fine = 10000;
        }
        System.out.println(fine);
    }
    
    private static LocalDate readDate(Scanner scan) {
        int day   = scan.nextInt();
        int month = scan.nextInt();
        int year  = scan.nextInt();
        return LocalDate.of(year, month, day);
    }
}