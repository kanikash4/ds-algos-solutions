/*
  Generate Random Number b/w 0 and 200
*/

import java.util.*;

class Solution {
   public static void main(String[] args) {
      int counter;
      Random rNum = new Random();
      
      System.out.println("Generated Random Numbers are:");
      System.out.println("***************");

      // Below code would generate 5 random numbers between 0 and 200.
      for (counter = 1; counter <= 5; counter++) {
         System.out.println(rNum.nextInt(200));
      }
   }
}