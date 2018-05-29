/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
*/
package bitwise;
//A Node is defined as: 
  public  class Node {
        int data;
        Node next;

Node(int data,Node node){
this.data=data;
this.next=node;
}  

Node(int data){
 this.data = data;
} 

static boolean hasCycle(Node head) {
    System.out.println(">>>>>");
    boolean result = false;
    
    if(head == null) {
        result = true;
        // no cycle
    } else {
        Node slowp = head ;
        Node fastp = head ;
        while(fastp != null && fastp.next!=null && slowp !=null) {
            slowp = slowp.next;
            fastp = fastp.next.next;
            if(slowp == fastp) {
                //cycle detected
                result = true;
                break;
            }
        }
    }
    System.out.println(">>>>> "+ result);

    return result;
}

public static void main(String[] args) {
    Node nd = new Node(2,new Node(3,new Node(5, null)));
    Node p = nd;
    while(p.next!=null){
        p = p.next;
    }
    p.next = nd;
    hasCycle(nd);
}
}