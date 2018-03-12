/**
 * Check whether a given number is an ugly number.
 * (Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.)
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note: 1 is typically treated as an ugly number.
 * E.g. : 
 * I/p: 7, result: false
 * I/p: 4, result: true
 * I/p: 6, result: true
 */

"use strict";

var isNumberUgly = function(number) {
    if (number <= 0) {
        return false;
    }
    
    while (number % 2 === 0) {
        number = number / 2;
    }
    
    while (number % 3 === 0) {
        number = number / 3;
    }
    
    while (number % 5 === 0) {
        number = number / 5;
    }

    return number === 1;
};

module.exports = isNumberUgly;