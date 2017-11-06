/**
 * Remomve duplicates from tha array and return unique values
 * var arr = [1, 2, 3, 5, 1, 5, 9, 1, 2, 8, 7];
 * E.g. : uniqueArray(arr); will give optput [ 1, 2, 3, 5, 9, 8 , 7 ]
 */

'use strict';

function uniqueArray(arr) {
  var hashmap = {};
  var unique = [];

  for(var i = 0; i < arr.length; i++) {
    // If key returns undefined (unique), it is evaluated as false.
    if(!hashmap.hasOwnProperty(arr[i])) {
      hashmap[arr[i]] = 1;
      unique.push(arr[i]);
    }
  }

  return unique;
}

module.exports = uniqueArray;