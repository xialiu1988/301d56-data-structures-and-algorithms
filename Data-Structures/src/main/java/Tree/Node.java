package Tree;

public class Node {
     private int value;
     private Node rightChild;
     private Node leftChild;
//constructor
     public Node(){}
     public Node(int val){
         this.value=val;
         this.rightChild=null;
         this.leftChild=null;
     }

//getters
    public int getValue() {
        return value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

//setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
}
