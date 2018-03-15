/**
 * Print the integers from 1 to 100, but for the multiples of  3, 
 * print "Fizz" instead and for multiples of 5, print "Buzz". for multiples of 3 and 5 both, print "Gizz"
 */

'use strict';

function printNumbers() {
	for(i=1;i<=100;i++) {
		if(i%3==0 &&i%5==0) {
			console.log("intersection: ", "Gizz");
		}
		if(i%3==0) {
			console.log("Fizz");
		}
		if(i%5==0) {
			console.log("Buzz");
		} else {
			console.log(i);
		}
	}
}