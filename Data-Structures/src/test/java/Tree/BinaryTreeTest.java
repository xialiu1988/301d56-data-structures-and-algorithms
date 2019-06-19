package Tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest extends Tree {


    //can breadth Traverse the bt
    @Test
    public void breadthTraverse() {

        Tree tr = new BinaryTree();
       tr.setRoot(new Node(4));
       tr.getRoot().setLeftChild(new Node(50));
       tr.getRoot().setRightChild(new Node(13));
       List<Node> list = ((BinaryTree) tr).breadthTraverse((BinaryTree) tr);
       assertTrue("the first node should be root",list.get(0).getValue()==4);
       assertTrue("the second should be left child",list.get(1).getValue()==50);
        assertTrue("the third should be right child",list.get(2).getValue()==13);
    }


    //can breadth Traverse the not balance bt
    @Test
    public void breadthTraverseNonBalanceTree() {

        Tree tr = new BinaryTree();
        tr.setRoot(new Node(4));
        tr.getRoot().setLeftChild(new Node(50));
        tr.getRoot().setRightChild(new Node(13));
        tr.getRoot().getLeftChild().setLeftChild(new Node(20));
        tr.getRoot().getLeftChild().setRightChild(new Node(2));
        List<Node> list = ((BinaryTree) tr).breadthTraverse((BinaryTree) tr);
        assertTrue("the first node should be root",list.get(0).getValue()==4);
        assertTrue("the second should be left child",list.get(1).getValue()==50);
        assertTrue("the third should be right child",list.get(2).getValue()==13);
        assertTrue("the third should be right child",list.get(3).getValue()==20);
        assertTrue("the third should be right child",list.get(4).getValue()==2);
    }





}