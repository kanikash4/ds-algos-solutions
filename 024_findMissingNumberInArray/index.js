
/**
 * Find the missing number in arrayof numbers 1 to 100.
 * E.g. : Input:  missingNumber([3,4,5,7,8,1,2,6])
 * Outpot: 9

 */

"use strict";

var missingNumber =function missingNumber(arr){
 var n = arr.length+1, 
 sum = 0,
 expectedSum = n* (n+1)/2;
 
 for(var i = 0, len = arr.length; i < len; i++){
   sum += arr[i];
 }
 
 return expectedSum - sum;
};

module.exports = missingNumber;
