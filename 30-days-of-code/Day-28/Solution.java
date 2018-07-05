/*
Day 28: RegEx, Patterns, and Intro to Databases

Objective 
Today, we're working with regular expressions. Check out the Tutorial tab for learning materials and an 
instructional video!

Task 
Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating
 the Emails table, print an alphabetically-ordered list of people whose email address ends in `@gmail.com`.

Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya

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
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<String> list = new ArrayList<String>();
		for (int a0 = 0; a0 < N; a0++) {
			String firstName = in.next();
			String emailID = in.next();
			String regExPattern = "[a-z].@gmail.com";

			Pattern p = Pattern.compile(regExPattern);
			Matcher m = p.matcher(emailID);
			if (m.find()) {
				list.add(firstName);
			}
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		in.close();
    }
}