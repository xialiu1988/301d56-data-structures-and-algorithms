package QueueWithStacks;

public class Stack {

    public Node Top;
    public Stack(Node node){
        this.Top = node;
    }
    public  Stack(){

    }

    //push
    public void push(int val){
        Node n = new Node(val);
        n.next = this.Top;
        this.Top = n;
    }

    //pop
    public int pop(){
        if(this.Top == null){
            throw new NullPointerException("This is empty stack");
        }
        Node temp = this.Top;
        this.Top = this.Top.next;
        temp.next = null;
        return temp.value;
    }

    //peek the top node
    public  int peek(){
        if(this.Top == null){
            throw new NullPointerException("This is an empty stack");
        }
        return this.Top.value;
    }
}
