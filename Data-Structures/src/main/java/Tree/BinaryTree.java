package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree extends Tree {
    @Override
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node root;

    //create a binarytree
    public void createTree()
    {
        root=new Node(3);
        root.setLeftChild(new Node(40));
        root.setRightChild(new Node(17));
        root.getLeftChild().setLeftChild(new Node(5));
        root.getLeftChild().setRightChild(new Node(11));
        root.getRightChild().setLeftChild(new Node(26));
        root.getRightChild().setRightChild(new Node(7));
    }

    //breadth first traversal

    public List<Node> breadthTraverse(BinaryTree tree ) {
        List<Node> list = new ArrayList<>();
        if(tree.root==null)return list;
        LinkedList<Node> q = new LinkedList<>();
        q.add(tree.root);
        while (q.size() != 0) {

            Node n = q.removeFirst();
            list.add(n);

            if (n.getLeftChild() != null) {
                q.add(n.getLeftChild());
            }
            if (n.getRightChild() != null) {
                q.add(n.getRightChild());
            }

        }
        return list;

    }



}
