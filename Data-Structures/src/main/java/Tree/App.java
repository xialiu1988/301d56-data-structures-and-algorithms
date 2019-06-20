package Tree;

import java.util.ArrayList;
import java.util.List;

public class App {
    public  static void main(String[] args){
        Tree tr = new BinaryTree();
        ((BinaryTree) tr).createTree();

        List<Integer> list1 = tr.preOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
                list1 ) {
            System.out.println(a);
        }

        System.out.println("++++++++++++++++");

      List<Integer> list2 = tr.inOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
            list2 ) {
            System.out.println(a);
        }
        System.out.println("++++++++++++++++");

        List<Integer> list3 = tr.postOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
                list3 ) {
            System.out.println(a);
        }

        System.out.println("+++++++Breadth First++++++++");

        List<Node> list4 = ((BinaryTree) tr).breadthTraverse((BinaryTree)tr);

        for(Node n : list4){
            System.out.println(n.getValue());
        }

        System.out.println("+++++++Max value++++++++");

     int a = ((BinaryTree) tr).findmaximumvalue(((BinaryTree) tr).getRoot());
     System.out.println(a);


    }
}
