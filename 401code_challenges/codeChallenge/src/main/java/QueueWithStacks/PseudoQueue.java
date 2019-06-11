package QueueWithStacks;

public class PseudoQueue {
   public  Node front;
   public  Node rear;
   public  Stack stack;
   public  Stack holder;
   //constructor for empty pseudoqueue
    public PseudoQueue(){
        stack = new Stack();
        holder = new Stack();
    }

    //instantiate with a value
    public PseudoQueue(int val){
        stack.push(val);
        this.front =this.stack.Top;
        this.rear = this.stack.Top;
    }


    //Enqueue a value to the pseduQueue
    public void enqueue(int value){
     if(this.front==null){
      this.stack.push(value);
       this.front =this.stack.Top;
       this.rear = this.stack.Top;
   }
     else{
        while(this.stack.Top!=null){
            this.holder.push(this.stack.pop());
        }

       this.stack.push(value);
       this.rear = this.stack.Top;

     while(this.holder.Top!=null){
         this.stack.push(this.holder.pop());
     }

     }
    }



    //dequeue from pseudoQueue
    public int dequeue(){
        if(this.front==null){
            throw new NullPointerException("This is an empty pseudoQueue");
        }

       return this.stack.pop();
    }
}
