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

//Add to head method
    public void addToHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

//Delete from head
    public void deleteFromHead(){
    Node tempNode = head;
    head = head.next;
    System.out.println("I am the deleted node from the list Node vallue "+tempNode.val);
    }

//Search a value from Node linked-list
    public Node search(int searchElement){
        Node temp;
        for(temp=head;temp!=null;temp=temp.next){
            if(temp.val == searchElement){
                break;   //for loop eka end wenwa methndi
            }
        }
        return temp;
    }

// to get linked list length
public void length(){
    int count = 0;
    Node currentNode = this.head;

    while(currentNode !=null){
        count++;
        currentNode = currentNode.next;
    }
    System.out.println("linkedlist length is : "+count);
}

// print all nodes
    public void printNodeList(){
        // method 1
        Node temp;
        for(temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.val);
        }
        //method 2
       /* Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }*/
    }

    public static void main(String args[]){
        linkedlist newlist = new linkedlist();
        newlist.addToHead(40);
        newlist.addToHead(20);
        newlist.addToHead(30);
        newlist.addToHead(10);
        newlist.addToHead(15);

        newlist.printNodeList();
        newlist.length();

        newlist.deleteFromHead();

        newlist.printNodeList();

        newlist.search(20);

        newlist.length();
    }
}
