package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void add() {
        Tree tr = new BinarySearchTree();
        ((BinarySearchTree) tr).add(4);
        assertEquals("the tree should have root which holds value 4",4,tr.getRoot().getValue());
        ((BinarySearchTree) tr).add(88);
        assertEquals("the tree should have right child now value is 88",88,tr.getRoot().getRightChild().getValue());
        ((BinarySearchTree) tr).add(2);
        assertEquals("the tree should have left child now value is 2",2,tr.getRoot().getLeftChild().getValue());
    }

    @Test
    public void contains() {
        Tree tr = new BinarySearchTree();
        ((BinarySearchTree) tr).add(59);
        ((BinarySearchTree) tr).add(9);
        ((BinarySearchTree) tr).add(49);
        ((BinarySearchTree) tr).add(29);
        ((BinarySearchTree) tr).add(16);

        assertTrue("this tree contains node's value 29",((BinarySearchTree) tr).contains(29));
        assertFalse("this tree Does not contain node's value 109",((BinarySearchTree) tr).contains(109));
    }
}