/**
 * To find the Greatest Common Factor
 *
 * E.g. gcf(8,10) result: 2
 * E.g. gcf(4,8) result: 4
 */

"use strict";

function gcf(num1, num2) {
  if (num1 > num2) { //to make sure num1 is the smaller number
    var temp = num1;
    num1 = num2;
    num2 = temp;
  }
  for (var i = num1; i > 1; i--) {
    if (num1 % i === 0 && num2 % i === 0){
      return i;
    }
  }
  return 1;
}

module.exports = gcf;
