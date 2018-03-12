/**
 * Reverse a string using recursion
 */

'use strict';

function reverseString(str) {
  if (str === "")
    return "";
  else
    return reverseString(str.substr(1)) + str.charAt(0);
}

module.exports = reverseString;