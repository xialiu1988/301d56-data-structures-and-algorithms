package Tree;

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

}
