package treeIntersection;

public class TreeNode {
    public int value ;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int val)
    {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
