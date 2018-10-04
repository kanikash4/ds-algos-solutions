import java.util.*;

class Solution {
 public static String solutions(String S) {
       // Remove all spaces
       String str = S.replaceAll("\\s+","");
       // Remove all dashes
       str = str.replace("-", "");
       StringBuilder resultString = new StringBuilder(str.length() + (str.length()/3) + 1);
       String charToBeInserted = "";
       int strLengthCovered = 0;
       while (strLengthCovered < str.length()) {
           resultString.append(charToBeInserted);
           charToBeInserted = "-";
           if((str.length() - strLengthCovered) % 3 == 1 && (str.length() - strLengthCovered) <= 4) {
               resultString.append(str.substring(strLengthCovered, Math.min(strLengthCovered + 2, str.length())));
               strLengthCovered = strLengthCovered + 2;
           } else {
               resultString.append(str.substring(strLengthCovered, Math.min(strLengthCovered + 3, str.length())));
               strLengthCovered = strLengthCovered + 3;
           }
       }
       return resultString.toString();
   }

   public static void main (String[] args) {
       String qq = "1234   - 456 -789";
       System.out.println("Original String" + solutions(qq));
       System.out.println("String after removing sapces, dashes in length 3 split by hyphen: " + solutions(qq));
   }
}