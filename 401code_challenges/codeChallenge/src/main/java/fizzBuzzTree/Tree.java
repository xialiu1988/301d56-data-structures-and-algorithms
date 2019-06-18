package fizzBuzzTree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public Node root;

    public Tree(){
        this.root=null;
    }

    public Tree(Node node){
        this.root=node;
    }

    //preorder
    public List<Object> traverseHelper(Node node,List<Object> values){
        values.add(node.value);
        if(node.leftChild!=null){
            traverseHelper(node.leftChild,values);
        }
        if(node.rightChild!=null){
            traverseHelper(node.rightChild,values);
        }
        return values;
    }



    public Object[] preOrder(){
        List<Object> list = new ArrayList<>();
        if(this.root!=null){
            traverseHelper(this.root,list);
        }
        return list.toArray();
    }


}
