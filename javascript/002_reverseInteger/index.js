/**
 * Reverse digits of an integer.
 *
 * Example1: x = 12345, return 54321
 * Example2: x = -12345, return -54321
 * If the integer's last digit is 0, what should the output be? ie, cases such
 * as 10, 100,  the reversed integer might overflow. Assume the input is
 * a 32-bit integer, then the reverse of 1000000003 overflows. How should you
 * handle such cases?
 * Example3: x = 1000000003, return 0 
 * For the purpose of this problem, assuming that function returns 0 when the
 * reversed integer overflows.
 */

"use strict";

var reverse = function (x) {
  var pn = x >= 0 ? '' : '-';
  var num = Math.abs(x);
  var result = Number(pn + num.toString().split('').reverse().join(''));
  if (result > Math.pow(2, 31)) {
    return 0;
  }
  if (result < 1 - Math.pow(2, 31)) {
    return 0;
  }
  return result;
};

module.exports = reverse;
