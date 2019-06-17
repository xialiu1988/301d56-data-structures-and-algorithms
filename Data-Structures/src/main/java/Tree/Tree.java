package Tree;

import java.util.ArrayList;
import java.util.List;

  public class Tree {
    private Node root;
    public Tree(){}
    public Tree(int val){
        this.root=new Node(val);
   }


    public List<Integer> preOrder(Node node,List<Integer> list){
        if(node!=null){
            list.add(node.getValue());
            preOrder(node.getLeftChild(),list);
            preOrder(node.getRightChild(),list);
        }
        return list;
    }

    public List<Integer> inOrder(Node node,List<Integer> list){
        if(node!=null){
            inOrder(node.getLeftChild(),list);
             list.add(node.getValue());
            inOrder(node.getRightChild(),list);
        }
        return list;
    }

    public List<Integer> postOrder(Node node,List<Integer> list){
        if(node!=null){
            postOrder(node.getLeftChild(),list);
            postOrder(node.getRightChild(),list);
            list.add(node.getValue());
        }
        return list;
    }

    public Node getRoot(){
        return root;
    }
    public void setRoot(Node root){
        this.root=root;
    }

}
