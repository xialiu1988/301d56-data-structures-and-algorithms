package QueueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
   //can enqueue a value
    @Test
    public void enqueue() {
        PseudoQueue q = new PseudoQueue();
        q.enqueue(20);
        q.enqueue(15);
        q.enqueue(10);
        assertEquals("Front should be 20",20,q.front.value);
        assertEquals("Rear should be 10",10,q.rear.value);
    }
 //can dequeue the front value from the pseudoqueue
    @Test
    public void dequeue() {
        PseudoQueue q = new PseudoQueue();
        q.enqueue(20);
        q.enqueue(15);
        q.enqueue(10);
        assertEquals("Should get back the front value 20",20,q.dequeue());
        //second time dequeue
        assertEquals("Should get back the front value 15",15,q.dequeue());
    }



    //cannot Dequeue the empty pseudoQueue
    @Test(expected = NullPointerException.class)
    public void cannotDequeueEmptyPseudoQueue(){
        PseudoQueue q = new PseudoQueue();
        q.dequeue();
    }

}