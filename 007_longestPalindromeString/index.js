/**
 * Given a string S, find the longest palindromic substring in S.
 * Assumption: maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */

"use strict";

var longestPalindromeSubString = function (str) {
  if (str.length === 0) return '';

  var insertedS = '#' + str.split('').join('#') + '#';
  var length = insertedS.length;
  var result = '';
  for (var i = 1; i < length - 1; i++) {
    var j = 1;
    while (i - j >= 0 && i + j <= length - 1 && insertedS[i - j] === insertedS[i + j]) {
      j++;
    }
    if (j - 1 > result.length) {
      result = insertedS.substr(i - j + 1, j * 2 - 1).replace(/#/g, '');
    }
  }
  return result;
};

module.exports = longestPalindromeSubString;