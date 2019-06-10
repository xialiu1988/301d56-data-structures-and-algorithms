package StacksAndQueues;

public class Stack {

    public Node Top;

    public Stack(Node node){
        this.Top = node;
    }

    //empty stack
    public Stack(){

    }


    //push to a stack
    public void Push(int value){
        Node node = new Node(value);
        node.next = this.Top;
        this.Top = node;
    }

    //pop a node from the stack
    public  int Pop(){
        if(this.Top == null){
            throw new NullPointerException("This is an empty stack");
        }
        Node temp = this.Top;
        this.Top=this.Top.next;
        temp.next=null;
        return temp.value;
    }

    //peek the top node
    public  int Peek(){
        if(this.Top == null){
            throw new NullPointerException("This is an empty stack");
        }
        return this.Top.value;
    }
}
