/***
 * Swap two numbers without temp
 * E.g. : swapNumber(6,8)
 * Numbers before swap:  a:  6 b:  8
 * Numbers after swap:  a:  8 b:  6
 */

'use strict';

function swapNumber(a, b){
  console.log('Numbers before swap: ','a: ', a, 'b: ', b);
  b = b -a;
  a = a+ b;
  b = a-b;
  console.log('Numbers after swap: ','a: ', a, 'b: ', b);  
}

module.exports = swapNumber;