package linkedList;
//creation of a node in singly linked list
public class singlyLinkedListNode {
    int val;
    singlyLinkedListNode next;

//    add-to-tail
    public singlyLinkedListNode(int val){
        this.val = val;
        this.next = null;
    }

// add-to-head
    public singlyLinkedListNode(int val, singlyLinkedListNode next){
        this.val = val;
        this.next = next;
    }
}


