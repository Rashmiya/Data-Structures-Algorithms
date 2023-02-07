package Stacks;

class stackArray {
    int arrayStack[] = new int[5];
    int stackLength = arrayStack.length;
    int top = -1;

    public static void main(String args[]){
        stackArray s1 = new stackArray();
        s1.push(20);
        s1.push(33);

        s1.display();

        s1.pop();

        s1.push(40);
        s1.push(55);

        s1.display();
        s1.peek();
    }

// isEmpty function
    public boolean isEmpty(){
        return (top == -1);
    }

// isFull function
    public boolean isFull(){
        return (top == stackLength-1);
    }

// add data into stack
    public void push(int val){
        if(isFull()){
            System.out.println("stack overflow");
        }else{
            arrayStack[++top] = val;
        }
    }

// Remove data from the stack
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            int temp = arrayStack[top];
            --top;
            System.out.println("Removed element is : "+temp);
        }
    }

// get topmost element in the stack (copy of the top element)
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            System.out.println("Top element is :"+ arrayStack[top]);
        }
    }

// Display all the elements in the stack
    public void display(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }else{
            for(int i=0;i<stackLength;i++){
                System.out.println(arrayStack[i]);
            }
        }
    }
}

