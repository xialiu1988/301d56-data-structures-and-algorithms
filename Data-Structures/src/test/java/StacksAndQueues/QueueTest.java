package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;
/*Can successfully enqueue into a queue
Can successfully enqueue multiple values into a queue
Can successfully dequeue out of a queue the expected value
Can successfully peek into a queue, seeing the expected value
Can successfully empty a queue after multiple dequeues
Can successfully instantiate an empty queue
*/
public class QueueTest {

    //Can successfully enqueue into a queue
    @Test
    public void enqueueToaQueue() {
        Queue q = new Queue();
        q.enqueue(4);
        assertEquals("Queue should have front node value 4",4,q.front.value);
    }
   // Can successfully enqueue multiple values into a queue
   @Test
   public void enqueueMultipleValuesToaQueue() {
       Queue q = new Queue();
       q.enqueue(4);
       q.enqueue(56);
       q.enqueue(13);

       assertEquals("Queue should have front node value 4",4,q.front.value);
       assertEquals("Queue should have front node value 4",56,q.front.next.value);
       assertEquals("Queue should have rear node value 4",13,q.rear.value);
   }

   // Can successfully dequeue out of a queue the expected value
    @Test
    public void canDequeueFromAQueue() {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(56);
        assertEquals("Dequeue should give you back the front node value",4,q.dequeue());
    }
    //Can successfully peek into a queue, seeing the expected value
    @Test
    public void canPeekAQueue() {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(56);
        assertEquals("Dequeue should give you back the front node value",4,q.peek());
    }
    // Can successfully dequeue out of a queue the expected value
    @Test
    public void canDequeueUntilEmptyQueue() {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(56);
        q.dequeue();
        q.dequeue();
        assertTrue("Now the front should be null node",q.front == null);
    }
    //Can successfully instantiate an empty queue
    @Test
    public void instantiateEmptyQueue() {
        Queue q = new Queue();
        assertTrue("Now the front should be null node",q.front == null);
    }
    //canNotPeekAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void peekFromEmptyQueue(){
        Queue q = new Queue();
        q.peek();
    }

    //canNotDequeueAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void dequeueFromEmptyQueue(){
        Queue q = new Queue();
        q.dequeue();
    }
}