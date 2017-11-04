/**
 * A peak element is an element that is greater than its neighbors.
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * Asumption: num[-1] = num[n] = -∞.
 * E.g. : In an array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * E.g. : findArrPeakElement([1,2,3,4,5,6]) will return 5, which is index of 6.
 */

'use strict';

var findArrPeakElement = function(nums) {
    var len = nums.length,
        left, right, mid;
    
    if (len === 1) {
        return 0;
    }
    
    left = 0;
    right = len - 1;
    while(left < right) {
        mid = parseInt((left + right)/2);
        
        if (nums[mid] <= nums[mid + 1]) {
            left = mid + 1;
        } else if (nums[mid] <= nums[mid - 1]) {
            right = mid - 1;
        } else {
            return mid;
        }
    }
    return left;
};

module.exports = findArrPeakElement;
