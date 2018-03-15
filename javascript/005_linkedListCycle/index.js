"use strict";

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
