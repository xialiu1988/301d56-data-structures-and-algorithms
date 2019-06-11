package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
/*  Can successfully push onto a stack
    Can successfully push multiple values onto a stack
    Can successfully pop off the stack
    Can successfully empty a stack after multiple pops
    Can successfully peek the next item on the stack
    Can successfully instantiate an empty stack
    */

//Can successfully push onto a stack
    @Test
    public void pushToAStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        assertEquals("The top should be 3",3,s.top.value);
        s.push(44);
        assertEquals("The top should be 44",44,s.top.value);
    }
    //Can successfully push multiple values onto a stack
    @Test
    public void pushMultipleValuesToAStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        assertEquals("The top should be 3",3,s.top.value);
        s.push(44);
        s.push(5);
        s.push(16);
        assertEquals("The top should be 44",16,s.top.value);
        assertEquals("The top should be 44",5,s.top.next.value);
        assertEquals("The top should be 44",44,s.top.next.next.value);
        assertEquals("The top should be 44",3,s.top.next.next.next.value);
    }

    //can push to an empty stack
    @Test
    public void pushToAnEmptyStack() {
        Stack s = new Stack();
        s.push(44);
        assertEquals("The top should be 44",44,s.top.value);
    }

   // Can successfully pop off the stack
    @Test
    public void popOffTheStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.push(45);
        assertEquals("The pop should give you the top node value which is 45",45, s.pop());
    }

    // Can successfully empty a stack after multiple pops
    @Test
    public void popToEmptyStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.push(45);
        s.pop();//pop the 45
        s.pop();//pop the 3 and should be empty now
        assertTrue("The top should be null",s.top ==null);
    }

    //Can successfully peek the next item on the stack
    @Test
    public void peek() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.push(45);
        assertTrue("Peek should give you the 45",s.peek()==45);
    }
    //Can successfully instantiate an empty stack
    @Test
    public void canInstantiateEmptyStack(){
        Stack s = new Stack();
        assertTrue("should be a null stack", s.top ==null);
    }

    //canNotPeekAnEmptyStack
    @Test(expected = NullPointerException.class)
    public void peekFromEmptyStack(){
        Stack s = new Stack();
        s.peek();
    }

    //canNotPopAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void popFromEmptyStack(){
        Stack s = new Stack();
        s.pop();
    }
}