public class Solution {
 
    private static Solution myObj;
     
    static {
        myObj = new Solution();
    }
     
    private Solution() { 
    }
     
    public static Solution getInstance() {
        return myObj;
    }
     
    public void testMe() {
        System.out.println("It's is working!!!!!!!!!!!");
    }
     
    public static void main(String a[]) {
        Solution ms = getInstance();
        ms.testMe();
    }
}