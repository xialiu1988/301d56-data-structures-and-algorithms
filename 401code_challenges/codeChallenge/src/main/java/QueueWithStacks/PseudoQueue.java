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
     if(front==null){
       stack.push(value);
       front =stack.Top;
       rear = stack.Top;
   }
     else{
        while(stack.Top!=null){
            holder.push(stack.pop());
        }

       stack.push(value);
       rear = stack.Top;

     while(holder.Top!=null){
         stack.push(holder.pop());
     }

     }
    }



    //dequeue from pseudoQueue
    public int dequeue(){
        if(front==null){
            throw new NullPointerException("This is an empty pseudoQueue");
        }

       return stack.pop();
    }
}
