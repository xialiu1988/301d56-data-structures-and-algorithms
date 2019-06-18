package fizzBuzzTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
  //empty tree
    @Test
    public void canTestEmptyTree() {
     Tree tr = new Tree();
    Tree res = App.fizzBuzzTree(tr.root,tr);
    assertTrue("res tree is null",res.root==null);

    }

    //can check fizzbuzz tree
    @Test
    public void canTestNotEmptyTree() {
        Tree tr = new Tree();
        tr.root=new Node(5);
        tr.root.leftChild=new Node(15);
        Tree res = App.fizzBuzzTree(tr.root,tr);
        assertTrue("The first node of return tree is Buzz",res.root.value=="Buzz");
        assertTrue("The leftChild will turn to fizzbuzz",res.root.leftChild.value=="FizzBuzz");
    }

    //can keep the number as number if it can divided by 3/5/15
    @Test
    public void canTestTree() {
        Tree tr = new Tree();
        tr.root=new Node(5);
        tr.root.leftChild=new Node(11);
        Tree res = App.fizzBuzzTree(tr.root,tr);
        assertTrue("The first node of return tree is Buzz",res.root.value=="Buzz");
        assertTrue("The leftChild will keep the original value",(int)res.root.leftChild.value==11);
    }

}