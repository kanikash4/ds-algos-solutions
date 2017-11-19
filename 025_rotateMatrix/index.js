/**
 * Write a function that rotates a NxN matrix 90 degrees clockwise.
 * A matrix(also called a 2-D array), is simply an array of arrays of values.
 * E.g. :: [[1, 2],[3,4]] will output [[3,1],[4,2]]
 * E.g. : rotateMatrix([[3,3],[4,7]]) will give output : [ [ 4, 3 ], [ 7, 3 ] ]
 */

'use strict';

function rotateMatrix (matrix) {
  var results = [];
  var subarray = [];

  for (var i = 0; i < matrix.length; i++) {
    for(var j = matrix.length-1; j >= 0; j--) {
      subarray.push(matrix[j][i]);
    }
    results.push(subarray);
    subarray = [];
  }
  return results;
}

module.exports = rotateMatrix;