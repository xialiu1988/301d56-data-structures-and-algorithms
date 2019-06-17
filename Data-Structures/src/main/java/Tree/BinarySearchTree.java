package Tree;

public class BinarySearchTree extends Tree {
    private Node root;
    @Override
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    //helper to add node to the tree
    private Node addRecrusive(Node cur,int val){
        if(cur==null){
            return new Node(val);
        }

        if(val<cur.getValue()){

            cur.setLeftChild(addRecrusive(cur.getLeftChild(),val));
        }
        else if(val>cur.getValue()){
            cur.setRightChild(addRecrusive(cur.getRightChild(),val));
        }
        else{
            return cur;
        }
        return cur;
    }


    //add a node to the tree
    public void add(int val){
        root = addRecrusive(root,val);
    }


    //contains certain value
    public boolean contains(int val){
        return containsValue(root,val);
    }

    //helper function to check if the tree contains the value

    private boolean containsValue(Node cur,int val){
        if(cur == null)return false;
        if(cur.getValue()==val) return true;
        return val<cur.getValue()?containsValue(cur.getLeftChild(),val):containsValue(cur.getRightChild(),val);
    }


}
