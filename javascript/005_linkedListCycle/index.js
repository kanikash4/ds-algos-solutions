"use strict";
var head = {
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
function detectLoop(head) {
	var slow, fast;
	if(!head || head == null || !head.next) {
		return false;
	} else {
		slow = head;
		fast = head;
		while(fast !== null && fast.next !==null && slow !==null) {
			slow= slow.next;
			fast = fast.next.next;
			if(slow === fast) {
				return true;
			}
		}
	}	
}

detectLoop(head)
