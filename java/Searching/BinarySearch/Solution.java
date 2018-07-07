import java.util.*;

/*
 Note: input numbers must be in ascending order.
*/

public class Solution {

	public static void main(String[] args) {

		int n, c, search, array[];
		int first = 0, mid, last;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  amount of number for which we will perform Binary Search : ");

		n = sc.nextInt();
		array = new  int[n];
		System.out.println("Enter "+ n +" numbers: ");

		for (c = 0; c < n; c++)
      		array[c] = sc.nextInt();
      	
      	System.out.println("Enter the number to find");

      	search = sc.nextInt();
		System.out.println("searching for: "+ search);

      	last = n-1;
      	mid = (first+last)/2;
      	while(first <= last) {
      		if(array[mid] < search) {
      			first = mid + 1;  
      			mid = (first + last)/2;
      		} else if (array[mid] ==  search) {
      			System.out.println(search + " found at location " + (mid + 1) + ".");
      			break;
      		} else {
      			System.out.println("less");
      			last = mid - 1;
      			mid = (first + last)/2;
      		}
      	}
      	if ( first > last ) {
      		System.out.println(search + " isn't present in the list.\n");
      	}
	}
}