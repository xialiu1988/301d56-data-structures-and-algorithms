package StacksAndQueues;

public class Queue {

    public  Node front;
    public  Node rear;

    public  Queue(Node node){
       this.front = node;
       this.rear = node;

    }

    public Queue(){

    }

    //Enqueue to a queue
    public void enqueue(int value){
        if(this.rear ==null){
            Node node = new Node(value);
            this.front = node;
            this.rear = node;
        }
        else {
            Node node = new Node(value);
            this.rear.next = node;
            this.rear = node;
        }
    }

    //Dequeue a Node from the queue
    public int dequeue(){
        if(this.front ==null){
            throw new NullPointerException("This is an empty Queue");
        }
        Node temp = this.front;
        this.front = this.front.next;
        temp.next=null;
        return temp.value;
    }


    //peek
    public int peek(){
        if(this.front ==null){
            throw new NullPointerException("This is an empty Queue");
        }
        return this.front.value;
    }
}
