package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest extends Tree {

    //Can successfully instantiate an empty tree
    @Test
   public  void canCreateNullTree(){
        Tree tr = new Tree();
        assertTrue("empty tree",tr.getRoot()==null);
    }

   //Can successfully instantiate a tree with a single root node

    @Test
    public  void canCreateOneNodeTree(){
        Tree tr = new Tree(3);
        assertTrue("Root's value is 3 ",tr.getRoot().getValue()==3);
    }

  //Can successfully add a left child and right child to a single root node
  @Test
  public  void canCreateTree(){
      Tree tr = new Tree(3);
      tr.getRoot().setLeftChild(new Node(4));
      tr.getRoot().setRightChild(new Node(50));
      assertTrue("Root's value is 3 ",tr.getRoot().getValue()==3);
      assertTrue("Left child has value 4",tr.getRoot().getLeftChild().getValue()==4);
      assertTrue("Right child has value 50",tr.getRoot().getRightChild().getValue()==50);
  }

  //Can successfully return a collection from a preorder traversal
    @Test
    public void preOrder() {
       Tree tr = new BinaryTree();
       ((BinaryTree) tr).createTree();
       List<Integer> res= tr.preOrder(tr.getRoot(), new ArrayList<>() {
       });
       assertEquals("res should have root value 3",3,res.get(0).intValue()) ;
       assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getValue()));
       assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getValue()));
       assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getLeftChild().getValue()));
       assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getRightChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getRightChild().getValue()));

    }


//Can successfully return a collection from an inorder traversal
    @Test
    public void inOrder() {
        Tree tr = new BinaryTree();
        ((BinaryTree) tr).createTree();
        List<Integer> res= tr.inOrder(tr.getRoot(), new ArrayList<>() {
        });
        assertEquals("res should have root value 5",5,res.get(0).intValue()) ;
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getRightChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getRightChild().getValue()));

    }
  //Can successfully return a collection from a postorder traversal

    @Test
    public void postOrder() {
        Tree tr = new BinaryTree();
        ((BinaryTree) tr).createTree();
        List<Integer> res= tr.postOrder(tr.getRoot(), new ArrayList<>() {
        });
        assertEquals("res should have root value 5",5,res.get(0).intValue()) ;
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getLeftChild().getRightChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getLeftChild().getValue()));
        assertTrue("should contain the value in the tree",res.contains(tr.getRoot().getRightChild().getRightChild().getValue()));

    }



}