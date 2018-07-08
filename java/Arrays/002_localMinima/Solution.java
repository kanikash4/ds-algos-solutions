import java.util.*;
/*
Local Minima: An element arr[x] is a local minimum if it is less than or equal to both its neighbors

Input: arr[] = {9, 6, 3, 14, 5, 7, 4};
Output: Index of local minima is 2
The output prints index of 3 because it is 
smaller than both of its neighbors. 
Note that indexes of elements 5 and 4 are 
also valid outputs.

Input: arr[] = {23, 8, 15, 2, 3};
Output: Index of local minima is 1

Input: arr[] = {1, 2, 3};
Output: Index of local minima is 0

Input: arr[] = {3, 2, 1};
Output: Index of local minima is 2
*/

class Solution {

	public static void main(String[] args){
		int n, d;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements to be added: ");
		n = sc.nextInt();

		System.out.println("Enter the "+ n +"array elements: ");
		int arr[] = new int[n];

		for(d=0; d<n; d++) {
			arr[d] = sc.nextInt();
		}

		System.out.println("Index of a local minima is " + localMin(arr, n));

	}
	
	public static int localMin(int[] arr, int n) {
        return findLocalMinima(arr, 0, n - 1, n);
    }

	public static int findLocalMinima(int [] arr,  int first , int last, int n ) {
		int mid;
		mid = (first+last)/2;

		// Comparing middle element with its neighbours (if neighbours exist)
		if(mid == 0 ||  (arr[mid - 1] > arr[mid] && mid == n - 1) || (arr[mid] < arr[mid + 1])) {
			return mid;
		} else if (mid > 0 && arr[mid - 1] < arr[mid]) {
			// If middle element is not minima and its left neighbour is smaller than it, then left half 
        	// must have a local minima.
			return findLocalMinima(arr, first, mid - 1, n);
		}
		// If middle element is not minima and its right neighbour is smaller than it, then right half
        // must have a local minima.
        return findLocalMinima(arr, mid + 1, last, n);
	}
}