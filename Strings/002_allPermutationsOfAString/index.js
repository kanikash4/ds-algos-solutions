/**
 * Create permutation of a String
 *  E.g : I/p:   permutations('aka')
 *  O/p  : [ 'aka', 'aak', 'kaa', 'kaa', 'aak', 'aka' ]
 * Logic used: We will convert the string to an array first, then from the array we will pick one character and then permute rest of it. After getting the permutation of the rest of the characters, we will concatenate each of them with the character we have picked
 */

"use strict";

var permutations = function (str) {
var arr = str.split(''),
    len = arr.length, 
    perms = [],
    rest, pickedChar, restPermsChar, next;

    if (len === 0)
        return [str];
    for (var i=0; i<len; i++)
    {
        rest = Object.create(arr);
        pickedChar = rest.splice(i, 1);
        restPermsChar = permutations(rest.join(''));
       for (var j=0, jLen = restPermsChar.length; j< jLen; j++)
       {
           next = pickedChar.concat(restPermsChar[j]);
           perms.push(next.join(''));
       }
    }
   return perms;
};


module.exports = permutations;
