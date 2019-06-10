package StacksAndQueues;

import java.security.PublicKey;

public class Queue {

    public  Node Front;
    public  Node Rear;

    public  Queue(Node node){
       this.Front = node;
       this.Rear = node;

    }

    public Queue(){

    }

    //Enqueue to a queue
    public void Enqueue(int value){
        if(this.Rear==null){
            Node node = new Node(value);
            this.Front = node;
            this.Rear = node;
        }
        else {
            Node node = new Node(value);
            this.Rear.next = node;
            this.Rear = node;
        }
    }

    //Dequeue a Node from the queue
    public int Dequeue(){
        if(this.Front==null){
            throw new NullPointerException("This is an empty Queue");
        }
        Node temp = this.Front;
        this.Front = this.Front.next;
        temp.next=null;
        return temp.value;
    }


    //peek
    public int Peek(){
        if(this.Front==null){
            throw new NullPointerException("This is an empty Queue");
        }
        return this.Front.value;
    }
}
