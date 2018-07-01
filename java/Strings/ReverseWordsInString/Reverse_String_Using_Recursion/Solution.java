/*
 Program to reverse a string using recursion
*/

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {

		String str = "Testing string";
		String reversed =  reverseString(str);
		System.out.println("Final :::::::     " + reversed);

	}

	public static String reverseString(String str) {

		if(str.isEmpty())
            return str;

        // System.out.println(str.substring(1) +  "   >>>>>>  " + str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
	}
}
