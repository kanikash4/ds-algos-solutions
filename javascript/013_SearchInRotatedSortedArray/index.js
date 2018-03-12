/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * Assumption: No duplicate exists in the array.
 */

"use strict";

var searchIndex = function(nums, targetNum) {
    var start = 0,
        end = nums.length - 1,
        mid;
        
    while (start <= end) {
        mid = Math.floor((start + end) / 2);
        if (nums[mid] === targetNum) {
            return mid;
        } else if (nums[start] <= nums[mid]) {
            // left side sorted
            if (nums[mid] > targetNum && nums[start] <= targetNum) {
                // nums[mid] !== targetNum, can safely do end = mid - 1
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            // right side sorted
            if (nums[mid] < targetNum && nums[end] >= targetNum) {
                // nums[mid] !== targetNum, can safely do start = mid + 1
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    return -1; //If value not found
};

module.exports = searchIndex;
