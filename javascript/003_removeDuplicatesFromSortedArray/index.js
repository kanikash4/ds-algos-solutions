/**
 * remove the duplicates from sorted array such that each element appear only once and
 * returns the new length.
 *
 * E.g. input array nums = [1,2,3,4,4,5], result :function should return length = 5,
 */

"use strict";

var removeDuplicates = function (nums) {
  if (nums.length === 0) return 0;
  var hash = {};
  for (var i = 0; i < nums.length; i++) {
    if (hash[nums[i]]) {
      nums.splice(i, 1);
      i--;
    } else {
      hash[nums[i]] = true;
    }
  }
  return Object.keys(hash).length;
};

module.exports = removeDuplicates;