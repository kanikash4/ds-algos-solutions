/**
 * Implement int sqrt(int x): Compute and return the square root of x.
 * Math.sqrt() : e.g. : Math.sqrt(9) will return 3
 */

"use strict";

var squareRoot = function(num) {
    var start = 1, end = num, middle;
    if (num === 0) {
        return 0;
    }
    while (start + 1 < end) {
        middle = start + parseInt((end - start) / 2);
        if (middle * middle <= num) {
            start = middle;
        } else {
            end = middle;
        }
    }
    return start;
};

module.exports = squareRoot;
