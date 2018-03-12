/**
 * Add digits: Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * Sample: 58 = 5 + 8 = 13 = 1 + 3 = 4
 * For example:Given num = 39, the process is like: 3 + 9 = 12, 1 + 2 = 3. Since 3 has only one digit, return it.
 *
 * There are several ways to implement. Easiest way is number % 9. For example 38 % 9 = 2
 */

"use strict";

var addDigits = function(num) {
    // return (num - 1) % 9 + 1;
    return num % 9;
};

module.exports = addDigits;