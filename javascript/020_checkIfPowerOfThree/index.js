/**
 * To determine if  a number is a power of three
 * E.g.:
 * I/p : 5, returns false
 * I/p : 9, returns true
 * I/p : 81, returns true
 */
'use strict';

var isPowerOfThree = module.exports = function (n) {
  if (n === 0)  {
  	return false;
  }
  return Math.pow(3, n.toString(3).length - 1) === n;
};

module.exports = isPowerOfThree;