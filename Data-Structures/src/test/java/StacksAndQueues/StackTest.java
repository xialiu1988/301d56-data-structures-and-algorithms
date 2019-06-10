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
        assertEquals("The top should be 3",3,s.Top.value);
        s.Push(44);
        assertEquals("The top should be 44",44,s.Top.value);
    }
    //Can successfully push multiple values onto a stack
    @Test
    public void pushMultipleValuesToAStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        assertEquals("The top should be 3",3,s.Top.value);
        s.Push(44);
        s.Push(5);
        s.Push(16);
        assertEquals("The top should be 44",16,s.Top.value);
        assertEquals("The top should be 44",5,s.Top.next.value);
        assertEquals("The top should be 44",44,s.Top.next.next.value);
        assertEquals("The top should be 44",3,s.Top.next.next.next.value);
    }

    //can push to an empty stack
    @Test
    public void pushToAnEmptyStack() {
        Stack s = new Stack();
        s.Push(44);
        assertEquals("The top should be 44",44,s.Top.value);
    }

   // Can successfully pop off the stack
    @Test
    public void popOffTheStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.Push(45);
        assertEquals("The pop should give you the top node value which is 45",45, s.Pop());
    }

    // Can successfully empty a stack after multiple pops
    @Test
    public void popToEmptyStack() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.Push(45);
        s.Pop();//pop the 45
        s.Pop();//pop the 3 and should be empty now
        assertTrue("The top should be null",s.Top==null);
    }

    //Can successfully peek the next item on the stack
    @Test
    public void peek() {
        Node n = new Node(3);
        Stack s = new Stack(n);
        s.Push(45);
        assertTrue("Peek should give you the 45",s.Peek()==45);
    }
    //Can successfully instantiate an empty stack
    @Test
    public void canInstantiateEmptyStack(){
        Stack s = new Stack();
        assertTrue("should be a null stack", s.Top==null);
    }

    //canNotPeekAnEmptyStack
    @Test(expected = NullPointerException.class)
    public void peekFromEmptyStack(){
        Stack s = new Stack();
        s.Peek();
    }

    //canNotPopAnEmptyQueue
    @Test(expected = NullPointerException.class)
    public void popFromEmptyStack(){
        Stack s = new Stack();
        s.Pop();
    }
}