package StacksAndQueues;

public class Stack {

    public Node top;

    public Stack(Node node){
        this.top = node;
    }

    //empty stack
    public Stack(){

    }


    //push to a stack
    public void push(int value){
        Node node = new Node(value);
        node.next = this.top;
        this.top = node;
    }

    //pop a node from the stack
    public  int pop(){
        if(this.top == null){
            throw new NullPointerException("This is an empty stack");
        }
        Node temp = this.top;
        this.top =this.top.next;
        temp.next=null;
        return temp.value;
    }

    //peek the top node
    public  int peek(){
        if(this.top == null){
            throw new NullPointerException("This is an empty stack");
        }
        return this.top.value;
    }
}
