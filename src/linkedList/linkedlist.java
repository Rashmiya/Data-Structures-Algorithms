package linkedList;

// 01 - first create a template for a node
// 02 - create a linkedlist class with main function
// 03 - create an object using linkedlist class
// 04 - call addToHead method bhy using object


/*steps in addToHead
* 01- create a new node
* 02- assign head for the new node
* 03- new head eka bawata create krpu node eka assign krnna
* */

// create an template for a node
class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;   // crete the tail node
    }
    public Node(int val, Node next){
        this.val = val;
        this.next=next;
    }
}

// create linked-list class
public class linkedlist {
    public Node head;
    public Node tail;
    int count;

    public void addToHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String args[]){
        linkedlist newlist = new linkedlist();
        newlist.addToHead(40);
    }
}