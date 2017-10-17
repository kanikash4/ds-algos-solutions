/**
 * To write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 *
 * E.g. : 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function output should return 3.
 * E.g. : Input: 5 (00000000000000000000000000000011), Output: 2
 */

"use strict";

var hammingWeight = function(num) {
    var result = 0;
    while (num > 0) {
        //compare last digit
        //bitwise AND compare
        if ((num & 1) === 1) {
            result ++;
        }
        num >>>= 1;
    }
    return result;
};

module.exports = hammingWeight;
