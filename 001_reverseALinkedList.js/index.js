/**
 * Reverse a linked list
 */

"use strict";

var list = {
  name : 'I',
  next : {
    name : 'AM',
    next : {
      name : 'KANIKA',
      next : {
        name : 'SHARMA'
      }
    }
  }
};

function reverse(list) {
  if(list.next) {
  reverse(list.next);
  console.log(list.name);
  }
  else {
  console.log(list.name);
  }
}

reverse(list);