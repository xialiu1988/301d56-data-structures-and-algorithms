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
        q.Enqueue(4);
        assertEquals("Queue should have front node value 4",4,q.Front.value);
    }
   // Can successfully enqueue multiple values into a queue
   @Test
   public void enqueueMultipleValuesToaQueue() {
       Queue q = new Queue();
       q.Enqueue(4);
       q.Enqueue(56);
       q.Enqueue(13);

       assertEquals("Queue should have front node value 4",4,q.Front.value);
       assertEquals("Queue should have front node value 4",56,q.Front.next.value);
       assertEquals("Queue should have rear node value 4",13,q.Rear.value);
   }

   // Can successfully dequeue out of a queue the expected value
    @Test
    public void canDequeueFromAQueue() {
        Queue q = new Queue();
        q.Enqueue(4);
        q.Enqueue(56);
        assertEquals("Dequeue should give you back the front node value",4,q.Dequeue());
    }
    //Can successfully peek into a queue, seeing the expected value
    @Test
    public void canPeekAQueue() {
        Queue q = new Queue();
        q.Enqueue(4);
        q.Enqueue(56);
        assertEquals("Dequeue should give you back the front node value",4,q.Peek());
    }
    // Can successfully dequeue out of a queue the expected value
    @Test
    public void canDequeueUntilEmptyQueue() {
        Queue q = new Queue();
        q.Enqueue(4);
        q.Enqueue(56);
        q.Dequeue();
        q.Dequeue();
        assertTrue("Now the front should be null node",q.Front == null);
    }
    //Can successfully instantiate an empty queue
    @Test
    public void instantiateEmptyQueue() {
        Queue q = new Queue();
        assertTrue("Now the front should be null node",q.Front == null);
    }
    //canNotPeekAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void peekFromEmptyQueue(){
        Queue q = new Queue();
        q.Peek();
    }

    //canNotDequeueAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void dequeueFromEmptyQueue(){
        Queue q = new Queue();
        q.Dequeue();
    }
}