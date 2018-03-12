/**
 * Intersection of two arrays: An intersection would be the common elements that exists within both arrays.
 * In this case, these elements should be unique.
 * E.g: var firstArray = [2, 2, 4, 1 , 8];
 * var secondArray = [2, 2, 4, 8, 1];
 * arrIntersection(firstArray, secondArray); will give output:  [ 2, 4, 8, 1 ]
 * Time complexity O(n), Space complexity O(n)
 */

'use strict';

function arrIntersection(firstArray, secondArray) {
  var hashmap = {};
  var intersectionArray = [];

  firstArray.forEach(function(element) {
    hashmap[element] = 1;
  });

  secondArray.forEach(function(element) {
    if (hashmap[element] === 1) {
      intersectionArray.push(element);
      hashmap[element]++;
    }
  });

  return intersectionArray;

}

module.exports = arrIntersection;