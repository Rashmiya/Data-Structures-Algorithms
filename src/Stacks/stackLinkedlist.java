package Stacks;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next=null;
    }
}

public class stackLinkedlist{
    public Node head;
    public Node tail;
    int count;

    public static void main(String args[]){
        stackLinkedlist li = new stackLinkedlist();
        li.peek();

        li.push(55);
        li.push(60);
        li.push(67);
        li.display();

        li.peek();

        li.pop();
        li.display();
        li.peek();
    }

// isEmpty method
    public boolean isEmpty(){
        return (head == null);
    }
   /*not necessary to check isFull method , in stack which is used by linked-list*/

// add elements to the stack
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

// remove elements from the stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            Node temp = head;
            head = head.next;
            System.out.println("Deleted element is : "+ temp.val);
        }
     }

// peek method
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else {
            Node temp = head;
            System.out.println("Topmost element is : "+temp.val);
        }
    }

// print all elements
    public void display(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }else{
            Node temp;
            for(temp=head;temp!=null;temp=temp.next){
                System.out.println(temp.val);
            }
        }
    }
}
