// Reverse a string

'use strict';

var reverseString = function(s) {
    if (!s) {
        return s;
    }
    
    return s.split('').reverse().join('');
};

module.exports = reverseString;