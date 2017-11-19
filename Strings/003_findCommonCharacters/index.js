/**
 * Find common characers between two strings
 * E.g. : I/p: commonCharacters('kanika','Taniya')
 * O/p: 'ani'
 */

'use strict';

var commonCharacters = function(string1, string2) {
  var result = {};

  string1.split('').forEach(function(letter) {
    if(string2.indexOf(letter) >= 0 && letter !== ' ') {
      result[letter] = letter;
    }
  });
  return Object.keys(result).join('');
};

module.exports = commonCharacters;
