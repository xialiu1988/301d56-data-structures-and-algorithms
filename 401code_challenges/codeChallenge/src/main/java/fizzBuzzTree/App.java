package fizzBuzzTree;

public class App {


    public static void main(String[] args){
        Tree tr = new Tree();
        tr.root=new Node(5);
        tr.root.leftChild=new Node(15);
        tr.root.rightChild=new Node(3);
        tr.root.leftChild.leftChild=new Node(9);
        Object[] r = tr.preOrder();
        for(Object o:r){
            System.out.println(o);
        }
          Tree res = fizzBuzzTree(tr);
    }


    public static Tree fizzBuzzTree(Tree tr){


        



    }
}
