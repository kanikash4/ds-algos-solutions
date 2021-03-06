/**
 * BFS
 * create a queue from Qbject.keys, map the key[values] into queue items
 * queue.shift() current item to be compared to search term
 * if item === searchTerm , return true;
 * check if current item is itself an object with children
 * if item is an object, and item is not an empty object, and item is not array,
 * add its children to the end of the queue
 * if typeof(item) === 'object' && item !== null && !Array.isArray(item)
 * queue = queue.concat(item)
 * else return false if search term is not found in tree
 */

/* BFS - O(n) Complexity */

"use strict";


var exampleTree = {
	1 : 'A',
	2 : 'B',
	3 : 'C',
	4 : {
		5 : 'D',
		6 : 'E',
		7 : {
			8 : 'F',
			9 : 'G'
		}
	}
};


var BFS = (tree, searchTerm) => {
	
	var queue = Object.keys(tree).map((key) => { 
		return tree[key];
	});

	while (queue.length > 0) {
		var item = queue.shift();

		if (item === searchTerm) {
			return true; 
		}
		
		if (typeof(item) === 'object' && item !== null && !Array.isArray(item)) {
			queue.concat(Object.keys(item).map((value) => {
				item[value];
			}) 
			);
		}
	return false;
	}
};

module.exports = BFS;

console.log(BFS(exampleTree, 'H')); //returns False
console.log(BFS(exampleTree, 'A')); //returns true
